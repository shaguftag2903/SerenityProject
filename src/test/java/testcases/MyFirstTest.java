package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@RunWith(SerenityRunner.class)
public class MyFirstTest extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void getGoogleData(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("firefly"+ Keys.ENTER);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(titleContains("firefly - Google Search"));
        Assert.assertTrue((driver.getTitle()).contains("firefly - Google Search"));
    }

}
