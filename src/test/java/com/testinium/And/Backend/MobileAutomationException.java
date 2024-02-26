package com.testinium.And.Backend;

import com.testinium.And.Util.Driver.Driver;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class MobileAutomationException extends RuntimeException{
    private static final Log log = LogFactory.getLog(MobileAutomationException.class);

    public MobileAutomationException (String message){
        super(message);
        File scrFile = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
        String filePath = "screenshots\\screenshot " + TestiniumAutomationContext.getContextValue(ContextKeys.CASENAME) + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String description = "MOBILE AUTOMATION FAILED AT STEP: " + TestiniumAutomationContext.getContextValue(ContextKeys.STEPNAME) + " WITH EXCEPTION MESSAGE: " + message;
        log.info(description);
        TestiniumAutomationContext.addContext(ContextKeys.EXCEPTION, description);
        TestiniumAutomationContext.addContext(ContextKeys.SSLINK, filePath);

    }
}
