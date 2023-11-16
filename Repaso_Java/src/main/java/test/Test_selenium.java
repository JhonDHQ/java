package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		//Agregar las propiedades
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/inventory.html");
	
		//driver.get("https://demoqa.com/text-box");
		
		//Maximizar la ventana
		
		driver.manage().window().maximize();
		
		//Obtenemos objetos/webelements de la pagina web
		
		/*WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		WebElement direccion1 = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
		WebElement direccion2 = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		WebElement btnenviar = driver.findElement(By.xpath("//button[@id='submit']"));
		
		WebElement element = driver.findElement(By.id("permanentAddress"));
		
		username.sendKeys("Jhon Douglas Huanca Quisbert");
		Thread.sleep(1000);
		email.sendKeys("Test@gmail.com");
		Thread.sleep(1000);
		
		direccion1.sendKeys("Calle Canada #54");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
		Thread.sleep(1000);
		
		direccion2.sendKeys("Santa Cruz de la Sierra");
		Thread.sleep(1000);
		
		btnenviar.click();*/
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		
		
	
		
		username.sendKeys("standard_user");
		
		password.sendKeys("secret_sauce");
		
		btnlogin.click();
		
		
		
		
		WebElement btnburguer = driver.findElement(By.xpath("//button[contains(@id,'react-burger-menu-btn')]"));
		
		btnburguer.click();
		
		//Método del explorador
		String title =driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		//Validación de la URL
		String url = driver.getCurrentUrl();
		System.out.print("La URL actual es: "+ url);
		//Métodos de navegación
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	

		
		
	}

}