package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfessionalSignup extends Basepage
{
WebDriver driver;
public ProfessionalSignup(WebDriver driver)
{
super(driver);
}
@FindBy(xpath="//span[normalize-space()='Sign Up!']")
WebElement signup;
@FindBy(xpath="(//div[normalize-space()='Professional'])[3]")
WebElement professional;
@FindBy(xpath="//input[@placeholder='Enter your first name']")
WebElement firstname;
@FindBy(xpath="//input[@placeholder='Enter your last name']")
WebElement lastname;
@FindBy(xpath="//input[@placeholder='Enter your email address']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
WebElement mobile;
@FindBy(xpath="(//div[normalize-space()='Continue'])[4]")
WebElement cont;
@FindBy(xpath="//input[@placeholder='Enter Company Name']")
WebElement companyname;
@FindBy(xpath="//input[@placeholder='Enter Invitation Code']")
WebElement entercode;
@FindBy(xpath="//input[@placeholder='Enter password']")
WebElement enterpassword;
@FindBy(xpath="//input[@placeholder='Confirm password']")
WebElement confirmpassword;
@FindBy(xpath="(//div[@class='css-146c3p1 r-lrvibr'])[4]")
WebElement tandc;
@FindBy(xpath="(//div[normalize-space()='Register'])[4]")
WebElement register;
public void signupbutton()
{
signup.click();
}
public void professionaloption()
{
professional.click();
}
public void fname(String first)
{
firstname.sendKeys(first);
}
public void lname(String last)
{
lastname.sendKeys(last);
}
public void efield(String emailf)
{
email.sendKeys(emailf);
}
/*public void emfield()
{
email.sendKeys("mvi@yopmail.com");
}*/
public void mobilenumber(String mnumber)
{
mobile.sendKeys(mnumber);
}
public void contfield()
{
cont.click();
}
public void companynamefield(String cfield)
{
companyname.sendKeys(cfield);
}
public void codefield()
{
entercode.sendKeys("");
}
public void enterpwd(String enterpwdfield)
{
enterpassword.sendKeys(enterpwdfield);
}
public void confirmpwd(String confirmpwdfield)
{
confirmpassword.sendKeys(confirmpwdfield);
}
public void termsandcondition()
{
tandc.click();
}
public void registerfield()
{
register.click();
}
}
