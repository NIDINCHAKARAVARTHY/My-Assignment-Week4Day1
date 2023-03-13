package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			Thread.sleep(5000);
			
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.findElement(By.xpath("//span[text()='Show']")).click();
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			alert.accept();
			String text=	driver.findElement(By.id("simple_result")).getText();
			System.out.println(text);
			
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			String text2 = driver.findElement(By.xpath("//span[@id='result']")).getText();
			System.out.println(text2);
			
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
			alert3.sendKeys("Nidin");
			alert3.accept();
			String text3 = driver.findElement(By.id("confirm_result")).getText();
			System.out.println(text3);
			
			driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
			
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    
			
    		driver.findElement(By.xpath("(//span[text()='Show]'])[4]")).click();
    		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
	        
	        
	        driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	        driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	        
			
	}

}
