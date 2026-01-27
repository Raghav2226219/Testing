package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
//		
//
//driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://tutorialsninja.com/demo");

		WebElement myacc = driver.findElement(By.partialLinkText("Account"));
		if (myacc.isDisplayed()) {
			System.out.println("My account is displayed");
			myacc.click();
		} else {
			System.out.println("My account is not displayed");
		}

		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.partialLinkText("Regist")).click();

		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Sunny" + Keys.SPACE + "Deol");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Deol" + Keys.CONTROL,
				"a" + Keys.BACK_SPACE);

		driver.close();

	}

}
