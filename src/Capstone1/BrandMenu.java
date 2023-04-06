package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement validate=driver.findElement(By.cssSelector("img[alt='United States']"));		
		validate.click();
		
		WebElement menu=driver.findElement(By.cssSelector("button[class='c-button-unstyled hamburger-menu-button']"));
		menu.click();
		
		WebElement brandblock=driver.findElement(By.xpath("//button[@data-id='node-86']"));
		brandblock.click();
		
		WebElement brandselect=driver.findElement(By.xpath("//a[@data-lid='ubr_shp_son']"));
		brandselect.click();
		

	}

}
