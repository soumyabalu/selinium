package Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myobj.get("https://rahulshettyacademy.com/seleniumPractise");
		myobj.findElement(By.xpath("//a[text()='Top Deals']")).click();
		//WebElement table =myobj.findElement(By.className("products"));
       List<WebElement> firstColumn= myobj.findElements(By.xpath("//div[@class='products']/div/table/tbody/tr/td[2]"));
    // List<WebElement> firstColumn = myobj.findElements(By.cssSelector("tr td:nth=child(2)"));
		//creating array list
      ArrayList<String> originalList = new ArrayList<String>();
       
       for(int i =0; i<firstColumn.size();i++) {
		 System.out.println(firstColumn.get(i).getText());
    	   //originalList.add(firstColumn.get(i).getText());
		 }
				
//ArrayList<String>copiedList = new ArrayList<String>();
//for(int i= 0; i<originalList.size();i++) {
//copiedList.add(originalList.get(i));
//collection method is used to sort elements in an array
//Collections.sort(copiedList);
//validation
//Assert.assertTrue(originalList.equals(copiedList));

	
}
	}


