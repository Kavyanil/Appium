package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Script2 {
	
	@Test
	public void launchApp() throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities(); 
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	dc.setCapability(MobileCapabilityType.UDID, "8127bb7d");
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url = new URL("http://localhost:4723/wd/hub");//same
	AndroidDriver driver = new AndroidDriver(url, dc);
	MobileElement continuebutton = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/continue_button");
	driver.tap(1, continuebutton, 500);
	MobileElement okbtn = (MobileElement) driver.findElementById("android:id/button1");
	driver.tap(1, okbtn, 500);
	MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
	driver.tap(1, views, 500);
	MobileElement dragnddrop = (MobileElement) driver.findElementByAccessibilityId("Drag and Drop");
	driver.tap(1, dragnddrop, 500);
	
	MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	driver.tap(1, src, 500);
	MobileElement dst = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
	driver.tap(1, dst, 500);
	//TouchActions ta = new TouchActions(driver);
	
	TouchAction ta=new TouchAction(driver);
	

//ta.longPress(src).moveToElement(dst).release().perform();
	ta.longPress(src).moveTo(dst).release().perform();

	
	}
	

}

