package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Mehatab Shaikh\\Workspace\\cd\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL="https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		
	}
	
	

	@Test
	public void test() {
		driver.get(baseURL);
		
		//Sign in
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	
		driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("mehatabshaikh760@gmail.com");
		driver.findElement(By.id("continue")).click();

		//Otp 
		//driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		//driver.findElement(By.xpath(".//*[@id=\'nav-signin-tooltip\']/a/span")).click();
		
		//Sign in pwd
		
				driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Shaikhu_3727");
				driver.findElement(By.id("signInSubmit")).click();
				
				driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Boult Blutooth");
				driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
