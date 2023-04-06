package fffffef;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dscbttb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		Thread.sleep(1000);
		try {
			boolean linkExistence=driver.findElement(By.name("q")).isDisplayed();

			if (linkExistence == true) {
				System.out.println("Gmail Link Exists – Passed");
			}
		}
		catch(NoSuchElementException e){
			System.out.println("Gmail Link Not Exists – Failed");
}
		driver.close();

	}
}