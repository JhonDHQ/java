package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Practica {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		System.setProperty("webdriver.chrome.driver", exePath); // agregar la propiedad con la ruta de chromedriver
		
		WebDriver driver = new ChromeDriver(); //objeto de Webdriver
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();//maximizar Windows
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		
		username.sendKeys("Jhon Douglas");
		
		//Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id(""));
		
		email.sendKeys("pruebas@email.com");
		
		//Thread.sleep(5000);
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("ID Selenium");
		
		//driver.findElement(By.name("q")).sendKeys("Name Selenium");
		
		//driver.findElement(By.tagName("textarea")).sendKeys("TAGNAME");
		
		//driver.findElement(By.className("gLFyf")).sendKeys("ClassName");
		
		//driver.findElement(By.linkText("Quechua")).click();
		
		//driver.findElement(By.partialLinkText("Watch")).click();
		

		
		WebElement boton = driver.findElement(By.id("submit"));
		
		boton.click();
		
		//driver.findElement(By.cssSelector("input#userName")).click();
		
		

		
		

	}

}
