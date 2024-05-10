package Runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://interview-copilot.vercel.app/");
		WebElement start = driver.findElement(By.xpath("//button[text()='Start Now']"));
		start.click();
		WebElement cont = driver.findElement(By.xpath("//button[text()='Continue']"));
		cont.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement softq = driver.findElement(By.xpath("(//input[@type='checkbox'])[80]"));
		softq.click();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Spy and Mocks']"));
		Actions a = new Actions(driver);
		a.moveToElement(findElement).perform();
		WebElement unit = driver.findElement(By.xpath("//span[text() = 'Unit Test']"));
		unit.click();
		
		Thread.sleep(3000);
		WebElement rating = driver.findElement(By.xpath("//input[@type='range']"));
		
		
//		js.executeScript("arguments[0].click();", rating);
		
		//js.executeScript("arguments[0].setAttribute('value' , '3')", rating);
		
		
		Thread.sleep(2000);
		
		WebElement rating1 = driver.findElement(By.xpath("//input[@type='range']"));
    	rating1.click();
//		js.executeScript("arguments[0].click();", rating1);
    	Thread.sleep(3000);
		unit.click();
		softq.click();
	}

}
