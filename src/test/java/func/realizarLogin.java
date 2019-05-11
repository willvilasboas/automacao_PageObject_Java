package func;

import static org.junit.Assert.assertEquals;

import pages.LoginPages;
import setup.setupBase;


public class realizarLogin extends setupBase {
	
	LoginPages login = new LoginPages(driver);
	
	public void  acessarUrl()
	{
		navegateTo("https://aplic.inmetrics.com.br/pcweb/login.aspx");
	}
	public void logarAplicacao()
	{
		logar("willianv", "18011984Ww");	
	}
	public void logar(String userName, String userPassword) {
		login.realizaLogin(userName, userPassword);		
	}
	
	public void validarPaginaInicial()
	{
	  assertEquals("Logout", login.verificaExistenciaElemento());
	}
	
	public void fecharBrowser() {
		this.closeNavegator();
	}
}
