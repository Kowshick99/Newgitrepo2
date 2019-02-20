package TestNGSAMPLE;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;		
public class MavenintegrationTestNG {		
	public String baseurl = "http://intranet.mmm.com/global-plm/";
	public WebDriver driver;
	
@BeforeClass
    public void LaunchApp() {
	String driverPath = "C:\\Users\\A2ZQTZZ\\Downloads\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driverPath);
	driver = new ChromeDriver();
}

@Test (priority = 0)

public void PLMHomePage() {
driver.get(baseurl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@href='https://plm.3m.com']")).click();
driver.findElement(By.xpath("//span[@class='ds-coachmark-close']")).click();
driver.quit();
}
}