package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3School {
	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			Thread.sleep(5000);
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.switchTo().frame("iframeResult");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			org.openqa.selenium.Alert alert= driver.switchTo().alert();
			alert.sendKeys("Nidin");
			alert.accept();
			String s=driver.findElement(By.xpath("//p[@id='demo']")).getText();
			System.out.println(s);
	}

}
