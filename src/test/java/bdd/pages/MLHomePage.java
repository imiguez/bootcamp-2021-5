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
    final String url = "https://www.mercadolibre.com.ar/";
    By barraBusqueda = By.xpath("//input[@class='nav-search-input']");
    By btnBuscar = By.xpath("//div[@role='img']");
    By crearCuenta = By.xpath("//a[@data-link-id='registration']");


    //funciones - keyword Driven
    public void entrarAHomePage(){
        goToUrl(url);
        assertEquals(true, isDisplayed(barraBusqueda));
    }

    public void buscar(String buscar){
        type(buscar, barraBusqueda);
        click(btnBuscar);
    }

    public void irACrearCuenta() {
        click(crearCuenta);
    }

}
