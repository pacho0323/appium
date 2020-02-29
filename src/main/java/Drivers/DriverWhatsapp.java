package Drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverWhatsapp {

    private static AppiumDriver<MobileElement> driver;

    public static DriverWhatsapp hisBrowserMovil() {
        try {
            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability("deviceName", "ZH33F22BF3");
            capabilities.setCapability("platformName", "ANDROID");
            capabilities.setCapability("appPackage", "com.whatsapp");
            capabilities.setCapability("appActivity", "com.whatsapp.HomeActivity");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyboard", true);
            driver= new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
            
        } catch (Exception e) {

        }
        return new DriverWhatsapp();
    }

    public AppiumDriver<MobileElement> Android() {
        return driver;
    }
}
