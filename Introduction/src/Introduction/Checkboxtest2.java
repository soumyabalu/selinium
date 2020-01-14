package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(myobj.findElement(By.id("checkBoxOption1")).isSelected());
		myobj.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(myobj.findElement(By.id("checkBoxOption1")).isSelected());
		myobj.findElement(By.id("checkBoxOption1")).click();
		//System.out.println(myobj.findElements(By.cssSelector("input[type='checkbox']")).size());
				//validating the result using assertion
		Assert.assertEquals(myobj.findElements(By.cssSelector("input[type='checkbox']")).size(),3);
	

	}

}
