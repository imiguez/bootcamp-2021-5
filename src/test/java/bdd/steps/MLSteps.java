package bdd.steps;

import bdd.bases.AppHook;
import bdd.pages.MLHomePage;
import bdd.pages.MLRegistrationPage;
import bdd.pages.MLResultsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class MLSteps {

    //atributos
    MLHomePage home;
    MLResultsPage results;
    MLRegistrationPage registration;
    private int price;

    @Given("estoy en un navegador con la pagina inicial de Mercadolibre")
    public void estoy_en_un_navegador_con_la_pagina_inicial_de_mercadolibre() {
        home = new MLHomePage(AppHook.getDriver());
        home.entrarAHomePage();
    }

    @When("busco la palabra {string} en la barra de busqueda")
    public void busco_la_palabra_en_la_barra_de_busqueda(String string) {
        home.buscar(string);
    }

    @When("ingreso el valor {string} en el campo hasta")
    public void ingreso_el_valor_en_el_campo_hasta(String precio) {
        results = new MLResultsPage(AppHook.getDriver());
        results.ingresarPrecioMaximo(precio);
        this.price = Integer.valueOf(precio);
    }

    @When("ordeno por mayor valor")
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
        home.irACrearCuenta();
    }

    @Then("el navegador me muestra la seccion para crear una cuenta con el boton continuar oculto")
    public void el_navegador_me_muestra_la_seccion_para_crear_una_cuenta_con_el_boton_continuar_oculto() {
        this.registration = new MLRegistrationPage(AppHook.getDriver());
        registration.esClickeableElBotonContinuar();
    }

}
