package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooktest2method {

	
	
	
public static void sending(WebDriver myobj,String locator,String value) {
	
WebElement element1 = myobj.findElement(By.xpath(locator));
element1.sendKeys(value);
}

//public static void giving(WebDriver myobj,String locator2,String value2) {
//WebElement element2 = myobj.findElement(By.xpath(locator2));
//element2.sendKeys(value2);
//	
//	}
//	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver myobj = new FirefoxDriver();
		myobj.get("https://www.google.com/");
		myobj.get("https://www.facebook.com/");
		Facebooktest2method test = new Facebooktest2method();
		String email ="//*[@id=\'email\']";
        String emailName= "thisismyemail";
		test.sending(myobj,email,emailName);
		String passWord= "//*[@id=\'pass\']";
		String word= "bndchhgc";
		test.sending(myobj,passWord,word);
		
	
	    //myobj.findElement(By.xpath("[@id=\'u_0_4\']")).click();
	//myobj.quit();
	
	}
}

