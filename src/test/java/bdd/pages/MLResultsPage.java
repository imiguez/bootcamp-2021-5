package bdd.pages;

import bdd.bases.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MLResultsPage extends SeleniumBase {

    public MLResultsPage(WebDriver driver) {
        super(driver);
    }

    By precioMaximo = By.xpath("//input[@data-testid='Maximum-price']");
    By ordenarPorBtn = By.xpath("//button[@class='andes-dropdown__trigger']");
    By ordenarPorMayorValor = By.xpath("//li[@role='presentation'][3]");
    By primeraOpcion = By.xpath("//ol[@class='ui-search-layout ui-search-layout--stack']/li[1]//span[@class='price-tag-text-sr-only']");

    public void ingresarPrecioMaximo(String precio) {
        type(precio, precioMaximo);
        typeKey(Keys.ENTER, precioMaximo);
    }

    public void ordenoPorMayorValor() {
        click(ordenarPorBtn);
        click(ordenarPorMayorValor);
    }

    public int obtenerPrecioDelPrimerResultado() {
        return Integer.valueOf(getText(primeraOpcion).replace(" pesos", ""));
    }

}
