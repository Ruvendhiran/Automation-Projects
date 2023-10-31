package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//naviagte to google search
//setup for chrome driver
//search url www.google.com


public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gaparun\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		

	}

}
