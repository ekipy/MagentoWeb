package features.stepdefinitions;

import config.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magentoapps.DashboardPage;

public class DashboardStepDef extends BaseTest {

    protected DashboardPage dashboardPage;

    @Given("I am on dashboard page")
    public void iAmOnDashboardPage() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.open();
        System.out.println("Has access to Dashboard Page");
    }

    @When("I click navbar")
    public void iClickNavbar() {
        dashboardPage.clickOnNavibar();
        System.out.println("Clicked on Navbar");
    }

    @And("I click tab account")
    public void iClickTabAccount() {
        dashboardPage.clickOnAccountTab();
        System.out.println("Clicked on Account Tab");
    }

    @And("I click create account")
    public void iClickCreateAccount() {
        dashboardPage.clickOnCreateAccountLink();
        System.out.println("Clicked on Create Account Link");
    }

    @Then("I should be redirected to the Register page")
    public void iShouldBeRedirectedToTheRegisterPage() {
        dashboardPage.getRegisterValidationText();
        System.out.println("Successfully redirected to Register Page");
    }
}
