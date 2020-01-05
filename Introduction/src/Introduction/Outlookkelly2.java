package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlookkelly2 {

	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
	
	
	//create Driver object for ChromeBrowser
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.getTitle();
	System.out.println(driver.getTitle());
	driver.get("https://outlook.live.com/");
	driver.navigate().back();
	driver.get("https://kellyservices.safeschools.com/login");
	driver.navigate().forward();
	driver.navigate().to("https://maps.google.com");
	driver.navigate().back();
	driver.navigate().back();
	driver.close();
	driver.quit();
		// TODO Auto-generated method stub

	}

}
