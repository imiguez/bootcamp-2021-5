package bdd.pages;

import bdd.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLRegistrationPage extends SeleniumBase {

    public MLRegistrationPage(WebDriver driver) {
        super(driver);
    }

    By continuarBtn = By.xpath("//button[@class='andes-button button--submit andes-button--large andes-button--loud']");


    public boolean esClickeableElBotonContinuar() {
        return isLocable(continuarBtn);
    }



}
