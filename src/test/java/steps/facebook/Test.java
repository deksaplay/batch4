package steps.facebook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.facebook.TestPO;
import utilities.ThreadManager;

public class Test {
    private WebDriver driver = ThreadManager.getDriver();
    TestPO test = new TestPO(driver);

    @Given("j,shbxjsl\\/")
    public void j_shbxjsl() throws InterruptedException {
       test.ClickOnBlabla();
    }

    @When("click")
    public void click() throws InterruptedException {
       test.ClickOnTextBlabla();
    }

    @Then("system display message {string}")
    public void system_display_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Open url")
    public void open_url() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
