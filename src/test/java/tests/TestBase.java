package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.SubmittionPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    SubmittionPage submittionPage = new SubmittionPage();

    @BeforeAll
    public static void beforeAll() {

        Configuration.browserSize = "1920x1080";
    }
}
