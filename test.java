package testcases;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.time.LocalDate;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class test {

	private static final String Back = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//opening Hotel App Website
		System.setProperty("webdriver.chrome.driver", "C:\\Mehatab Shaikh\\Workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String baseURL= "http://adactinhotelapp.com";
		//driver.get(baseURL);
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		//New User Register Here
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		driver.findElement(By.linkText("New User Register Here")).click();
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Go back to Login page")).click();
		driver.findElement(By.id("username")).sendKeys("rorytemper");
		driver.findElement(By.id("password")).sendKeys("rory@123");
		driver.findElement(By.id("re_password")).sendKeys("rory@123");
		driver.findElement(By.id("full_name")).sendKeys("rorytemper");
		driver.findElement(By.id("email_add")).sendKeys("rorytemp0981@gmail.com");
		
		WebElement we=driver.findElement(By.id("tnc_box"));
		we.click();
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Terms & Conditions")).click();
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		//Closing current tab
		//driver.switchTo().window("http://adactinhotelapp.com/Register.php");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.id("Submit")).click();
		//driver.findElement(By.id("Reset")).click();
		/* //Forgot Password
		
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//Go Back To Login Page
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Go back to Login page")).click();
		//driver.findElement(By.id("Reset")).click();
		
		//Forgot Password Form
		driver.findElement(By.id("emailadd_recovery")).sendKeys("rorytemp098@gmail.com");
		driver.findElement(By.id("Submit")).click();
		
		//Click Here To Login
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click here to login")).click();
		 //A. Login Page
		driver.findElement(By.id("username")).sendKeys("rorytemp");
		driver.findElement(By.id("password")).sendKeys("rory@123");
		driver.findElement(By.id("login")).click();
		
		//B. Search Hotel Page
		//1.Location
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByIndex(6);
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);	
		//loc.selectByVisibleText("Sydney");
		
		//2.Hotels
		Select h = new Select(driver.findElement(By.id("hotels")));
		h.selectByIndex(2);
		//driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);	
		//loc.selectByVisibleText("Sydney");
		
		//3.Room Type
		Select rt = new Select(driver.findElement(By.id("room_type")));
		rt.selectByIndex(3);
		
		//4.Number Of Rooms
		Select nr = new Select(driver.findElement(By.id("room_nos")));
		nr.selectByIndex(4);
		
		//5. Check In Date
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("10/09/2021");
		
		//5. Check out Date
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("15/09/2021");
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		//5.Adults Per Room
		Select ar = new Select(driver.findElement(By.id("adult_room")));
		ar.selectByIndex(2);
		
		//6.Childs Per Room
		Select cr = new Select(driver.findElement(By.id("child_room")));
		cr.selectByIndex(1);
		
		//7.Search And Reset
		driver.findElement(By.id("Submit")).click();
		//driver.findElement(By.id("Reset")).click();
		
		
		//C. Select Hotel
		driver.findElement(By.id("radiobutton_0")).click();
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		//driver.findElement(By.id("cancel")).click();
		driver.findElement(By.id("continue")).click();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	
		//driver.findElement(By.linkText("Back")).click();
		
		
		//D. Book Hotel
		driver.findElement(By.id("first_name")).sendKeys("Mongambo");
		driver.findElement(By.id("last_name")).sendKeys("Khush_Huaa");
		driver.findElement(By.id("address")).sendKeys("Lapata_Ganj");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
		Select ctype = new Select(driver.findElement(By.id("cc_type")));
		ctype.selectByIndex(3);
		Select cmonth = new Select(driver.findElement(By.id("cc_exp_month")));
		cmonth.selectByIndex(6);
		Select cyear = new Select(driver.findElement(By.id("cc_exp_year")));
		cyear.selectByIndex(11);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		driver.findElement(By.id("book_now")).click();
		//driver.findElement(By.id("cancel")).click();
		
		//E. Booking Confirmation Page
		//1. Search Hotel
		//driver.findElement(By.id("search_hotel")).click();
		//2. My Itinerary
		driver.findElement(By.id("my_itinerary")).click();
		//3. Logout
		//driver.findElement(By.id("logout")).click();
		
		//F. Booked Itinerary Page
		//driver.findElement(By.id("Ok")).click();
		//driver.findElement(By.id("btn_id_453503")).click();
		//driver.findElement(By.id("btn_id_453508")).click();
		//driver.findElement(By.id("Ok")).click();
		//1. Select Cancel Check box
		WebElement we=driver.findElement(By.id("btn_id_453508"));
		we.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		//2. Alert Notification
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//2. Search Hotel
		//driver.findElement(By.id("search_hotel")).click();
		//3. Logout
		//driver.findElement(By.id("logout")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.close();*/
	}
	
	

}
