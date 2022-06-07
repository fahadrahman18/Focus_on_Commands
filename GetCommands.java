package wings.practices;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Managing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		System.out.println("Title of the page: " + driver.getTitle());
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		String ExpectedURL = "https://www.google.com/";
		
		Assert.assertEquals(driver.getCurrentUrl(), ExpectedURL); //error appear if condition false
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getPageSource().contains("google"));
		
		//System.out.println(driver.getClass());
		
		String text = driver.findElement(By.linkText("Gmail")).getText();
		
		System.out.println("text: " + text);
		
		String attribute = driver.findElement(By.name("btnK")).getAttribute("value");
		
		System.out.println("Button name: " + attribute);
		
		
		
		//driver.close();

	}

}
