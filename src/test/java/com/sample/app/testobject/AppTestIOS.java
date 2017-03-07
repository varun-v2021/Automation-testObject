package com.sample.app.testobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
/*import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;


import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.*;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTestIOS {

    private AppiumDriver driver;

    @SuppressWarnings("rawtypes")
    @BeforeMethod
    public void setUp() {
        try {
            System.out.println(">>>>>>>>>>>>>>> ios 1");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            /*
             * These are the capabilities we must provide to run our test on
             * TestObject
             */
            System.out.println(">>>>>>>>>>>>>>> ios 2");
            // capabilities.setCapability("testobject_api_key",
            // "7A28BAF4C3244E73B1AD434E68A92E1B");
            // capabilities.setCapability("testobject_api_key",
            // "4F05B2FA27CD4B1693FFA5FEB14D69ED"); //W
            //capabilities.setCapability("testobject_api_key", "FA11A7CB2EB8402FA78710E236F30FD7"); //twc - ios app
            capabilities.setCapability("testobject_api_key", "485719545CC940E4810286275A775716"); //photo app
            capabilities.setCapability("testobject_app_id", "1"); // W
            // capabilities.setCapability("testobject_device",
            // "LG_Nexus_4_E960_real");
            capabilities.setCapability("testobject_device", "iPhone_5_16GB_real"); // W
            // capabilities.setCapability("app-package",
            // "com.gamoper.candyfever.free");
            //capabilities.setCapability("bundleId", "com.timewarnercable.simulcast"); // twc - ios app
            //capabilities.setCapability("bundleId", "com.thegreatphotoapp.iPhone"); // photo app
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "9.3.3");
            // capabilities.setCapability("app",
            // "/tmp/09ef5403-011a-4caa-ab26-fea58ee5ef13_resigned.ipa");
            // capabilities.setCapability("app",
            // "/tmp/apks-LG_Nexus_5X_real/com.gamoper.candyfever.free.apk");
            // capabilities.setCapability("app",
            // "/tmp/apks-LG_Nexus_5X_real/com.TWCableTV.apk");
            // capabilities.setCapability("activityName",
            // "com.gamoper.candyfever.free.AppActivity");
            // capabilities.setCapability("activityName",
            // "com.twc.android.ui.login.SplashScreen");
            System.out.println(">>>>>>>>>>>>>>> ios 3");
            /*
             * The driver will take care of establishing the connection, so we
             * must provide it with the correct endpoint and the requested
             * capabilities.
             */

            driver = new IOSDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);
            // driver = new IOSDriver(new
            // URL("https://app.testobject.com:443/api/appium/wd/hub"),
            // capabilities);
            // driver = new AndroidDriver(new
            // URL("http://app.testobject.com:443/api/rest/appium/v1"),
            // capabilities);
            System.out.println(">>>>>>>>>>>>>>> ios 4");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void twoPlusTwoOperation() throws InterruptedException {
        // driver.launchApp();
        System.out.println(">>>>>>>>>>>>>>> ios 5");
        WebElement element = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]");
        element.click();
        System.out.println(">>>>>>>>>>>>>>> ios 6");
        Thread.sleep(5000);
        
        // ((AndroidDriver) driver).startActivity("com.gamoper.candyfever.free",
        // "com.gamoper.candyfever.free.AppActivity");
        /*
         * ((AndroidDriver) driver).startActivity("com.TWCableTV",
         * "com.twc.android.ui.login.SplashScreen"); System.out.println(
         * ">>>>>>>>>>>>>>>>> 5"); Thread.sleep(10000);
         * 
         * WebElement element =
         * driver.findElementById("com.TWCableTV:id/closeTourButton");
         * System.out.println(">>>>>>>>>>>>>>>>> 6"); element.click();
         */
        /*
         * Dimension size = driver.manage().window().getSize(); int endX = (int)
         * (size.width * 0.9); int startX = (int) (size.width * 0.9); int startY
         * = size.height; int endY = startY; driver.tap(1, startX, startY, 1);
         * //for(int i=0;i<6;i++) //driver.swipe(startX, startY, endX, endY, 1);
         * //driver.tap(1,
         * driver.findElement(By.xpath("android.widget.FrameLayout[@index='1']")
         * ), 1);
         */
        /*
         * System.out.println(">>>>>>>>>>>>>>>>> 7"); Thread.sleep(2000);
         */
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
