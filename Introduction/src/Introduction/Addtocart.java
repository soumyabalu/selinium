package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = myobj.findElements(By.cssSelector("h4.product-name"));
		int i;
		for(i=0; i<products.size(); i++) {
		String name	=products.get(i).getText();
		if(name.contains("Brocolli")){
			//myobj.findElement(By.cssSelector("a.increment")).click();
			
			int x = 0;
			while(x<2) {
				myobj.findElements(By.cssSelector("a.increment")).get(i).click();
				x++;
			}
			//myobj.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			myobj.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			
		}
		
		
		

	}

	}
}