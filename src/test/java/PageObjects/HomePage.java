package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage
{
WebDriver driver;
public HomePage(WebDriver driver)
{
super(driver);
}
@FindBy(xpath="//input[@placeholder='Enter your email']")
WebElement emailfield;
@FindBy(xpath="//input[@placeholder='Enter your password']")
WebElement passwordfield;
@FindBy(xpath="(//div[normalize-space()='Login'])[3]")
WebElement Loginbutton;
@FindBy(xpath="//span[normalize-space()='Sign Up!']")
WebElement signupbutton;
@FindBy(xpath="//span[normalize-space()='Forgot password']")
WebElement forgetpassword;
public void efield()
{
emailfield.click();
}
public void Signupfield()
{
	signupbutton.click();
}
}
