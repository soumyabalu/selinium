package Introduction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Shpngcrtwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		// adding implicit wait
		myobj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myobj.get("https://rahulshettyacademy.com/seleniumPractise/");
		// creating array of veggies
		String[] veggies = { "Carrot", "Cauliflower", "Brinjal", "Mushroom" };
		additems(myobj, veggies);
		myobj.findElement(By.xpath("//a[@class='cart-icon']")).click();
		myobj.findElement(By.xpath("//div[@class='action-block']/button")).click();
		// can use text syntax for xpath as the proceed to checkout button is stataic.
		myobj.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		myobj.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(myobj.findElement(By.cssSelector("span.promoInfo")).getText());
		myobj.findElement(By.xpath("//button[text()='Place Order']")).click();
		Select country = new Select(myobj.findElement(By.xpath("//div[@class='products']/div/div/select")));
		country.selectByValue("Australia");
		Assert.assertFalse(myobj.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		myobj.findElement(By.xpath("//input[@type='checkbox']")).click();
		Assert.assertTrue(myobj.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		myobj.findElement(By.xpath("//div[@id='root']/div/div/div/div/button")).click();

	}

	public static void additems(WebDriver myobj, String[] veggies) {
		int x = 0;
		int y = 1;

		// identifying the items using cssselector
		List<WebElement> items = myobj.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {
			// split the veggie name into two parts name and quantity
			String[] name = items.get(i).getText().split("-");
			// trimming the vegetabile by its name
			String updatedVeggieNames = name[0].trim();
			// creating array list
			List veggieList = Arrays.asList(veggies);
			// checking for the vegetables in the array
			if (veggieList.contains(updatedVeggieNames)) {
				// increment for break
				x++;
				// to add 3 veggies each looping it
				while (y < 3) {
					myobj.findElement(By.cssSelector("a.increment")).click();
					y++;
				}

				// adding explicit waittime
				
				WebDriverWait waittime = new WebDriverWait(myobj, 5 );
				waittime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-action']/button")));
				
				// finally adding the veggies to the cart
             myobj.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// when the number of veggies in the array becomes complete come out of the loop

				if (x == 4) {
					break;
					
				}

			}
		}

	}
}
