package genericutiity;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class Baseclass {
	
	@BeforeSuite
	public void bs() {
		System.out.println(" connect to data base");
	}
	
	
	@BeforeTest
	public void bt() {
		System.out.println("execute paralell test");
	}

	
	@BeforeClass
	public void bc() {
		AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
		server.start();
	
		
	}
	
	@BeforeMethod
	public void bm() {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 12);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	}
}
