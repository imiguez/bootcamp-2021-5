package bdd.steps;

import bdd.bases.AppHook;
import bdd.pages.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class MLSteps {

    //atributos
    MLHomePage home;
    MLResultsPage results;
    MLRegistrationPage registration;
    MLProductPage product;
    MLRegisterLoginPage registerOrLogin;
    MLOffersPage offers;
    private int price;

    @Given("estoy en un navegador con la pagina inicial de Mercadolibre")
    public void estoy_en_un_navegador_con_la_pagina_inicial_de_mercadolibre() {
        home = new MLHomePage(AppHook.getDriver());
        home.goToHome();
    }

    @When("busco la palabra {string} en la barra de busqueda")
    public void busco_la_palabra_en_la_barra_de_busqueda(String string) {
        home.search(string);
    }

    @And("ingreso el valor {string} en el campo hasta")
    public void ingreso_el_valor_en_el_campo_hasta(String precio) {
        results = new MLResultsPage(AppHook.getDriver());
        results.ingresarPrecioMaximo(precio);
        this.price = Integer.valueOf(precio);
    }

    @And("ordeno por mayor valor")
    public void ordeno_por_mayor_valor() {
        results.ordenoPorMayorValor();
    }

    @Then("el navegador me muestra los resultados")
    public void el_navegador_me_muestra_los_resultados() {
        Assert.assertTrue(this.price >= results.obtenerPrecioDelPrimerResultado());
    }

    // ATC02 Steps

    @When("voy a la seccion crea tu cuenta en la barra de navegacion")
    public void voy_a_la_seccioncrea_tu_cuenta_en_la_barra_de_navegacion() {
        home.goToCreateAccount();
    }

    @Then("el navegador me muestra la seccion para crear una cuenta con el boton continuar oculto")
    public void el_navegador_me_muestra_la_seccion_para_crear_una_cuenta_con_el_boton_continuar_oculto() {
        this.registration = new MLRegistrationPage(AppHook.getDriver());
        registration.esClickeableElBotonContinuar();
    }

    // ATC03 Steps


    @Then("la barra de busqueda me muestra que se busco {string}")
    public void la_barra_de_busqueda_me_muestra_que_se_busco(String string) {
        Assert.assertEquals(string, home.getSearchBarText());
    }

    @Then("selecciono el primer resultado")
    public void selecciono_el_primer_resultado() {
        this.results = new MLResultsPage(AppHook.getDriver());
        results.selectFirstResult();
    }

    @Then("clickeo en el boton para comprar")
    public void clickeo_en_el_boton_para_comprar() {
        this.product = new MLProductPage(AppHook.getDriver());
        product.buyProduct();
    }

    @Then("el navegador me muestra la seccion crea tu cuenta con el mensaje {string}")
    public void el_navegador_me_muestra_la_seccion_crea_tu_cuenta_con_el_mensaje(String msg) {
        this.registerOrLogin = new MLRegisterLoginPage(AppHook.getDriver());
        Assert.assertEquals(msg, registerOrLogin.getLoginMessage());
    }

    // ATC04 Steps

    @When("clickeo en la opcion vender")
    public void clickeo_en_la_opcion_vender() {
        home.goToSellSection();
    }

    // ATC04 Steps


    @When("me dirigo a la seccion de ofertas")
    public void me_dirigo_a_la_seccion_de_ofertas() {
        home.goToOffersSection();
    }

    @Then("el navegador me muestra las ofertas con un menor precio que el original")
    public void el_navegador_me_muestra_las_ofertas_con_un_menor_precio_que_el_original() {
        this.offers = new MLOffersPage(AppHook.getDriver());
        Assert.assertTrue(offers.isOldPriceLowwerThanOfferPrice());
    }

}
