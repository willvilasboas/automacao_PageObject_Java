package steps;

import org.openqa.selenium.WebDriver;

public class PaginaBase {
	
    WebDriver driver;
	
	public PaginaBase(WebDriver driver) {
	   this.driver = driver;	
	}
	public WebDriver getDriver() {
		return driver;
	}
	
}
