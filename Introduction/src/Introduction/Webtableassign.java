package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.manage().window().maximize();
		myobj.manage().deleteAllCookies();
		myobj.get("http://www.qaclickacademy.com");
		myobj.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[5]/a")).click();
		 Webtableassign assign = new  Webtableassign ();
		 String rows = "//tbody/tr";
		 String id = "product";
		 assign.sending(myobj,id,rows);
		String columns ="//tbody/tr/th";
	assign.sending(myobj,id, columns);
	 String thirdRowFrstclmn="//tbody/tr[3]/td[1]";
	 assign.sending(myobj, id, thirdRowFrstclmn);
	 String thirdRowSecclmn= "//tbody/tr[3]/td[2]";
	 assign.sending(myobj, id, thirdRowSecclmn);
	 String thirdRowThrdclmn="//tbody/tr[3]/td[3]";
	 assign.sending(myobj, id, thirdRowThrdclmn);
	 
	
		
	}
		
		public static void sending(WebDriver myobj,String locator1, String locator2) {
			WebElement table = myobj.findElement(By.id(locator1));
		List<WebElement> row = table.findElements(By.xpath(locator2));
		System.out.println(row.size() - 1);
		List<WebElement> column = table.findElements(By.xpath(locator2));
		System.out.println(column.size());
		//print 3rd row 1st column
		System.out.println(table.findElement(By.xpath(locator2)).getText());
		//print 3 rd row 2nd column
		System.out.println(table.findElement(By.xpath(locator2)).getText());
		//print 3rd row 3rd column
		System.out.println(table.findElement(By.xpath(locator2)).getText());

	}
 
}
