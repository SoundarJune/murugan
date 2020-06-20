package seleniumTaskSoundar.org;

import java.security.KeyStore.Entry.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\seleniumTaskSoundar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		JavascriptExecutor jk =  (JavascriptExecutor)driver;
		jk.executeScript("argument[0].setAttribute('value','soundar')", user);
		jk.executeScript("argument[0].setAttribute('value','2323')", password);
		
			
	}

}
