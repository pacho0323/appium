package driver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverAndroid {

	private static AppiumDriver<MobileElement> driver;
		
		public static DriverAndroid hisBrowserMovil() {
			try {

				String kobitonServerUrl = "https://pacho0323:e99fb87e-c671-4c9d-8a07-01abcaf7fddc@api.kobiton.com/wd/hub";

				DesiredCapabilities capabilities = new DesiredCapabilities(); 
				// The generated session will be visible to you only. 
				capabilities.setCapability("sessionName", "Automation test session");
				capabilities.setCapability("sessionDescription", ""); 
				capabilities.setCapability("deviceOrientation", "portrait");  
				capabilities.setCapability("captureScreenshots", true); 
				capabilities.setCapability("browserName", "chrome"); 
				capabilities.setCapability("deviceGroup", "KOBITON"); 
				// For deviceName, platformVersion Kobiton supports wildcard
				// character *, with 3 formats: *text, text* and *text*
				// If there is no *, Kobiton will match the exact text provided
				capabilities.setCapability("deviceName", "Galaxy J7 Prime");
				capabilities.setCapability("platformVersion", "6.0.1");
				capabilities.setCapability("platformName", "Android"); 		
		
				driver= new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
			} catch (Exception e) {

			}
			return new DriverAndroid();
		}
		
		public AppiumDriver<MobileElement> Android() {
			return driver;
		}
}
