package seleniumPackage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Test Methods");
		search.submit();
			
		WebElement recap = driver.findElement(By.id("recaptcha-anchor"));
		search.click();
		
		System.out.println("Title is: " + driver.getTitle());
	
		driver.close();

		
	}

}
