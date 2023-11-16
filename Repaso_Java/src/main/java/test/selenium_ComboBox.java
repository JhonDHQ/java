
package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_ComboBox {


	public static void main(String[] args) throws InterruptedException  {
		
		String exePath = "./driver/chromedriver.exe";// Especificamos la ruta del chromedriver	
		
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		
		WebDriver driver = new ChromeDriver(); //nuevo objeto de chrome driver
		
		driver.manage().window().maximize();   // Maximizamos la pantalla
		
		driver.get("https://demoqa.com/select-menu"); //donde iremos
		
		
		//OBTENEMOS LOS ELEMENTOS
		//JavascriptExecutor js = (JavascriptExecutor) driver;   
		//js.executeScript("window.scrollTo(0,280)");
		
		Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		oldStyleMenu.selectByIndex(1);
		Thread.sleep(3000);
		
		//Seleccion por valor
		oldStyleMenu.selectByValue("8");
		Thread.sleep(3000);
		
		//Seleccionamospor texto
		
		oldStyleMenu.selectByVisibleText("Magenta");
		
	}

}
