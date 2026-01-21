package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("abfcthnbfsnc@mail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Ab@cd@ef12");
	    driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		

	}

}
