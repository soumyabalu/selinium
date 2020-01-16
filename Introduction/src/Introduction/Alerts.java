package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		myobj.findElement(By.cssSelector("input[id='name']")).sendKeys("Rahul");
		// first alert button.
		// String text = "Rahul";
		// myobj.findElement(By.cssSelector("input[id='name'])")).sendKeys(text);
		myobj.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(myobj.switchTo().alert().getText());
		// accept for accepting the alert
		myobj.switchTo().alert().accept();
		// second allert button
		myobj.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		System.out.println(myobj.switchTo().alert().getText());
		// dismiss() for cancel the alert
		myobj.switchTo().alert().dismiss();
	}

}
