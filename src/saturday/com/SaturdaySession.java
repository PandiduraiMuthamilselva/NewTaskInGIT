package saturday.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaturdaySession {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\eclipse new version dont crash\\NewTask\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		System.out.println("done");
		
		
		
	}

}
