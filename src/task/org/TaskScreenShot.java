package task.org;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskScreenShot {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\eclipse new version dont crash\\NewTask\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		
		/*Robot rob= new Robot();  // its working
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage source = rob.createScreenCapture(rectangle);
		File destination= new File("D://robot.png");
		ImageIO.write(source, "png", destination);*/
		
		
		/*TakesScreenshot screen= (TakesScreenshot) driver ;--> not working  org.openqa.selenium.UnhandledAlertException
		File sourceFile = screen.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("D://screen1.png");
		//FileHandler.copy(sourceFile, destinationFile);--> both notworking 
		FileUtils.copyFile(sourceFile, destinationFile);*/
		Alert alert = driver.switchTo().alert();
		Robot rob= new Robot();  // its working
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage source = rob.createScreenCapture(rectangle);
		File destination= new File("D://robot1.png");
		ImageIO.write(source, "png", destination);
		alert.accept();
		//Thread.sleep(2000);
		driver.quit();
		
	}

}
