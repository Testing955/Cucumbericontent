package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends LoginPage
{
WebDriver driver;
public DashboardPage(WebDriver driver)
{
super(driver);
}
@FindBy(xpath="//span[normalize-space()='Dashboard']")
WebElement Dashboard;
public void Dashboardfunction()
{
Dashboard.click();
}
}
