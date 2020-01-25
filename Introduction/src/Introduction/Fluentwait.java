package Introduction;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://the-internet.herokuapp.com/");
		myobj.findElement(By.xpath("//div[@class='row']/div/ul/li[14]/a")).click();
		myobj.findElement(By.xpath("//div[@id='content']/div/a[1]")).click();
		myobj.findElement(By.xpath("//div[@id='start']/button")).click();
		//fluent wait is added
		Wait<WebDriver> wait = new FluentWait<WebDriver>(myobj).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver myobj) {
				if (myobj.findElement(By.xpath("//div[@id='finish']")).isDisplayed()) {
					return myobj.findElement(By.xpath("//div[@id='finish']"));
				} else {
					return null;
				}
			}

		});
		System.out.println(myobj.findElement(By.xpath("//div[@id='finish']")).getText());

	}

}
