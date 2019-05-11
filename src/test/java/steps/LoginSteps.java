package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import func.realizarLogin;

public class LoginSteps  {

	WebDriver driver;
	realizarLogin login = new realizarLogin();
	
	@Dado("^que estou acessando a aplicacao$")
	public void que_estou_acessando_a_aplicacao()  {
		login.acessarUrl(); 
	}
	@Quando("^informo os dados de um usuario valido$")
	public void informo_os_dados_de_um_usuario_valido() {	
	 login.logarAplicacao();
    }
	@Entao("^valido se estou logado na tela Inicial$")
	public void valido_se_estou_logado_na_tela_Inicial()  {
	   login.validarPaginaInicial();
	   //login.fecharBrowser();
	  	    
	}
	
	@After
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
