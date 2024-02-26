package com.testinium.And.Util.Driver;

import com.testinium.And.Backend.TestiniumAutomationContext;
import com.thoughtworks.gauge.*;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import com.testinium.And.Backend.ContextKeys;
import com.testinium.And.Util.Report.ExcelUtil;

public class Driver {
    public static AndroidDriver driver; // Generic AppiumDriver yerine AndroidDriver

    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {
        driver = DriverFactory.getDriver(); // DriverFactory'den güncellenmiş şekilde driver alma
        //TODO TİME DURATİON CHECK
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @BeforeScenario
    public void beforeScenario(ExecutionContext executionContext) {
        TestiniumAutomationContext.initializeContext();
        TestiniumAutomationContext.addContext(ContextKeys.CASENAME, executionContext.getCurrentScenario().getName());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        TestiniumAutomationContext.addContext(ContextKeys.STARTTIME, sdf.format(Calendar.getInstance().getTime()));
    }

    @BeforeStep
    public void beforeStep(ExecutionContext executionContext){
        TestiniumAutomationContext.addContext(ContextKeys.STEPNAME, executionContext.getCurrentStep().getText());
    }

    @AfterScenario
    public void afterScenario(ExecutionContext executionContext) {
        String currentContext = driver.getContext();
        if (!currentContext.equals("NATIVE_APP")) {
            driver.context("NATIVE_APP");
        }

        ExcelUtil excelUtil = ExcelUtil.getInstance();
        String domain = executionContext.getCurrentSpecification().getName();
        String testCase = executionContext.getCurrentScenario().getName();
        boolean isFailed = executionContext.getCurrentScenario().getIsFailing();
        String message = TestiniumAutomationContext.getContextValue(ContextKeys.EXCEPTION);
        String ssLink = TestiniumAutomationContext.getContextValue(ContextKeys.SSLINK);
        String loginData = TestiniumAutomationContext.getContextValue(ContextKeys.EMAIL);
        String startTime = TestiniumAutomationContext.getContextValue(ContextKeys.STARTTIME);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long startLong = 0L;
        try {
            startLong = sdf.parse(startTime).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long endLong = Calendar.getInstance().getTime().getTime();
        long durationLong = endLong - startLong;
        long durationSeconds = durationLong / 1000 % 60;
        long durationMinutes = durationLong / (60 * 1000) % 60;
        String duration = durationMinutes + ":" + durationSeconds;
        excelUtil.createReportSheet(domain, testCase, isFailed, message, ssLink, loginData, startTime, duration);

    }

    @AfterSuite
    public void closeDriver() {
        if (driver != null) {
            driver.quit(); // Driver nesnesi null değilse kapat.
        }
    }
}
