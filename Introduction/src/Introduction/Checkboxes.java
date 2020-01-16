package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.spicejet.com/");
		//System.out.println(myobj.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//insted of the above step using assertion for validating the result
		Assert.assertFalse(myobj.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        myobj.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
	    //System.out.println(myobj.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(myobj.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        //count of the checkboxes to br find out.
		//used findElements instead of findElement to find out all the checkbox numbers
		System.out.println(myobj.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
