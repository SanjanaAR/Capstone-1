package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();

		WebElement country=driver.findElement(By.cssSelector("img[alt='United States']"));		
		country.click();
		//Thread.sleep(2000);
		
		WebElement account=driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")); 
		account.click();
		Thread.sleep(5000);
//		WebElement login=driver.findElement(By.xpath("//a[@class='c-button c-button-outline c-button-sm create-account-btn']"));
//		login.click();
		
		WebElement createaccount=driver.findElement(By.xpath("//a[@class='c-button c-button-outline c-button-sm create-account-btn']"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement firstnamefield=driver.findElement(By.id("firstName"));
		firstnamefield.sendKeys("Sahara");
		
		
		WebElement lastnamefield=driver.findElement(By.id("lastName"));
		lastnamefield.sendKeys("David");
		
		
		WebElement emailfield=driver.findElement(By.id("email"));
		emailfield.sendKeys("uvwxyzSD@gmail.com");
		
		
		WebElement pwdfield=driver.findElement(By.id("fld-p1"));
		pwdfield.sendKeys("xyzSD@123");
		
		
		WebElement confirmpwdfield=driver.findElement(By.id("reenterPassword"));
		confirmpwdfield.sendKeys("xyzSD@123");
		
		
		WebElement mobilenumber=driver.findElement(By.id("phone"));
		mobilenumber.sendKeys("9988776655");
		
		
		
		WebElement createanaccount=driver.findElement(By.cssSelector("button[type='submit']"));
		createanaccount.click();
		
		Thread.sleep(5000);
		
		WebElement signIn=driver.findElement(By.xpath("//input[@type='email']"));
		signIn.sendKeys("uvwxyzSD@gmail.com");
		Thread.sleep(3000);
		
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("xyzSD@123");
		
		Thread.sleep(3000);
		
		
		WebElement btnsignin=driver.findElement(By.xpath("//button[@type='submit']"));
		btnsignin.click();
		
		driver.quit();
		
	}

}
