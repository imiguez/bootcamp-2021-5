package bdd.pages;

import bdd.bases.SeleniumBase;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLHomePage extends SeleniumBase {

    public MLHomePage(WebDriver driver) {
        super(driver);
    }

    //atributos - localizadores
    final String url = "https://www.mercadolibre.cl";
    By searchBar = By.xpath("//input[@class='nav-search-input']");
    By searchBtn = By.xpath("//div[@role='img']");
    By createAccount = By.xpath("//a[@data-link-id='registration']");
    By sellBtn = By.xpath("//ul[@class='nav-menu-list']//a[contains(text(), 'Vender')]");
    By offerBtn = By.xpath("//a[contains(text(), 'Ofertas')]");
    By offerSectionTittle = By.xpath("//h1[@class='header_title']");


    //funciones - keyword Driven
    public void goToHome(){
        goToUrl(url);
        assertEquals(true, isDisplayed(searchBar));
    }

    public void search(String buscar){
        type(buscar, searchBar);
        click(searchBtn);
    }

    public void goToCreateAccount() {
        click(createAccount);
    }

    public String getSearchBarText() {
        return getValue(searchBar);
    }

    public void goToSellSection() {
        click(sellBtn);
    }

    public void goToOffersSection() {
        click(offerBtn);
        waitElementToBeClickable(offerSectionTittle, 5);
        assertEquals(getText(offerSectionTittle), "Ofertas");
    }

}
