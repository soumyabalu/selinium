package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.google.com");
		myobj.get("https://login.salesforce.com");
		myobj.findElement(By.cssSelector("#username")).sendKeys("myname");
		myobj.findElement(By.name("pw")).sendKeys("hjshcnbhd");
		//myobj.findElement(By.className("button r4 wide primary")).click();
		myobj.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//myobj.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
		System.out.println(myobj.findElement(By.xpath("//*[@id=\'error\']")).getText());

	}
	

}
