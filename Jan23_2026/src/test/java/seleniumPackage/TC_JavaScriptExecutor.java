package seleniumPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('Hello from selenium');");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
	}

}
