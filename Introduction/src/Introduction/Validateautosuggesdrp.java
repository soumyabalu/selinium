package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validateautosuggesdrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("http://www.qaclickacademy.com");
		myobj.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[5]/a")).click();
	WebElement search = myobj.findElement(By.id("autocomplete"));
	search.sendKeys("IND");
	int i = 0;
	while (i<4) {
		search.sendKeys(Keys.DOWN);
		i++;
	}
 search.sendKeys(Keys.ENTER);
 System.out.println(search.getText());
 //using java script excecutor
 JavascriptExecutor js = (JavascriptExecutor)myobj;
//geting the hidden element from the html document
 //return is added -to retern the value
 // add'/ in front of ID and ath the end of Id /
 String script="return document.getElementById(\"autocomplete\").value;";  
 //executing the javascriptexecutor
 String text=(String) js.executeScript(script);
System.out.println(text);
if(i<10){
	System.out.println("The element is present");
}
	else {
		System.out.println("the element is not present");
	}
}

 
 

	
	}


