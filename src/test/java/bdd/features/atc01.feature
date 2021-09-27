
Feature: Precios menores a precio hasta
  Como usuario web,
  Quiero filtrar mis busquedas en Mercadolibre
  Para ver productos.

  @atc01 @atc
  Scenario: Filtrado y ordenado por precio
    Given estoy en un navegador con la pagina inicial de Mercadolibre
    When busco la palabra "celular" en la barra de busqueda
    And ingreso el valor "15000" en el campo hasta
    And ordeno por mayor valor
    Then el navegador me muestra los resultados