package tests;

import org.junit.jupiter.api.Test;

public class ToolsQAWithPageObjectsTest extends TestBase {


    @Test
    void reqistrationFormTest() {

        String userName = "Ivan";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName("Ivanov")
                .setUserEmail("IvanovIvan@mail.ru")
                .setGender("Male")
                .setPhone("1234567890")
                .setBirthDate("30", "June", "1990")
                .setSubject("Accounting")
                .setSubject("Commerce")
                .setHobbies("Sports")
                .setFailLoad("photo_2022-09-18_22-26-00.jpg")
                .setAdress("Russia, Saint-Petersburg")
                .setState("Haryana")
                .setCity("Panipat")
                .setSubmit();

        submittionPage.setSubmitionConfirmation("Thanks for submitting the form")
                .lineSubmittionConfirmation("Student Name", userName + " Ivanov")
                .lineSubmittionConfirmation("Student Email", "IvanovIvan@mail.ru")
                .lineSubmittionConfirmation("Gender", "Male")
                .lineSubmittionConfirmation("Mobile", "1234567890")
                .lineSubmittionConfirmation("Date of Birth", "30 June,1990")
                .lineSubmittionConfirmation("Subjects", "Accounting, Commerce")
                .lineSubmittionConfirmation("Hobbies", "Sports")
                .lineSubmittionConfirmation("Picture", "photo_2022-09-18_22-26-00.jpg")
                .lineSubmittionConfirmation("Address", "Russia, Saint-Petersburg")
                .lineSubmittionConfirmation("State and City", "Haryana Panipat");
    }
}
