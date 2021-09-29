package bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLRegisterLoginPage extends MLRegistrationPage {

    public MLRegisterLoginPage(WebDriver driver) {
        super(driver);
    }

    By loginMsg = By.xpath("//*[@id=\"root-app\"]//h1");

    public String getLoginMessage() {
        return getText(loginMsg);
    }

}
