package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticdrropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver myobj = new ChromeDriver();
		myobj.get("https://www.emirates.com");
		myobj.findElement(By.linkText("Continue")).click();
		myobj.findElement(By.name("Passengers")).click();
		myobj.findElement(By.xpath("//button[@class='js-increment-increase increment-field__button increment-field__increase']")).click();
		//myobj.findElement(By.xpath("//button[@class='js-increment-increase increment-field__button increment-field__increase']")).click();
		//for (int i =1; i<5; i++) {
		//	myobj.findElement(By.xpath("//button[@class='js-increment-increase increment-field__button increment-field__increase']")).click();
			//}
		int i = 1;
		while(i<5) {
			myobj.findElement(By.xpath("//button[@class='js-increment-increase increment-field__button increment-field__increase']")).click();
			i++;
		}
		System.out.println(myobj.findElement(By.name("Passengers")).getText());

		
		
		
	
		
		

	}

}
