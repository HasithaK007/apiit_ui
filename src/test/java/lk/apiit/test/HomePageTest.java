package lk.apiit.test;

import lk.apiit.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class HomePageTest {
    HomePage homePage;
    CoursesPage coursesPage;
    ContactPage contactPage;
    StudentLifePage studentLifePage;
    ApiitSriLankaPage apiitSriLankaPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new HomePage();
        coursesPage = homePage.clickLawBtn();

    }

    @Test
    public void testName() {
    }
}
