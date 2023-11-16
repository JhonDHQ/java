package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerta_Simple {
	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Primera Alerta
	
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Alert alert1 = driver.switchTo().alert(); // Cambiamos el control a la ventana emergente
		
		//System.out.println(alert1.getText());
		
		alert1.accept();  //Aceptamos la alerta
		
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("You successfully clicked an alert")) 
		{
			System.out.println("Texto Capturado");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.close();

	}

}
