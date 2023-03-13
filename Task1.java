package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	 public static void main(String[] args) throws InterruptedException {
			
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			Thread.sleep(5000);
			driver.get("https://jqueryui.com/droppable//");
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			Actions builder = new Actions(driver);
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
            builder.dragAndDrop(drag, drop).perform();
}
}