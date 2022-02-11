package homework3.week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/div/input")).sendKeys("Bags");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[1]/div/div/div[2]/ul/li[2]/div/div/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String text2 = driver.findElement(By.className("length")).getText();
        System.out.println(text2);
        List <WebElement> listOfBrands = driver.findElements(By.className("brand"));
        System.out.println(listOfBrands.size());
        for (WebElement webElement : listOfBrands) 
        {
        String text = webElement.getText();
        System.out.println(text);
        }
          
	}
}
	
