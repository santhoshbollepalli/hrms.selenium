package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC01_saucedemo_Login {

	public static void main(String[] args) throws Exception{
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Login'][@type='submit']")).click();
		System.out.println("Login Completed");
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		System.out.println("Clicked on top left corner menu button");
		Thread.sleep(1000);
		WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
		System.out.println("Logout Completed");
		driver.close();
		System.out.println("Application closed");
	}

}
