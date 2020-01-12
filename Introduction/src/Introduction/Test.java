package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
        //create a Driver object for ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://www.qaclickacademy.com/");
		//driver.findElement(By.xpath("//*[text()='Home']")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='navbar navbar-default navbar-static-top']/div/nav/ul/li[1]/a")).click();
		//driver.navigate().forward();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[1]/following-sibling::li[2]/a")).click();
		//driver.findElement(By.xpath("ul[@class='nav navbar-nav navbar-right']/li[1]/li[2]/following-sibling::li[3]/a")).click();

		

	}

}
