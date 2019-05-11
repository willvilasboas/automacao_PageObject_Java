package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setupBase {
	
	protected WebDriver driver;
	static String driverPath = "C:\\";
	
	public setupBase()
	{
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
	    this.driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void navegateTo(String url) {
		driver.get(url);
	}
	public void closeNavegator() {
		driver.close();
	}
}
	
