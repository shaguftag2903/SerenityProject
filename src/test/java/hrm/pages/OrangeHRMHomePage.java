package hrm.pages;


import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {

    public void verifyTitle(){
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
    }

    public void enterCreds(){
        $(By.name("username")).type("Admin");
        System.out.println("entered username");
        $(By.name("password")).typeAndEnter("admin123");
        System.out.println("entered password");
    }

    public void verifyLogin(){
        String title = getDriver().getCurrentUrl();
        Assert.assertTrue(title.contains("dashboard"));
    }
}
