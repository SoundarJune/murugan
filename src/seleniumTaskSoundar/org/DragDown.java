package seleniumTaskSoundar.org;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\seleniumTaskSoundar\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions r= new Actions(driver);
		WebElement soundar=driver.findElement(By.xpath("((//a[@class='button button-orange'][1])"));
		WebElement soundar1=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		r.dragAndDrop(soundar, soundar1).perform();
	}
}


		
		
		
	
