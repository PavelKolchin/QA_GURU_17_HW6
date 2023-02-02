package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.RegistrationPage;
import pages.SubmittionPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    SubmittionPage submittionPage = new SubmittionPage();

    @BeforeAll
    public static void beforeAll() {

        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
