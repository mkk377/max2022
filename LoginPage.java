package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
public LoginPage(WebDriver ldriver)	{
this.driver=ldriver;

}
          @FindBy(how=How.ID,using="username")
           WebElement Email;

          @FindBy(how=How.ID,using="password")
           WebElement password;

          @FindBy(how=How.NAME,using="login")
           WebElement SignInButton;

public void Login(String Email, String password) {
	
	 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	 driver.findElement(By.id("password")).sendKeys("abc123");
     SignInButton.click();
}
}
