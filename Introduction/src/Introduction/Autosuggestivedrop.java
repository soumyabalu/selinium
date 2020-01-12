package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestivedrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver myobj = new FirefoxDriver();
		
	WebElement source=myobj.findElement(By.id("T7-from"));
	source.sendKeys("JFK");
	try {
		Thread.sleep(2000);
	
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	source.sendKeys(Keys.ENTER);
	WebElement dest = myobj.findElement(By.id("T7-to"));
	dest.sendKeys("Mar");
	int i=0;
	while(i<4) {
		dest.sendKeys(Keys.ARROW_DOWN);	
		i++;		
		}
	dest.sendKeys(Keys.ENTER);


	}

}
