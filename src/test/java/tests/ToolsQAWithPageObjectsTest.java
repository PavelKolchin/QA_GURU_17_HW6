package tests;

import org.junit.jupiter.api.Test;

public class ToolsQAWithPageObjectsTest extends TestBase {


    @Test
    void reqistrationFormTest() {

        TestData data = new TestData();

        registrationPage.openPage()
                .setFirstName(data.firstNameData)
                .setLastName(data.lastNameData)
                .setUserEmail(data.userEmailData)
                .setGender(data.genderData)
                .setPhone(data.phoneData)
                .setBirthDate(data.birthDayData, data.birthMonthData, data.birthYearData)
                .setSubject(data.subjectData1)
                .setHobbies(data.hobbiesData)
                .setFailLoad("photo_2022-09-18_22-26-00.jpg")
                .setAdress(data.adressData)
                .setState(data.stateData)
                .setCity(data.cityData)
                .setSubmit();

        submittionPage.setSubmitionConfirmation("Thanks for submitting the form")
                .lineSubmittionConfirmation("Student Name", data.firstNameData + " " + data.lastNameData)
                .lineSubmittionConfirmation("Student Email", data.userEmailData)
                .lineSubmittionConfirmation("Gender", data.genderData)
                .lineSubmittionConfirmation("Mobile", data.phoneData)
                .lineSubmittionConfirmation("Date of Birth", data.birthDayData + " " + data.birthMonthData + "," + data.birthYearData)
                .lineSubmittionConfirmation("Subjects", data.subjectData1)
                .lineSubmittionConfirmation("Hobbies", data.hobbiesData)
                .lineSubmittionConfirmation("Picture", "photo_2022-09-18_22-26-00.jpg")
                .lineSubmittionConfirmation("Address", data.adressData)
                .lineSubmittionConfirmation("State and City", data.stateData + " " + data.cityData);
    }

}
