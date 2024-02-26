package com.testinium.And.Util.Driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static final String APPPACKAGE = "com.mobisoft.kitapyurdu";
    public static final String APPACTIVITY = "com.mobisoft.kitapyurdu.main.SplashActivity";

    public static AndroidDriver getDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        // Platform ve cihaz bilgileri
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");

        // Uygulama bilgileri
        options.setAppPackage(APPPACKAGE);
        options.setAppActivity(APPACTIVITY);

        // Otomasyon motoru
        options.setAutomationName("UiAutomator2");

        // AVD adı (isteğe bağlı)
        options.setAvd("Pixel_4");

        // Appium server URL
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    }
}
