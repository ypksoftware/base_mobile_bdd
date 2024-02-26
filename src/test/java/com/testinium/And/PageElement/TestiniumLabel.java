package com.testinium.And.PageElement;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebElement;

public class TestiniumLabel extends PageElementModel {
    private static final Log log = LogFactory.getLog(TestiniumButton.class);
    public TestiniumLabel(selectorNames selectorName, String selectorValue) {
        super(selectorName, selectorValue);
    }

    public String getElementText(){
        log.info("Getting elements's text :" + getLoggingName());
        String elementText = "";
        WebElement me = getAnElement();
        elementText = me.getText();
        return  elementText;
    }
}
