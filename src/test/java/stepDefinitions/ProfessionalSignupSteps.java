package stepDefinitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import PageObjects.HomePage;
import PageObjects.ProfessionalSignup;
import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfessionalSignupSteps {
    WebDriver driver = BaseClass.getDriver();
    HomePage hp;
    ProfessionalSignup ps;

    @Given("the user navigates to Signup Account page")
    public void user_navigates_to_register_account_page() {
        BaseClass.getLogger().info("clicking on the email");
        hp = new HomePage(driver);
        hp.Signupfield();
    }

    @Given("the user choose the profesional option and click on it")
    public void the_user_choose_the_profesional_option_and_click_on_it() 
    {
        BaseClass.getLogger().info("clicking on the profesional options");
        ps = new ProfessionalSignup(driver);
        ps.professionaloption();
    }

    @When("the user enters the details into below fields")
    public void user_enters_the_details_into_below_fields(DataTable dataTable) {
        BaseClass.getLogger().info("Enter Name,Email and Phonenumber");
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        ps.fname(dataMap.get("firstName"));
        ps.lname(dataMap.get("lastName"));
      //  ps.efield(dataMap.get("EmailAddress"));
        ps.efield(BaseClass.randomAlphaNumeric()+"@yopmail.com");
        //ps.mobilenumber(dataMap.get("MobileNumber"));
        ps.mobilenumber(BaseClass.randomeNumber());
    }

    @When("the user clicks on Continue button")
    public void the_user_clicks_on_continue_button() {
        BaseClass.getLogger().info("the user click on the continue button");
        ps.contfield();

        // Wait for the "Enter Company Name" input field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Company Name']")));
    }

    @When("the user enters the company details")
    public void the_user_enters_the_company_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
    {
        BaseClass.getLogger().info("Enter Company Name, Password, and Confirm Password");
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        Thread.sleep(10000);
       // ps.companynamefield(dataMap.get("EnterCompanyName"));
        ps.companynamefield(BaseClass.randomeString());
        ps.enterpwd(dataMap.get("Password"));
        ps.confirmpwd(dataMap.get("ConfirmPassword"));
        
    }

    @When("the user selects T&C")
    public void the_user_selects_t_c() throws InterruptedException {
        BaseClass.getLogger().info("User click on the t&c field");
        ps.termsandcondition();
      Thread.sleep(10000);
    }

    @When("the user click on the user clicks on Register button")
    public void the_user_click_on_the_user_clicks_on_register_button() throws InterruptedException {
        BaseClass.getLogger().info("User click on the register field");
        Thread.sleep(10000);
        ps.registerfield();
    }

    @Then("the otp page should open")
    public void the_otp_page_should_open() {
        BaseClass.getLogger().info("The OTP page should be open");
    }
}