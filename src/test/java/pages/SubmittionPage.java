package pages;

import com.codeborne.selenide.SelenideElement;

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


}
