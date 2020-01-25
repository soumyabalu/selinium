package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://the-internet.herokuapp.com/");
		myobj.findElement(By.xpath("//div[@id='content']/ul/li[34]/a")).click();
		myobj.switchTo().frame(myobj.findElement(By.name("frame-top")));
	    myobj.switchTo().frame(myobj.findElement(By.name("frame-middle")));
	    System.out.println(myobj.findElement(By.id("content")).getText());
	    myobj.switchTo().defaultContent();
	
		
		
	

	}

}
