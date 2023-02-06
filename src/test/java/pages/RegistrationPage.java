package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import pages.сomponents.CalendarComponent;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.attachment;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGender = $("#genterWrapper"),
            userPhone = $("#userNumber"),
            birthDay = $("#dateOfBirthInput"),
            userSubject = $("#subjectsInput"),
            userHobbies = $("#hobbiesWrapper"),
            userFile = $("#uploadPicture"),
            userAdress = $("#currentAddress"),
            userState = $("#stateCity-wrapper"),
            userCity = $("#stateCity-wrapper"),
            userSubmit = $("#submit");


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form/");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        userGender.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPhone(String value) {
        userPhone.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDay.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String value) {
        userSubject.setValue(value).submit();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        userHobbies.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setFailLoad(String value) {
        userFile.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setAdress(String value) {
        userAdress.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        userState.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        $("#city").click();
        userCity.find(byText(value)).click();

        return this;
    }

    public void setSubmit() {
        userSubmit.click();
    }
}
