package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alerta_Prompt {

	public static void main(String[] args) throws InterruptedException {
		
		
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		
		WebDriver driver = new ChromeDriver(); //objeto de WebdriverWebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert(); // Cambiamos el control a la ventana emergente
		
		System.out.println(alert1.getText());
		
		Thread.sleep(3000);
		
		alert1.sendKeys("SELENIUM");
		
		alert1.accept();
		
		if(driver.getPageSource().contains("You entered: SELENIUM")) 
		{
			System.out.println("Boton Aceptar");
		}
		if(driver.getPageSource().contains("You entered: null"))
		{
			System.out.println("Boton Cancelar");
		}
		
		Thread.sleep(3000);
		
		//driver.close();

	}

}
