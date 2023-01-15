package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestToolsQA {

    @BeforeAll
    static void beforeEach () {
        Configuration.browserSize = "1920*1080";
   }

    @Test
    void reqistrationFormTest() {

        open("https://demoqa.com/automation-practice-form/");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("IvanovIvan@mail.ru");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Accounting").pressEnter();
        $("#subjectsInput").setValue("Commerce").pressEnter();
        $("#hobbiesWrapper").find(byText("Sports")).click();
//        $("#uploadPicture").uploadFile(new File("src/test/resources/photo_2022-09-18_22-26-00.jpg"));
        $("#uploadPicture").uploadFromClasspath("photo_2022-09-18_22-26-00.jpg");
        $("#currentAddress").setValue("Russia, Saint-Petersburg");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ivan"),text("Ivanov"),text("1234567890"));
    }
}
