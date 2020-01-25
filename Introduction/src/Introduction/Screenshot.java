package Introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		//maximizing the window screen
		myobj.manage().window().maximize();
		//deleting all cookies
		myobj.manage().deleteAllCookies();
		myobj.get("https://www.google.com");
		//casting driver object to TakeScreenshot
		File src =((TakesScreenshot)myobj).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(src,new File("C:\\Users\\soumya balu\\workspace\\screenshot.png"));


	}

	

}
