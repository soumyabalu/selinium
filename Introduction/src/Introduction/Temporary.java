package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke the .exe file for the firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		//create object for the moxilla firefox browser
		WebDriver myobj = new FirefoxDriver();
		myobj.get("https://www.google.com/");
		myobj.getTitle();
		System.out.println(myobj.getTitle());
		myobj.getCurrentUrl();
		System.out.println(myobj.getCurrentUrl());
		myobj.getPageSource();
		System.out.println(myobj.getPageSource());
		myobj.get("https://outlook.live.com");
		myobj.get("https://kellyservices.safeschools.com/login");
		myobj.navigate().back();
		myobj.navigate().back();
		myobj.close();
	}

}
