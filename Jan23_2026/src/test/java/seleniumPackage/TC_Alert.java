package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");

		driver.findElement(By.id("accept")).click();

		Alert simplealert = driver.switchTo().alert();
		System.out.println("Simple alert text : " + simplealert.getText());
		simplealert.accept();

		driver.findElement(By.id("confirm")).click();

		Alert simplealert2 = driver.switchTo().alert();
		System.out.println("Simple alert text : " + simplealert2.getText());
		simplealert2.accept();

		driver.findElement(By.id("prompt")).click();

		Alert simplealert3 = driver.switchTo().alert();
		System.out.println("Simple alert text : " + simplealert3.getText());
		simplealert3.accept();

		driver.quit();

	}

}
