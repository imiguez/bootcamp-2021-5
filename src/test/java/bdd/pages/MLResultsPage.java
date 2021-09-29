package bdd.pages;

import bdd.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MLResultsPage extends SeleniumBase {

    public MLResultsPage(WebDriver driver) {
        super(driver);
    }

    By maxPrice = By.xpath("//input[@data-testid='Maximum-price']");
    By orderBtn = By.xpath("//button[@class='andes-dropdown__trigger']");
    By orderByHigherPrice = By.xpath("//li[@role='presentation'][3]");
    By firstResultPrice = By.xpath("//ol[@class='ui-search-layout ui-search-layout--stack']/li[1]//span[@class='price-tag ui-search-price__part']/span[1]");
    By firstResultLink = By.xpath("//ol[@class='ui-search-layout ui-search-layout--stack']/li[1]//a[@class='ui-search-item__group__element ui-search-link']");

    public void ingresarPrecioMaximo(String precio) {
        type(precio, maxPrice);
        typeKey(Keys.ENTER, maxPrice);
    }

    public void ordenoPorMayorValor() {
        click(orderBtn);
        click(orderByHigherPrice);
    }

    public int obtenerPrecioDelPrimerResultado() {
        return Integer.valueOf(getText(firstResultPrice).replace(" pesos", ""));
    }

    public void selectFirstResult() {
        click(firstResultLink);
    }

}
