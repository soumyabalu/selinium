package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.path2usa.com/travel-companions");
		//inspecting the date of travel box
		myobj.findElement(By.id("travel_date")).click();
      while(! myobj.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April")) {
    	  myobj.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
      }
		
       //grab the common attribute for date
		List<WebElement> date=myobj.findElements(By.cssSelector("td.day"));
        for (int i = 0; i<date.size(); i++) {
        	 String requiredDate = date.get(i).getText();
        			 if(requiredDate.equalsIgnoreCase("23")) {
        				 myobj.findElements(By.cssSelector("td.day")).get(i).click();
        				 break;
        		 	 }
        		 
        		 
        	 }
        }
	
}
