package magentoapps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openregisterPage() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    // locators
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By emailAddress = By.id("email_address");
    By password = By.id("password");
    By confirmPassword = By.id("password-confirmation");

    // error message
    By firstnameError = By.id("firstname-error");
    By lastNameError = By.id("lastname-error");
    By emailAddressError = By.id("email_address-error");
    By passwordError = By.id("password-error");
    By confirmPasswordError = By.id("password-confirmation-error");

    By createdButton = By.cssSelector("button.action.submit.primary");

    // actionmethod
    public void setFirstName(String firstNameValue) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    public void setLastName(String lastNameValue) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    public void setEmailAddress(String emailAddressValue) {
        driver.findElement(emailAddress).clear();
        driver.findElement(emailAddress).sendKeys(emailAddressValue);
    }

    public void setPassword(String passwordValue) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void setConfirmPassword(String confirmPasswordValue) {
        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(confirmPasswordValue);
    }

    public void clickCreatedButton() {
        driver.findElement(createdButton).click();
    }

    // error message retrieval methods
    public String getFirstNameError() {
        return driver.findElement(firstnameError).getText();
    }

    public String getLastNameError() {
        return driver.findElement(lastNameError).getText();
    }

    public String getEmailAddressError() {
        return driver.findElement(emailAddressError).getText();
    }

    public String getPasswordError() {
        return driver.findElement(passwordError).getText();
    }

    public String getConfirmPasswordError() {
        return driver.findElement(confirmPasswordError).getText();
    }
}
