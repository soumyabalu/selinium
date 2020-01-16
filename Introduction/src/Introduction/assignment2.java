package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.cleartrip.com/");
		// inspectining the departure date box
		myobj.findElement(By.id("DepartDate")).click();
		// select the current date
		myobj.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		// select the no: of adults
		Select adults = new Select(myobj.findElement(By.id("Adults")));
		adults.selectByValue("2");
		// select the no: of kids
		Select kids = new Select(myobj.findElement(By.id("Childrens")));
		kids.selectByIndex(2);
		// select the no: of infants
		Select infant = new Select(myobj.findElement(By.id("Infants")));
		infant.selectByVisibleText("1");
		// click the moreoption link
		myobj.findElement(By.id("MoreOptionsLink")).click();
		// select the travel class
		Select travelClass = new Select(myobj.findElement(By.id("Class")));
		travelClass.selectByValue("Business");
		// enter value in preffered airline box
		myobj.findElement(By.xpath("//input[@name='airline']")).sendKeys("Indigo Airlines");
		// click the search icon
		myobj.findElement(By.id("SearchBtn")).click();
		// print the error message
		System.out.println(myobj.findElement(By.cssSelector("div#homeErrorMessage")).getText());

	}

}
