package bdd.pages;

import bdd.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLOffersPage extends SeleniumBase {

    public MLOffersPage(WebDriver driver) {
        super(driver);
    }


    By offerOldPrice = By.xpath("//li[@class='promotion-item'][1]//span[@class='promotion-item__oldprice']");
    By offerNewPrice = By.xpath("//li[@class='promotion-item'][1]//span[@class='promotion-item__price']");


    public boolean isOldPriceLowwerThanOfferPrice() {
        int oldPrice = Integer.parseInt(getText(offerOldPrice).replace("$ ", "").replace(".", ""));
        int newPrice = Integer.parseInt(getText(offerNewPrice).replace("$ ", "").replace(".", ""));
        return oldPrice > newPrice;
    }


}
