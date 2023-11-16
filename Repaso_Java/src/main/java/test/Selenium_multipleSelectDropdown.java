package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_multipleSelectDropdown {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe"; //variable string donde esta chrome
		System.setProperty("webdriver.chrome.driver", exePath); //de donde toma el chrome driver
		WebDriver driver = new ChromeDriver(); //nuevo objeto de chrome driver
		driver.manage().window().maximize();   // Maximizamos la pantalla
		driver.get("https://demoqa.com/select-menu"); //donde iremos
		
		
		//OBTENEMOS LOS ELEMENTOS
		JavascriptExecutor js = (JavascriptExecutor) driver;   
		js.executeScript("window.scrollTo(0,280)");
		
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]"));
		
		dropdown.click();
		
		WebElement cajatexto = driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
		
		cajatexto.sendKeys("Green");
		
		cajatexto.sendKeys(Keys.ENTER);
		
		
		
		WebElement multipleSelect = driver.findElement(By.xpath("//div[.=\"Select...\" and @class=' css-1wa3eu0-placeholder']"));
		
		multipleSelect.click();
		
		/*WebElement dropdown = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder'][contains(.,'Select...')]"));
		
		dropdown.click();*/
		
		//Select dropdown1 = new Select(driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder'][contains(.,'Select...')]")));
		
		//dropdown1.selectByVisibleText("Green");
		
		//WebElement texto = driver.findElement(By.xpath("//div/div/input[@id=\"react-select-4-input\"]"));
		
		//texto.click();
		
		//dropdown.sendKeys("green");
		
		//dropdown.sendKeys(Keys.ENTER);
		
		//UserName.sendKeys("Admin");
		
		//Select dropdown = new Select(driver.findElement(By.xpath("(//div[contains(.,'Select...')])[11]")));
		

		
		

	}

}
