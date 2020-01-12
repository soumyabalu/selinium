package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooktest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver myobj = new FirefoxDriver();
		myobj.get("https://www.google.com/");
		myobj.get("https://www.facebook.com/");
		myobj.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("thisismyemail");
		myobj.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("bndchhgc");
	    //myobj.findElement(By.xpath("[@id=\'u_0_4\']")).click();
	
	
	}
}

