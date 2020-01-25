package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejetcalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.spicejet.com/");
		myobj.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		//select month
		while(!myobj.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("march")){
		myobj.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		
		}
		
		//select date 18
       List<WebElement> day = myobj.findElements(By.xpath("//td[@data-handler='selectDay']"));
       //iterate to get the desired date
       for (int i =0; i<day.size();i++) {
    	 String expectedDate= day.get(i).getText();
    	if(expectedDate.equalsIgnoreCase("18")){
    		
    			day.get(i).click();
    		}
    		 
    	 

       }
	}
}

	


