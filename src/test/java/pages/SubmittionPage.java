package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SubmittionPage {
    private SelenideElement
            userSubbmition = $("#example-modal-sizes-title-lg"),
            userLineCheck = $(".table-responsive");

    public SubmittionPage setSubmitionConfirmation(String value) {
        userSubbmition.should(appear);
        userSubbmition.shouldHave(text(value));

        return this;
    }

    public SubmittionPage lineSubmittionConfirmation(String key, String value) {
        userLineCheck.$(byText(key)).parent().shouldHave(text(value));

        return this;
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }


}
