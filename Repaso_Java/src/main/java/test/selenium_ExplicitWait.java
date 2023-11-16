package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe"; //variable string donde esta chrome
		
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		
		WebDriver driver = new ChromeDriver(); //nuevo objeto de chrome driver
		
		driver.get("https://demoqa.com/text-box"); //donde iremos
		
		driver.manage().window().maximize();   // Maximizamos la pantalla
		
			//OBTENEMOS LOS ELEMENTOS
		
		WebElement UserName = driver.findElement(By.id("userName"));
		
		UserName.sendKeys("Admin");
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		
		Email.sendKeys("prueba@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement Current = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		
		Current.sendKeys("Esta es una prueba de automatizaci�n");
		
		Thread.sleep(3000);
		
		WebElement btnpropiedades = driver.findElement(By.xpath("//span[contains(.,'Broken Links - Images')]"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		js.executeScript("arguments[0].scrollIntoView();", btnpropiedades);
		
		//Scroll hasta un elemento
		
		WebElement Address = driver.findElement(By.id("permanentAddress"));
		
		Address.sendKeys("Mensaje de prueba");
		
		WebElement btnEnviar = driver.findElement(By.id("submit"));

		btnEnviar.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

	}

}