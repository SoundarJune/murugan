package seleniumTaskSoundar.org;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ss {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\seleniumTaskSoundar\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot s= (TakesScreenshot)driver;
	    File sou=s.getScreenshotAs(OutputType.FILE);
        File dec=new File("C:\\Users\\Acer\\workspace\\seleniumTaskSoundar\\Driver\\soundar.png"); 
        FileUtils.copyDirectory(sou, dec);
    
		
		
		
		

}
}

