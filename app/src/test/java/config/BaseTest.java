package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected static WebDriver driver;

    public void setUp() {

        // Initialize WebDriver here (e.g., ChromeDriver, FirefoxDriver)
        // driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration
        options.addArguments("--window-size=1920,1080"); // Set window size for headless mode
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        WebDriverManager.chromedriver().setup(); // Ensure WebDriverManager is set up
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        driver.manage().window().maximize(); // Maximize the window
    }   
    
}
