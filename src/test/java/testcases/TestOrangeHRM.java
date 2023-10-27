package testcases;

import hrm.pages.HomePage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestOrangeHRM extends PageObject {

    @Managed
    WebDriver driver;

    @Steps
    HomePage homePage;

    @Test
    public void positiveLogin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        homePage.verifyTitle();
        homePage.enterCreds();
        Thread.sleep(2000);
        homePage.verifyLogin();
        Thread.sleep(2000);
    }
}
