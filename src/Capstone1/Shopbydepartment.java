package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopbydepartment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement validate=driver.findElement(By.cssSelector("img[alt='United States']"));		
		validate.click();
		
		Thread.sleep(2000);
		
		WebElement menu=driver.findElement(By.cssSelector("button[class='c-button-unstyled hamburger-menu-button']"));
		menu.click();
		
		Thread.sleep(2000);
		
		WebElement shopdept=driver.findElement(By.xpath("//button[@data-id='node-393']"));
		shopdept.click();
		
		Thread.sleep(2000);
		
		WebElement selectedfield=driver.findElement(By.xpath("//button[@data-id='node-348']"));
		selectedfield.click();
		
		Thread.sleep(2000);
		
		WebElement itemselect=driver.findElement(By.xpath("//a[@data-lid='ubr_cp_acc_spk']"));
		itemselect.click();
		
		WebElement selectedtoaadd=driver.findElement(By.xpath("//img[@alt='Bose - Companion 2 Series III Multimedia Speaker System (2-Piece) - Black - Front_Zoom']"));
		selectedtoaadd.click();
		
		Thread.sleep(2000);
		
		WebElement addingtocart=driver.findElement(By.xpath("//button[@data-sku-id='8864513']"));
		addingtocart.click();
		
		driver.quit();
	}

}
