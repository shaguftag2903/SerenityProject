package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTestScenario extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void positiveLogin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElementFacade username = $(By.name("username"));
        username.type("Admin");
        System.out.println("entered username");
        WebElementFacade password = $(By.name("password"));
        password.typeAndEnter("admin123");
        System.out.println("entered password");
        Thread.sleep(5000);
//        System.out.println($(By.tagName("//h6")).shouldBeVisible());
    }
}
