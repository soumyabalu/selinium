package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.spicejet.com/");
		
		myobj.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//Select drop = new Select(myobj.findElement(By.id("ctl00_mainContent_ddl_Child")));
		//element selected using xpath
		Select drop = new Select(myobj.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		drop.selectByIndex(4);
		drop.selectByValue("2");
		drop.selectByVisibleText("3");
		

		

		
	}

}
