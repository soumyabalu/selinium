package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.manage().window().maximize();
		myobj.manage().deleteAllCookies();
		myobj.get("http://www.qaclickacademy.com");
		myobj.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[5]/a")).click();
		WebElement table = myobj.findElement(By.id("product"));
		List<WebElement> row = table.findElements(By.xpath("//tbody/tr"));
		System.out.println(row.size() - 1);
		List<WebElement> column = table.findElements(By.xpath("//tbody/tr/th"));
		System.out.println(column.size());
		//print 3rd row 1st column
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[1]")).getText());
		//print 3 rd row 2nd column
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[2]")).getText());
		//print 3rd row 3rd column
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[3]")).getText());

	}

}
