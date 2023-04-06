package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkoutpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();
	
		WebElement validate=driver.findElement(By.cssSelector("img[alt='United States']"));		
		validate.click();

		
		WebElement searchBar=driver.findElement(By.xpath("//input[@id='gh-search-input']"));
		searchBar.sendKeys("toys");
		WebElement Searchclick=driver.findElement(By.xpath("//button[@class='header-search-button']"));
		Searchclick.click();
		
		WebElement selectItem=driver.findElement(By.xpath("//img[@alt='LEGO - Super Mario Character Packs – Series 6 71413']"));
		selectItem.click();
		
		WebElement cartAdding=driver.findElement(By.xpath("//button[@data-button-state='ADD_TO_CART']"));
		cartAdding.click();
		
		WebElement gotocart=driver.findElement(By.xpath("//span[@class='cart-label']"));
		gotocart.click();
		
		WebElement checkout=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary']"));
		checkout.click();
	}

}
