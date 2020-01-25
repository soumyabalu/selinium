package Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver myobj = new ChromeDriver();
		myobj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		myobj.get("http://www.qaclickacademy.com");
		myobj.findElement(By.xpath("//a[text()='Practice']")).click();
		myobj.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
		String option =myobj.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
	WebElement dropDown = myobj.findElement(By.id("dropdown-class-example"));
	Select label= new Select (dropDown);
	label.selectByVisibleText(option);
	myobj.findElement(By.id("name")).sendKeys("option");
	myobj.findElement(By.id("alertbtn")).click();
	 String msg = myobj.switchTo().alert().getText();
  
	System.out.println(msg);
			myobj.switchTo().alert().accept();
		
	
				
			}
				
				
			
		

		

	}

