package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void preencherCampos(){
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("user@phptravels.com");
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("demouser");
		//WebElement botao = driver.findElement(By.xpath(""));
		//botao.click();
	}

}
