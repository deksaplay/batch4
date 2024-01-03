package steps.hdi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobject.hdi.LoginPO;
import utilities.ThreadManager;

public class LoginFormSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private LoginPO login = new LoginPO(driver);

    @When("user input hdi email {string}")
    public void user_input_hdi_email(String username) {
        login.enterUsername(username);
    }

    @When("user input  hdi password {string}")
    public void user_input_hdi_password(String password) {
        login.enterPassword(password);
    }

    @When("user click on hdi login button")
    public void user_click_on_hdi_login_button() throws InterruptedException {
        login.clickOnLoginButton();
    }

    @Then("system display hdi login alert box is {string}")
    public void system_display_hdi_login_alert_box_is(String message) {
        Assert.assertEquals(login.getLoginMessageError(), message, "Message error not match");
    }
}
