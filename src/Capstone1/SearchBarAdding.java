package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarAdding {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		WebElement addingblock=driver.findElement(By.xpath("//img[@alt=\"WowWee - Got2Glow Fairies - Styles May Vary - Alt_View_Zoom_11\"]"));
		addingblock.click();
		Thread.sleep(2000);
		WebElement cartblock=driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']"));
		cartblock.click();
		
		driver.quit();
	}

}
