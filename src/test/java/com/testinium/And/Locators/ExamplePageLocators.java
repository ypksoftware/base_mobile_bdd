package com.testinium.And.Pages;


import com.testinium.And.PageElement.TestiniumButton;
import com.testinium.And.PageElement.TestiniumLabel;
import com.testinium.And.PageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Assert;

/**
 * Created By Yiğithan Kadıoğlu 23.10.2018
 * The ExamplePage class implements an application that
 * simply displays "ExamplePage Case Scenario" to the standard output.
 */
public class ExamplePage extends TestiniumMasterPage {

    //region Variables
    private static final Log log = LogFactory.getLog(ExamplePage.class);
    private static ExamplePage instance;

    private static TestiniumButton BTN_THCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]");
    private static TestiniumButton BTN_AUCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
    private static TestiniumButton BTN_NZCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]");
    private static TestiniumButton BTN_INDCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[4]");
    private static TestiniumButton BTN_SNGCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[5]");
    private static TestiniumButton BTN_MLSCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[6]");
    private static TestiniumButton BTN_PLPCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[7]");
    private static TestiniumButton BTN_HKCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[8]");
    private static TestiniumLabel LBL_OnAir = new TestiniumLabel(PageElementModel.selectorNames.ID, "com.beinsports.connect.apac:id/txtHeader");
    private static TestiniumButton BTN_HOMEPOPUPCLOSE = new TestiniumButton(PageElementModel.selectorNames.ID, "com.mobisoft.kitapyurdu:id/btn_ic_header_account");



    //endregion

    //region ExamplePage instance
    public static synchronized ExamplePage getInstance() {
        if (instance == null)
            instance = new ExamplePage();
        return instance;
    }

    //endregion
    //region ExamplePage Methods
    public void isExampleTest1Method() {
        BTN_HOMEPOPUPCLOSE.click();
    }
    public void isExampleTest2Method() {
        BTN_THCountry.click();
    }
    public void isExampleTest3Method() {
        BTN_THCountry.click();
    }
    //endregion
}
