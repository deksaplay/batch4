package pageobject.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class TestPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public TestPO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    /*
     * All WebElements are identified by @FindBy annotation
     *
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
     * className, xpath as attributes.
     */

    @FindBy(id = "email")
    private WebElement emailOrPhoneNumberEditText;


    public void ClickOnBlabla() throws InterruptedException {
        selenium.clickOn(emailOrPhoneNumberEditText);
    }


    public void ClickOnTextBlabla() throws InterruptedException {
        selenium.clickOn(emailOrPhoneNumberEditText);
    }
}
