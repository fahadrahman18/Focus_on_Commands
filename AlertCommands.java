package wings.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		//Simple Alert
		
		driver.findElement(By.name("alert")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Confirmation Alert
		
		driver.findElement(By.name("confirmation")).click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		Thread.sleep(3000);
		
		//Prompt Alert
		
		driver.findElement(By.name("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hey there");
		prompt.accept();
		
		
		System.out.println("Alerts are managed");

		driver.close();
		
	
		

	}

}
