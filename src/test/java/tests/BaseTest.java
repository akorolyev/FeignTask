package tests;

import aquality.appium.mobile.application.AqualityServices;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private static int stepNumber = 1;

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    protected static void logStep(String message) {
        String format = "Step %d: %s";
        AqualityServices.getLogger().info(String.format(format, stepNumber, message));
        stepNumber++;
    }
}
