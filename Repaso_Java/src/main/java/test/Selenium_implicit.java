package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_implicit {

	public static void main(String[] args) {
		
		String exePath = "./driver/chromedriver.exe";
		//Agregar las propiedades
		
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		//Maximizar la ventana
		
		driver.manage().window().maximize();
		
		// Ingresamos una espera implicita
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}

}
