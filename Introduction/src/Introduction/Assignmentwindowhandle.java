package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://the-internet.herokuapp.com");
		myobj.findElement(By.xpath("//div[@id='content']/ul/li[33]/a")).click();
		myobj.findElement(By.xpath("//div[@class='example']/a")).click();
		System.out.println(myobj.getTitle());
	    Set<String>ids= myobj.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		myobj.switchTo().window(childid);
		System.out.println(myobj.getTitle());
		myobj.findElement(By.xpath("//div[@class='example']/h3")).click();
		
	     System.out.println(myobj.getTitle());
	     myobj.switchTo().window(parentid);
	}

}
