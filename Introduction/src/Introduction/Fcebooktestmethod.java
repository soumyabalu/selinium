package Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcebooktestmethod {

	public static void sending1(WebDriver driver, String locator1,String value1) {
WebElement element1	 = driver.findElement(By.cssSelector(locator1));
element1.sendKeys(value1);
}

public static void sending2(WebDriver driver, String locator,String value) {
WebElement element2	 = driver.findElement(By.name(locator));
element2.sendKeys(value);
}
	// driver.findElement(By.partialLinkText("Forgot")).click();

//public static void sending3(WebDriver driver,String locator3,String value3) {
//WebElement element3 = driver.findElement(By.name(locator3));
//element3.sendKeys(value3);
//}
//public static void sending4(WebDriver driver, String locator4,String value4) {
//WebElement element4	= driver.findElement(By.name(locator4));
//element4.sendKeys(value4);
//}
public static void sending5(WebDriver driver,String locator,String value) {
WebElement element5= driver.findElement(By.id(locator));
element5.sendKeys(value);
}
public static void sending6(WebDriver driver, String locator6,String value6) {	
WebElement element6 = driver.findElement(By.xpath(locator6));
element6.sendKeys(value6);
}
//public static void sending7(WebDriver driver, String locator7,String value7)	{
//WebElement element7 = driver.findElement(By.id(locator7));
//element7.sendKeys(value7);

//	try {
//		Thread.sleep(20000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	;
//}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		// create a Driver object for ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.get("https://www.facebook.com");
		Fcebooktestmethod set = new Fcebooktestmethod();
		
		String emailName="#email";
		String email="thisismyemail";
		set.sending1(driver,emailName,email);
		
		String passName = "pass";
		String passWord = "Bvghyd";
		set.sending2(driver, passName, passWord);
		
		String fnameId = "firstname";
		String fnameName ="Chanda";
		set.sending2(driver, fnameId, fnameName);
		
		String lnameId = "lastname";
		String lnameName = "krish";
		set.sending2(driver, lnameId, lnameName);
		
		String monthId = "month";
		String monthName ="may"; 
		set.sending5(driver, monthId, monthName);
		
		String dateId ="//*[@id=\'day\']";
		String date = "10";
		set.sending6(driver, dateId, date);
		
		
		String yearId = "year";
		String year = "1985";
		set.sending5(driver, yearId, year);
		
		//driver.quit();
		
		

	}


	}


