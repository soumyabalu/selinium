package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2Endtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.spicejet.com/");
		// inspecting the radiobutton
		Assert.assertFalse(myobj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		myobj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(myobj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		// inspecting the frombox
		myobj.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		myobj.findElement(By.xpath("//a[@value='IXG']")).click();
		// inspecting the to box
		myobj.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		myobj.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']"))
				.click();
		myobj.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		// checking whether the second calender is enabled
		System.out.println(myobj.findElement(By.id("Div1")).getAttribute("style"));
		myobj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(myobj.findElement(By.id("Div1")).getAttribute("style"));
		// selecting the passengers
				myobj.findElement(By.id("divpaxinfo")).click();
				Select adult = new Select(myobj.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
				adult.selectByValue("2");
				Select child = new Select(myobj.findElement(By.id("ctl00_mainContent_ddl_Child")));
				child.selectByValue("2");
				Select infant = new Select(myobj.findElement(By.id("ctl00_mainContent_ddl_Infant")));
				infant.selectByValue("1");
				Select curency = new Select(myobj.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
				curency.selectByValue("USD");
				// checking & validating the seniorcitizen checkbox
				Assert.assertFalse(myobj.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
				myobj.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
				Assert.assertTrue(myobj.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
				// count of checkboxes
				myobj.findElements(By.cssSelector("input[type='checkbox']")).size();
				Assert.assertEquals(myobj.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
				// click search
				myobj.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
