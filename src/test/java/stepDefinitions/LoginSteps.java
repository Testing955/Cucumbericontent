package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import PageObjects.DashboardPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
WebDriver driver;
HomePage hp;
LoginPage lp;
DashboardPage dp;
List<HashMap<String,String>>datamap;


@Given("the user is on the login page")
public void the_user_is_on_the_login_page() 
{
BaseClass.getLogger().info("clicking on the email");
hp = new HomePage(BaseClass.getDriver());
hp.efield();
}
@When("user enters email as {string} and password as {string}")
public void user_enters_email_as_and_password_as(String email, String password) 
{
 BaseClass.getLogger().info("entering email and password");
lp = new LoginPage(BaseClass.getDriver());
lp.Emailfield();
lp.Passwordfield();
}
@When("when the user clicks on the login button")
public void when_the_user_clicks_on_the_login_button() 
{
lp.Loginbutton();
BaseClass.getLogger().info("Click on the login button");
}
@Then("the user should be redirected to the Dashboardpage")
public void the_user_should_be_redirected_to_the_dashboardpage() 
{
dp = new DashboardPage(BaseClass.getDriver());
dp.Dashboardfunction();
}
}

