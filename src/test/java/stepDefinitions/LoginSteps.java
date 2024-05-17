package stepDefinitions;

import java.io.IOException;
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
import utilities.DataReader;

public class LoginSteps 
{
WebDriver driver;
HomePage hp;
LoginPage lp;
DashboardPage dp;
List<HashMap<String,String>>datamap;


/*@Given("the user is on the login page")
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
//lp.Emailfield();
lp.setEmail(email);
lp.setPassword(password);
//lp.Passwordfield();
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
}*/


    //*******   Data Driven test **************
@Given("the user should be redirected to the login Page by passing email and password with excel row {string}")  
    public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_data(String rows) throws IOException
    {
	datamap = DataReader.data("/Users/hestabit/eclipse-workspace/Icontent_logindata.xlsx", "Sheet1");


        int index=Integer.parseInt(rows)-1;
        String email= datamap.get(index).get("email");
        String pwd= datamap.get(index).get("password");
        String exp_res= datamap.get(index).get("res");

        lp=new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);
        lp.Loginbutton();
   /*     macc=new MyAccountPage(BaseClass.getDriver());
        try
        {
            boolean targetpage=macc.isMyAccountPageExists();
            System.out.println("target page: "+ targetpage);
            if(exp_res.equals("Valid"))
            {
                if(targetpage==true)
                {
                    MyAccountPage myaccpage=new MyAccountPage(BaseClass.getDriver());
                    myaccpage.clickLogout();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if(exp_res.equals("Invalid"))
            {
                if(targetpage==true)
                {
                    macc.clickLogout();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }


        }
        catch(Exception e)
        {

            Assert.assertTrue(false);
        }*/
      }
 
}
