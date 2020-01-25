package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver myobj = new ChromeDriver();
        //get url
        myobj.get("https://accounts.google.com/signup");
        Childwindowhandle window = new Childwindowhandle();
        //inspecting help element
        String elementXpath = "//ul[@class='Bgzgmd']/li[1]/a";
        window.handle(myobj, elementXpath);
	}
        
     public static void handle(WebDriver myobj, String locator) {   
        myobj.findElement(By.xpath(locator)).click();
        System.out.println( myobj.getTitle());
        //need to handle more than oone window,they are strings
        Set<String>ids=myobj.getWindowHandles();
       //iterator method
        Iterator<String> it = ids.iterator();
       String parentid = it.next();
       String childid = it.next();
       //swithching to child window
       myobj.switchTo().window(childid);
      //printout child window title
       System.out.println( myobj.getTitle());
       
        
	}

}
