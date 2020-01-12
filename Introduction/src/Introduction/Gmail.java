package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.gmail.com");
		driver.get("https://accounts.google.com/signin");
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bjhuhn");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("nbnjhj");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("soumyavgtrytghb");
		//driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abCD123!@");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("abCD123!@");
		//driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("abCD123!@");
		driver.findElement(By.cssSelector("input[aria-label='Confirm']")).sendKeys("abCD123!@");
		driver.findElement(By.cssSelector(".CwaK9")).click();
		driver.findElement(By.cssSelector("input[id='phoneNumberId']")).sendKeys("4702408375");
		driver.navigate().back();
		driver.navigate().back();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[contains(@id,'identifierId')]")).sendKeys("this is myemail");
		//driver.findElement(By.cssSelector("div.ck6P8:nth-child(3) > button:nth-child(1)")).click();
		driver.findElement(By.cssSelector("input[id*='recoveryIdentifierId']")).sendKeys("4702408375");
		//driver.navigate().back();
		//driver.navigate().back();
		
		
		
		
		

	}

}