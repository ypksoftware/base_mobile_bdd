package com.testinium.And.PageElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestiniumFrame extends PageElementModel {
    private static final Log log = LogFactory.getLog(TestiniumFrame.class);

    public TestiniumFrame(selectorNames selectorName, String selectorValue) {
        super(selectorName, selectorValue);
    }

    public String getFrame() {
        log.info("Getting elements's frame :" + getLoggingName());
        //TODO Frame eklenecek !!!
        return getFrame();
    }

}
