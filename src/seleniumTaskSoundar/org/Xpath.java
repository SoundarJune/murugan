package seleniumTaskSoundar.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\seleniumTaskSoundar\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement soundar=driver.findElement(By.xpath("//input[@type='email']"));
	soundar.sendKeys("soundar.zealous");
	WebElement soundar1=driver.findElement(By.xpath("//input[@type='tel']"));
	soundar1.sendKeys("89734");
	WebElement soundar2=driver.findElement(By.xpath("//input[@type='radio'][1]"));
	soundar2.click();
	
	

}
}
