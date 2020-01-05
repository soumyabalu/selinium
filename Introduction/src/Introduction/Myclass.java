package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Myclass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//invoke .exe file for IE browser
		System.setProperty("webdriver.ie.driver","C:\\Users\\soumya balu\\workspace\\New folder\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		//create Driver object for IE browser
		WebDriver myobj = new InternetExplorerDriver();
		

	}

}
