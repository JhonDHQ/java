package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerta_Confirmacion {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Primera Alerta
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert(); // Cambiamos el control a la ventana emergente
		
		System.out.println(alert1.getText());
		
		alert1.accept();  //Aceptamos la alerta
		//alert1.dismiss(); 
		
		if(driver.getPageSource().contains("You clicked: Ok")) 
		{
			System.out.println("Bot�n Aceptar");
		}
		else 
		{
			System.out.println("Bot�n Cancelar");
		}
		
		Thread.sleep(3000);
		
		//driver.close();
	}

}
