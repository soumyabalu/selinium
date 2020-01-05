package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke .exe file for chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
        //create a Driver object for ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("myemailisthis");
		driver.findElement(By.name("pass")).sendKeys("Bvghyd");	
      	driver.findElement(By.name("firstname")).sendKeys("Chanda");
		driver.findElement(By.name("lastname")).sendKeys("krish");
		driver.findElement(By.id("month")).sendKeys("may");
	    driver.findElement(By.id("day")).sendKeys("01");
		driver.findElement(By.id("year")).sendKeys("1985");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}	
}
