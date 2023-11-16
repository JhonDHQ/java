package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_Upload {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe"; //variable string donde esta chrome
		
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		WebDriver driver = new ChromeDriver();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();   // Maximizamos la pantalla
		driver.navigate().to("https://omayo.blogspot.com/");
		
		String projectPath =System.getProperty("user.dir");
		driver.findElement(By.id("uploadfile")).sendKeys(projectPath + "\\Files\\Lenny2.jfif");
		
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		

	}

}
