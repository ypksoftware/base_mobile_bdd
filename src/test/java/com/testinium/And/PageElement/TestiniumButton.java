package com.testinium.And.PageElement;

import com.testinium.And.Backend.MobileAutomationException;
import org.openqa.selenium.WebElement;import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestiniumButton extends PageElementModel {
    private static final Log log = LogFactory.getLog(TestiniumButton.class);
    public TestiniumButton(selectorNames selectorName, String selectorValue) {
        super(selectorName, selectorValue);
    }

    public void click(){
        log.info("ABOUT TO CLICK BUTTON " + getLoggingName());
        WebElement me = getAnElement();
        try {
            me.click();
        } catch (Exception e) {
            String error = "COULD NOT CLICK BUTTON: " + getLoggingName();
            log.error(error);
            throw new MobileAutomationException(error);
        }
    }


}
