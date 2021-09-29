package bdd.pages;

import bdd.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLProductPage extends SeleniumBase {

    public MLProductPage(WebDriver driver) {
        super(driver);
    }

    By buyBtn = By.xpath("//button[@class='andes-button andes-button--loud']");

    public void buyProduct() {
        waitElementToBeClickable(buyBtn, 10);
        click(buyBtn);
    }


}
