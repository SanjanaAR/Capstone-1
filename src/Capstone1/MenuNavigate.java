package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();
		
		WebElement validate=driver.findElement(By.cssSelector("img[alt='United States']"));		
		validate.click();
		
		WebElement menu=driver.findElement(By.cssSelector("button[class='c-button-unstyled hamburger-menu-button']"));
		menu.click();
		
		WebElement dealblock=driver.findElement(By.xpath("//button[@data-id='node-31']"));
		dealblock.click();
		
		WebElement giftideablock=driver.findElement(By.xpath("//a[@data-lid='ubr_dls_gift_ideas']"));
		giftideablock.click();
		
		String str=driver.getTitle();
		System.out.println(str);
		String val="Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
		if(str.equals(val)){
			System.out.println("Gift page is Validated");
		}else {
			System.out.println("Gift page is not validated");
		}
		driver.quit();
	}

}
