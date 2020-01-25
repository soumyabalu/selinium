package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shpngcrtexplwtassgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait waittime = new WebDriverWait(myobj, 5);
		myobj.findElement(By.xpath("//div[@id='content']/a[2]")).click();
		//adding Explicit  waittime
		waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		System.out.println(myobj.findElement(By.id("results")).getText());

	}

}
