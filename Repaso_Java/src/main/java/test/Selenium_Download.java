package test;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Selenium_Download {

	public static void main(String[] args) throws InterruptedException {
String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		
		String downloadFilepath = System.getProperty("user.dir");
		
		chromePrefs.put("download.default_directory", downloadFilepath);
		
		options.setExperimentalOption("prefs",chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://omayo.blogspot.com/p/page7.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='ZIP file']")).click();
		
		Thread.sleep(3000);
		
		File file = new File(downloadFilepath + "\\DownloadDemo-Master.zip");

		if(file.exists()) 
		{
			System.out.println("El archivo se descargo de manera correcta");
		}
		else 
		{
			System.out.println("No se encuentra el archivo");
		}
	}

}
