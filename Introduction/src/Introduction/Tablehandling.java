package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.cricbuzz.com/live-cricket-scorecard/23093/mlr-vs-hbh-47th-match-big-bash-league-2019-20");
		//inspecting the whole box
		 int sum = 0;
		WebElement table= myobj.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		 // inspecting the first row and geting its xpath along with moving to the third column
		 List<WebElement> column=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		 //iteration
		 for(int i =0; i<column.size()-2;i++) {
			String value= column.get(i).getText();
			//changing string to integer
			int valueinteger= Integer.parseInt(value);
			sum = sum + valueinteger;
		 }
		 //System.out.println(sum):
		 String extras =myobj.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 //changing String to integer
		 int extrasValue = Integer.parseInt(extras);
		 int newSum = sum + extrasValue;
		 System.out.println(newSum);
		 
		 String total = myobj.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		 int totalValue = Integer.parseInt(total);
	System.out.println(totalValue);
	if(newSum == totalValue) {
		System.out.println("the ans we got is correct");
	}
	else {
		System.out.println("ans is wrong");
	}
		
	}
	}