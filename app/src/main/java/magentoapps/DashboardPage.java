package magentoapps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    
    WebDriver driver;

    By navibar = By.cssSelector("span.nav-toggle");
    By tabAccount = By.cssSelector(".section-item-title.nav-sections-item-title");
    By linkCreatedAccount = By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
    By registerValidation = By.cssSelector("span.base[data-ui-id='page-title-wrapper']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    public void clickOnNavibar() {
        WebElement navibarElement = driver.findElement(navibar);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", navibarElement);
    }

    public void clickOnAccountTab() {
        WebElement accountTab = driver.findElement(tabAccount);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", accountTab);
    }

    public void clickOnCreateAccountLink() {
        WebElement createAccountLink = driver.findElement(linkCreatedAccount);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", createAccountLink);
    }

    public void getRegisterValidationText() {
        WebElement validationElement = driver.findElement(registerValidation);
        assertTrue(validationElement.isDisplayed());
        assertEquals("Create New Customer Account", validationElement.getText());
        // if (validationElement.isDisplayed()) {
        //     return validationElement.getText();
        // } else {
        //     System.out.println("Register validation text is not displayed.");
        //     return "";
        // }
    }
}
