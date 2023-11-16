package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_radio_Button {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe"; //variable string donde esta chrome
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		WebDriver driver = new ChromeDriver(); //nuevo objeto de chrome driver
		driver.get("https://demoqa.com/radio-button"); //donde iremos
		driver.manage().window().maximize();   // Maximizamos la pantalla
		
		//OBTENEMOS LOS ELEMENTOS
		
		WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		
		WebElement impresive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		
		yes.click();
		
		Thread.sleep(3000);
		impresive.click();
		
		Thread.sleep(3000);
		
		// CERRAMOS EL NAVEGADOR
		driver.close();

	}

}
