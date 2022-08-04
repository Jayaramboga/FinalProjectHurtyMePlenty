package pages;

import org.openqa.selenium.WebDriver;

public class SmokePage extends CalculatorPage {
    public SmokePage(WebDriver driver) {
        super(driver);
    }

    public static void testGooglePageAvailability() {

        driver.getTitle().contains("Google Cloud");
        System.out.println(driver.getTitle().contains("Google"));
    }
}