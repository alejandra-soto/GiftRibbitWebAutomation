package TestCases;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TeacherLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/alekins/chromedriver");
        WebDriver driver = new ChromeDriver();
       
        Thread.sleep(1000);
       
        // And now use this to visit Google
        // driver.get("http://www.accounts.google.com");
       
        // Alternatively the same thing can be done like this
        //driver.navigate().to("http://www.google.com");
        
        // Navigate to Bug API link
        driver.navigate().to("https://bug-api.dvcphyfdliprj.amplifyapp.com/");
        
        Thread.sleep(1000);
       
        // Find the Login button 
        WebElement element;
        // Set element as login button
        element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div/div/div[2]/a"));
        
        Thread.sleep(1000);
        
        
        element.click();
       
        
 
        // Enter something to search for
        //element.sendKeys("Hello World");
 
        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();
 
        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());
       
        //Close the browser
       //driver.quit();

	}

}
