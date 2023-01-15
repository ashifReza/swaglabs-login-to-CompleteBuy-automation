package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	    String b = driver.getCurrentUrl();
	    System.out.println(b);
	   
	    //login
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click(); 
	    Thread.sleep(3000);
	    
	    //selecting items
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); 
	    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click(); 
	    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click(); 
	    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click(); 
	    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click(); 
	    Thread.sleep(3000);
	    
	    //clicking shopping cart icon
	    driver.findElement(By.id("shopping_cart_container")).click(); 
	    Thread.sleep(3000);
	    
	    //clicking checkout icon
	    driver.findElement(By.id("checkout")).click(); 
	    Thread.sleep(3000);
	    
	    //checkout info
	    driver.findElement(By.id("first-name")).sendKeys("aneme");
	    driver.findElement(By.id("last-name")).sendKeys("eeia");
	    driver.findElement(By.id("postal-code")).sendKeys("11123");
	    Thread.sleep(3000);
	    
	    
	    //continue
	    driver.findElement(By.id("continue")).click(); 
	    Thread.sleep(3000);
	    
	    //finish
	    driver.findElement(By.id("finish")).click(); 
	    Thread.sleep(3000);
	    
	    Thread.sleep(10000);
	    driver.close();
	    //Thread.sleep(10000);
	    //driver.close();
	}

}
