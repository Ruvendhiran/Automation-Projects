package Navigate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gaparun\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		

		driver.navigate().to("https://rahulshettyacademy.com/");
		
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("tomato");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class=\" \"]")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
		//Thread.sleep(2000);
		
		
		driver.navigate().back();
		
		//Thread.sleep(2000);
		
		driver.navigate().forward();
		
		//Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.quit();
	
	}

}
