package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			Thread.sleep(5000);
			driver.get("https://www.leafground.com/alert.xhtml");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Nidin");
			alert.accept();
			String text = driver.findElement(By.id("confirm_result")).getText();
			System.out.println(text);

}
}