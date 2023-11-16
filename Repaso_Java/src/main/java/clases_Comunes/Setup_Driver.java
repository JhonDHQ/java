package clases_Comunes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup_Driver {
	
	public static WebDriver setupDriver() 
	{
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		
		driver.manage().window().maximize();//maximizar Windows
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
