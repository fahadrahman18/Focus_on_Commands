package wings.practices;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Managing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
 		
        //Launching the Site.		
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        String firstURL = js.executeScript("return document.URL").toString();
        System.out.println("First URL: " + firstURL);
        

		//js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        WebElement button = driver.findElement(By.className("decorativeSubmit"));			
        		
        //Credentials 		
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");					
        driver.findElement(By.id("password")).sendKeys("crmsfa");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to LeafTaps site');"); 
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        
        //refresh
        js.executeScript("history.go(0)");
        
        
        System.out.println("First Test Completed");
        
        //Navigating to google site
        String url = "http://google.com";
        js.executeScript("window.location = \'"+url+"\'");
        
        String curURL = js.executeScript("return document.URL").toString();

        System.out.println("Navigated URL: " + curURL);
        
        System.out.println("Second Test Completed");

	}

}
