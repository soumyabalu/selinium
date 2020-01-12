package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parentchildtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");

		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.google.com");
		myobj.findElement(By.xpath("//div[@id=fakebox-container']/div/input")).sendKeys("kerala");
		//myobj.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("kerala");
        //xpath obtained for images using parent /child relationship
	//	myobj.findElement(By.xpath("//div[@class='gb_9d gb_i gb_yg gb_pg']/div[2]/a")).click();
        //used text() attribute to find the element using xpath  without looking the code 
      //  myobj.findElement(By.xpath("//*[text()='About']")).click();
        
        
	}

}
