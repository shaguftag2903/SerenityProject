package hrm.pages;

import net.serenitybdd.annotations.Step;

public class HomePage {

    OrangeHRMHomePage orangeHRMHomePage;

    @Step("This is to verify title")
    public void verifyTitle(){
        orangeHRMHomePage.verifyTitle();
    }

    @Step("These are the creds for login")
    public void enterCreds(){
        orangeHRMHomePage.enterCreds();
    }

    @Step("validating the success login")
    public void verifyLogin(){
        orangeHRMHomePage.verifyLogin();
    }
}
