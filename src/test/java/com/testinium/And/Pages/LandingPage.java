package com.testinium.And.Pages;


import com.testinium.And.PageElement.TestiniumButton;
import com.testinium.And.PageElement.TestiniumLabel;
import com.testinium.And.PageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Assert;

/**
 * Created By Yiğithan Kadıoğlu 23.10.2018
 * The LandingPage class implements an application that
 * simply displays "LandingPage Case Scenario" to the standard output.
 */
public class LandingPage extends TestiniumMasterPage {
    //region Variables
    private static final Log log = LogFactory.getLog(LandingPage.class);
    /*private static LandingPage instance;
    public static HomePage actualProfile;
    public String countryName;
    TVRemoteControl tvControl = new TVRemoteControl();*/
    private static TestiniumButton BTN_THCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]");
    private static TestiniumButton BTN_AUCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
    private static TestiniumButton BTN_NZCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]");
    private static TestiniumButton BTN_INDCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[4]");
    private static TestiniumButton BTN_SNGCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[5]");
    private static TestiniumButton BTN_MLSCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[6]");
    private static TestiniumButton BTN_PLPCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[7]");
    private static TestiniumButton BTN_HKCountry = new TestiniumButton(PageElementModel.selectorNames.XPATH, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[8]");
    private static TestiniumLabel LBL_OnAir = new TestiniumLabel(PageElementModel.selectorNames.ID, "com.beinsports.connect.apac:id/txtHeader");


    //endregion
    //region LandingPage instance
    /*public static synchronized LandingPage getInstance() {
        if (instance == null)
            instance = new LandingPage();
        return instance;
    }*/

    //endregion
    //region LandingPageExist
    public void isLandingePageTHExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_THCountry.isExist();
        Assert.assertTrue("Thailand görüntülenemedi.", isExist);
    }

    public void isLandingePageAUExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_AUCountry.isExist();
        Assert.assertTrue("Australia görüntülenemedi.", isExist);
    }

    public void isLandingePageNZExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_NZCountry.isExist();
        Assert.assertTrue("New Zealand görüntülenemedi.", isExist);
    }

    public void isLandingePageINDExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_INDCountry.isExist();
        Assert.assertTrue("Indonesia görüntülenemedi.", isExist);
    }

    public void isLandingePageNSGExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_SNGCountry.isExist();
        Assert.assertTrue("Singapore görüntülenemedi.", isExist);
    }

    public void isLandingePageMLSExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_MLSCountry.isExist();
        Assert.assertTrue("Malaysia görüntülenemedi.", isExist);
    }

    public void isLandingePagePLPExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_PLPCountry.isExist();
        Assert.assertTrue("Philippines görüntülenemedi.", isExist);
    }

    public void isLandingePageHKExists() {
        log.info("Controllling Country existence...");
        boolean isExist = BTN_HKCountry.isExist();
        Assert.assertTrue("Honk Kong görüntülenemedi.", isExist);
    }

    //endregion
    //region Landing Case Country Scenario
    public void clickCountry(String countryName) {

    }
        /*Driver.driver.findElementById("com.beinsports.connect.apac:id/loginOrProfile").getText();
        Assert.assertEquals(((AndroidElement) Driver.driver.findElementsById("com.beinsports.connect.apac:id/txtHeader").get(0)).getText(), "On Air Test");
        log.info("Anasayfa okundu");*/
    //endregion
}
