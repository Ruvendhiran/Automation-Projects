package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gaparun\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String BaseUrl = "https://www.google.com/";
		
		driver.get(BaseUrl);
		
		String acutalTitle = driver.getTitle();
		String ExpetedTitle = ("google");
		
		Assert.assertNotEquals(acutalTitle,ExpetedTitle);
		
		driver.close();
		
		//driver.navigate().to("https://www.google.com/");
		

	}

	private static void assertNotEquals(String acutalTitle, String expetedTitle) {
		// TODO Auto-generated method stub
		
	}

	private static void assertEquals(String acutalTitle, String expetedTitle) {
		// TODO Auto-generated method stub
		
	}

}
