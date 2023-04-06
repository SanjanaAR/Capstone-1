package Capstone1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateURL {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D://Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();
	
		WebElement validate=driver.findElement(By.xpath("//img[@alt='United States']"));		
		validate.click();
		
		WebElement element=driver.findElement(By.xpath("//a[@data-lid='hdr_td_topdeals']"));
		//element.click();
		if(element.isDisplayed())	{
			System.out.println("link is not broken");
		}else {
		System.out.println("link is broken");
}
		driver.quit();
}
}