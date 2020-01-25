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

public class Sortingtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myobj.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
	WebElement table= myobj.findElement(By.id("sortableTable"));
	table.findElement(By.xpath("//thead/tr/th[2]")).click();
	//table.findElement(By.xpath("//thead/tr/th[2]")).click();

	
	
		
	List<WebElement>secondColumnList =table .findElements(By.xpath("//tbody/tr/td[2]"));
	 ArrayList<String> originalList = new ArrayList<String>();
	for (int i=0;i<secondColumnList.size();i++)
	{
		//System.out.println(secondColumnList.get(i).getText());
		originalList.add(secondColumnList.get(i).getText());
	}
	ArrayList<String> coppiedList = new ArrayList<String>();
	for(int i = 0; i<originalList.size();i++) {
		coppiedList.add(originalList.get(i));
	}
	//Collections.sort(coppiedList);
	Collections.reverse(coppiedList);
		for( String s : coppiedList) {
			System.out.println(s);
		}
		for(String s : originalList) {
			System.out.println(s);
		}
		Assert.assertFalse(originalList.equals(coppiedList));
		
	
	}
	

	}



