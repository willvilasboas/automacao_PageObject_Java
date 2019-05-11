package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import steps.PaginaBase;

public class LoginPages extends PaginaBase {
	
	public LoginPages(WebDriver driver) {
		super(driver);
	}

	public void realizaLogin(String userName, String userPassword) {
		
		getDriver().findElement(By.id("txtUsuario")).clear();
		getDriver().findElement(By.id("txtUsuario")).sendKeys(userName);
		getDriver().findElement(By.id("txtSenha")).clear();
		getDriver().findElement(By.id("txtSenha")).sendKeys(userPassword);
		getDriver().findElement(By.id("btnLogin")).click();
	}	
	
	public String verificaExistenciaElemento(){
		return getDriver().findElement(By.id("lblLogout")).getText();
	}
	
}
