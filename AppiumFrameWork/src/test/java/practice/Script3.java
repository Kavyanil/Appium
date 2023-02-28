package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Script3 {
	@Test
	public void launchApp() throws MalformedURLException
	{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.UDID, "8127bb7d");
	dc.setCapability("appPackage","com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
//	dc.setCapability("noReset", "true");
	URL url = new URL("http://localhost:4723/wd/hub");//same
	AndroidDriver driver = new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	String value = driver.findElementByXPath("//android.widget.Toast[1]").getText();
	System.out.println(value);
}
}


