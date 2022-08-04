package org.example.tests;

import pages.SmokePage;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
    @Test
    public void isPageVisible() {
        SmokePage.testGooglePageAvailability();
    }
}