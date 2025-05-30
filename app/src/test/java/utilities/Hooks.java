package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {
    // This class can be used to set up hooks for tests, such as before and after methods.
    // For example, you can use it to initialize WebDriver or clean up resources after tests.

    @Before
    public void beforeTest() {
        setUp();
        System.out.println("Setting up the test environment...");
    }

    @After
    public void afterTest() {
        driver.quit(); // Ensure the WebDriver is closed after the test
        System.out.println("Cleaning up after the test...");
    }
    
}
