package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiontestpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("http://www.amazon.in");
		//to maximize the window
		myobj.manage().window().maximize();
		//Actions class is created
		Actions show = new Actions(myobj);
        //perform is given to execute and build is to get the element
		//move element is Given to move the mouse to the particular element
		//give the webelement in the movetoElement()
		show.moveToElement(myobj.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
	//can create a variable for webelement
		//WebElement show = myobj.findElement(By.xpath("//a[@id='nav-link-accountList']")));
		//show.moveToElement(move).build().perform();
	   //sending text to search boxand selecting it
		show.moveToElement(myobj.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("totebags").doubleClick().build().perform();
	
	
	
	
	
	
	}
	
	

}
