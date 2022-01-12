package test;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	
@Test
public void TechfiosLoginTest() {

	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://techfios.com/billing/?ng=admin/");
	
LoginPage logintotechfios  =  PageFactory.initElements(driver, LoginPage.class);	

logintotechfios.Login("techfiosdemo@gmail.com", "abc123");


driver.close();
driver.quit();             


}

}
