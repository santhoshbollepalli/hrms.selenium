package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC02_Addemp {
	public static void main(String args[]) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		//click on Add btn
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Bollepalli");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Santhosh");
		Thread.sleep(1000);
		driver.findElement(By.id("btnEdit")).click();
		driver.findElement(By.id("btnEditPers")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtNICNo")).sendKeys("123456");
		Thread.sleep(1000);	
		driver.findElement(By.id("txtSINNo")).sendKeys("654321");
		Thread.sleep(1000);
		driver.findElement(By.id("DOB")).sendKeys("1997-10-12");
		Thread.sleep(1000);
		driver.findElement(By.id("txtOtherID")).sendKeys("000000");
		Thread.sleep(1000);
		driver.findElement(By.id("cmbMarital")).sendKeys("Unmarried");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender1'][@type='radio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtLicenNo")).sendKeys("123456789012");
		Thread.sleep(1000);
		driver.findElement(By.id("txtLicExpDate")).sendKeys("2025-08-18");
		Thread.sleep(1000);
		driver.findElement(By.id("txtMilitarySer")).sendKeys("none");
		Thread.sleep(1000);
		System.out.println("New emp added");
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		System.out.println("Application Closed");
		driver.close();
	}
	}


