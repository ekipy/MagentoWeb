package features.stepdefinitions;

import org.junit.Test;

import config.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magentoapps.RegisterPage;

public class RegisterStepDef extends BaseTest {

    protected RegisterPage registerPage;

 
    @Before
    public void setUp() {
        // Initialize the WebDriver and other necessary setups if needed
        System.out.println("Setting up the test environment");
    }

    @After
    public void tearDown() {
        // Close the WebDriver and clean up after tests
        if (driver != null) {
            driver.quit();
            System.out.println("Test environment cleaned up");
        }
    }
    
    @Given("saya berada pada page register")
    public void iAmOnTheRegisterPage() {
        registerPage = new RegisterPage(driver);
        registerPage.openregisterPage();
        System.out.println("Has access to Register Page");
    }

    @When("saya mengisi field firstname dengan {string}")
    public void iFillFirstName(String firstName) {
        registerPage.setFirstName(firstName);
        System.out.println("Filled First Name: " + firstName);
    }

    @When("saya mengisi field lastname dengan {string}")
    public void iFillLastName(String lastName) {
        registerPage.setLastName(lastName);
        System.out.println("Filled Last Name: " + lastName);
    }

    @When("saya mengisi field email dengan {string}")
    public void iFillEmailAddress(String emailAddress) {
        registerPage.setEmailAddress(emailAddress);
        System.out.println("Filled Email Address: " + emailAddress);
    }

    @When("saya mengisi field password dengan {string}")
    public void iFillPassword(String password) {
        registerPage.setPassword(password);
        System.out.println("Filled Password: " + password);
    }

    @When("saya mengisi field confirm password dengan {string}")
    public void iFillConfirmPassword(String confirmPassword) {
        registerPage.setConfirmPassword(confirmPassword);
        System.out.println("Filled Confirm Password: " + confirmPassword);
    }

    @When("saya menekan tombol create")
    public void iClickCreateButton() {
        registerPage.clickCreatedButton();
        System.out.println("Clicked Create Button");
    }

    @Then("sistem menampilkan pesan {string}")
    public void sistemMenampilkanPesan(String expectedMessage) {
        String actualMessage = "";

        switch (expectedMessage) {
            case "First Name is required.":
                actualMessage = registerPage.getFirstNameError();
                break;
            case "Last Name is required.":
                actualMessage = registerPage.getLastNameError();
                break;
            case "Email Address is required.":
                actualMessage = registerPage.getEmailAddressError();
                break;
            case "This is a required field.":
                actualMessage = registerPage.getPasswordError();
                break;
            case "Please make sure your passwords match.":
                actualMessage = registerPage.getConfirmPasswordError();
                break;
            case "Minimum password length is 8 characters.":
                actualMessage = registerPage.getPasswordError();
                break;
            case "Email address is not valid.":
                actualMessage = registerPage.getEmailAddressError();
                break;
            default:
                System.out.println("No error message to verify");
        }
    }
    
}
