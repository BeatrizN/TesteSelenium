package teste;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginUsuarioInvalido {

	static LoginPage login;
		
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/login");

		login = new LoginPage(driver);
		
	}

	
	@Test
	public void test() {
		login.preencherCampos();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		driver.quit();
	}

}
