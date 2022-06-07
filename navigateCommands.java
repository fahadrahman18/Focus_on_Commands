package wings.practices;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigateCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Driver setup for chrome
		//System.setProperty("webdriver.chrome.driver", "path_of_the_driver");
		WebDriverManager.chromedriver().setup(); // Because of WebDriverManager, no need to download and specify the driver
		WebDriver driver = new ChromeDriver();
		
		//Managing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://google.com");
		driver.navigate().to("https://google.com");

		
		System.out.println("Google URL: " +  driver.getCurrentUrl());
		
		driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-navigation-commands");
		//driver.navigate().to(new URL(https://gmail.com));

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

		
		System.out.println("Javatpoint Tutorial url: "  +  driver.getCurrentUrl());
		
		System.out.println("Test Completed");
		
		//driver.close();


	}

}
