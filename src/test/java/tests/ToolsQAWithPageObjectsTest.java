package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ToolsQAWithPageObjectsTest extends TestBase {


    @Feature("Tests & Reporting study")
    @Story("PageObject+Facker+Allure+Jenkins test")
    @Owner("PK")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Demoqa successfull registration test")
    @Test
    @Tag("remote")
    void reqistrationFormTest() {

        TestData data = new TestData();

        step("Открываем страницу формы для регистрации", () -> {
            registrationPage.openPage();
        });
        step("Вводим имя пользователя", () -> {
            registrationPage.setFirstName(data.firstNameData);
        });
        step("Вводим фамилию пользователя", () -> {
            registrationPage.setLastName(data.lastNameData);
        });
        step("Вводим email пользователя", () -> {
            registrationPage.setUserEmail(data.userEmailData);
        });
        step("Выбираем пол пользователя", () -> {
            registrationPage.setGender(data.genderData);
        });
        step("Вводим номер телефона пользователя", () -> {
            registrationPage.setPhone(data.phoneData);
        });
        step("Вводим дату рождения пользователя", () -> {
            registrationPage.setBirthDate(data.birthDayData, data.birthMonthData, data.birthYearData);
        });
        step("Вводим предметы для пользователя", () -> {
            registrationPage.setSubject(data.subjectData1);
        });
        step("Выбираем хобби пользователя", () -> {
            registrationPage.setHobbies(data.hobbiesData);
        });
        step("Загружаем файл пользователя", () -> {
            registrationPage.setFailLoad("photo_2022-09-18_22-26-00.jpg");
        });
        step("Вводим адрес пользователя", () -> {
            registrationPage.setAdress(data.adressData);
        });
        step("Выбираем штат пользователя", () -> {
            registrationPage.setState(data.stateData);
        });
        step("Выбираем город пользователя", () -> {
            registrationPage.setCity(data.cityData);
        });
        step("Нажимаем Submit", () -> {
            registrationPage.setSubmit();
        });

        step("Подтверждаем переход на страницу с введенными данными", () -> {
            submittionPage.setSubmitionConfirmation("Thanks for submitting the form");
        });
        step("Подтверждаем, что оттображенные имя и фамилия соответствуют введенным", () -> {
            submittionPage.lineSubmittionConfirmation("Student Name", data.firstNameData + " " + data.lastNameData);
        });
        step("Подтверждаем, что оттображенный email соответствует введенному", () -> {
            submittionPage.lineSubmittionConfirmation("Student Email", data.userEmailData);
        });
        step("Подтверждаем, что оттображенный пол соответствует выбранному", () -> {
            submittionPage.lineSubmittionConfirmation("Gender", data.genderData);
        });
        step("Подтверждаем, что оттображенный номер телефона соответствует введенному", () -> {
            submittionPage.lineSubmittionConfirmation("Mobile", data.phoneData);
        });
        step("Подтверждаем, что оттображенная дата рождения соответствует введенной", () -> {
            submittionPage.lineSubmittionConfirmation("Date of Birth", data.birthDayData + " " + data.birthMonthData + "," + data.birthYearData);
        });
        step("Подтверждаем, что оттображенный предмет соответствует выбранному", () -> {
            submittionPage.lineSubmittionConfirmation("Subjects", data.subjectData1);
        });
        step("Подтверждаем, что оттображенное хобби соответствует выбранному", () -> {
            submittionPage.lineSubmittionConfirmation("Hobbies", data.hobbiesData);
        });
        step("Подтверждаем, что загруженный файл иммет имя photo_2022-09-18_22-26-00.jpg", () -> {
            submittionPage.lineSubmittionConfirmation("Picture", "photo_2022-09-18_22-26-00.jpg");
        });
        step("Подтверждаем, что оттображенный адрес соответствует введенному", () -> {
            submittionPage.lineSubmittionConfirmation("Address", data.adressData);
        });
        step("Подтверждаем, что оттображенные штат и город соответствуют выбранным", () -> {
            submittionPage.lineSubmittionConfirmation("State and City", data.stateData + " " + data.cityData);
        });
    }

}
