package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdrop {

	/**
	 * This method is to find and click from city and to city. In the case of
	 * finding to city, the box is not needed, so we check for null for the box if
	 * it is not null we select it otherwise we will leave it.
	 * 
	 * @param myobj
	 * @param cityName
	 * @param fromBox
	 */
	public static void start(WebDriver myobj, String cityName, String fromBox) {
        System.out.println(" ############Enter element selection");
		// String fromCity = "//a[@value='"+cityName+"']";
		System.out.println("Elemennt to be selected is: " + cityName + ", and box is : " + fromBox);
		if (null != fromBox) {
			WebElement element1 = myobj.findElement(By.id(fromBox));
			element1.click();
		}
		WebElement cityElement = myobj.findElement(By.xpath(cityName));
		cityElement.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("#############Exit  element selection");
	}

	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.spicejet.com/");
		String fromCity = "//a[@value='BLR']";
		Dynamicdrop search = new Dynamicdrop();
		System.out.println("Program starting..");
		System.out.println("Selecting from box start");
		search.start(myobj, fromCity, "ctl00_mainContent_ddl_originStation1_CTXT");
		System.out.println("Select from box done");
		System.out.println("Select to box start");
		String toCity = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']";
		search.start(myobj, toCity, null);
		System.out.println("Select to box start");

	}

}
