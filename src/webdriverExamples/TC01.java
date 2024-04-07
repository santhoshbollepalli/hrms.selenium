package webdriverExamples;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;

public class TC01 {

		public static void main(String[] args) throws Exception {

			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println("Application opened");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");	
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
			wait.until(ExpectedConditions.
			        elementToBeClickable(
			        driver.findElement(By.name("Submit"))));
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login completed");
			//Thread.sleep(3000);
			WebDriverWait wa = new WebDriverWait(driver,Duration.ofSeconds(3));
			wa.until(ExpectedConditions.
			        elementToBeClickable(
			driver.findElement(By.linkText("Logout"))));
			System.out.println("Logout completed");
			//Thread.sleep(3000);
			driver.close();
			System.out.println("Application Closed");
		}
	}


