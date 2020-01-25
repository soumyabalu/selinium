package Introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// 1.get link count of the page
		// 2.get the link count of the footer
		// 3.get the link count of first column in the footer
		// 4.check for all the links are working
		// 5.open the links in separate tab
		// 6.get the page title of each linkn

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// adding Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		// get the link count
		System.out.println(driver.findElements(By.tagName("a")).size());
		// creating a subset of te driver ie creating a mini driver for footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		// get count of links in footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// creating a subset for firstcolumn of footerdriver ie creating a mini
		// driverfor the first column in the footer using limitted driver scope.
		WebElement columndriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		// get the count of the links in the column
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		// check whether the links are working
		// forloop opens all the tabs
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			// to open the links in a separate tab and assigning them in a separate variable
			String clickOnTheLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// opening the links in separate tab
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTheLinks);
			// print the title of the tabs
			// System.out.println(columndriver.findElements(By.tagName("a")).get(i).getText());
		}
		// navigate to tabes and pages
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		// using while loop to handle child windows

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
