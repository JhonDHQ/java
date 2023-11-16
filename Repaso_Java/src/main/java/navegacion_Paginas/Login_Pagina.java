package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class Login_Pagina {
	
	public Login_Pagina (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);//Inicializamos los pageObjects/Webelements con page factory
												// THIS es una keyword de java con el se indica que la misma 
												//clase donde vamos a inicializar los elementos
	}
	
	//LOGIN PageObject / WebElements
	@FindBy (id ="userName" )
	private WebElement userNametxt;
	
	@FindBy (id ="password")
	private WebElement passwordtxt;
	
	@FindBy (id ="login")
	private WebElement btnLogin;
	
	public void login (String user, String password) 
	{
		Clase_Base.sendKeys(userNametxt, password);
		
		Clase_Base.sendKeys(passwordtxt, password);
		
		Clase_Base.click(btnLogin);
	}

}
