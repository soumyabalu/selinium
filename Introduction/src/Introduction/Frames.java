package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://jqueryui.com/droppable");
		Frames put = new Frames();
		String dragId ="draggable";
		String dropId ="droppable";
		 put.dragAndDropFrame(myobj,dragId,dropId);
	}
		
		public static void dragAndDropFrame(WebDriver myobj,String locator1 ,String  locator2 ) {
		
		//tell selenium to identify frames ie switching to iframe
		//can switch to frame uding index
		myobj.switchTo().frame(0);
		//can switch to frame by using tagname
	  //myobj.switchTo().frame(myobj.findElement(By.tagName("iframe")));
	  //System.out.println(myobj.findElements(By.tagName("iframe")).size());
		//can switch to framme using webelement
	  //myobj.switchTo().frame(myobj.findElement(By.cssSelector("iframe.demo-frame")));
		myobj.findElement(By.id(locator1)).isDisplayed();
		myobj.findElement(By.id(locator2)).isDisplayed();
		//drag and drop use actions class
		Actions set = new Actions(myobj);
		WebElement source =myobj.findElement(By.id(locator1));
		WebElement target = myobj.findElement(By.id(locator2));
		set.dragAndDrop(source, target).build().perform();
	    //set.dragAndDrop(myobj.findElement(By.id("draggable")), myobj.findElement(By.id("droppable"))).build().perform();
		//tell the webdriver to come out of frames to the normal window ie defalt content
		myobj.switchTo().defaultContent();
	}
		}
	


	