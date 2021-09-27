
Feature: Rechazar nueva cuenta sin terminos aceptados
  Como usuario web,
  Quiero no poder crearme una cuenta sin haber aceptado los terminos
  Para no tener problemas en un futuro.

  @atc02 @atc
  Scenario: Denegar creacion de cuenta
    Given estoy en un navegador con la pagina inicial de Mercadolibre
    When voy a la seccion crea tu cuenta en la barra de navegacion
    Then el navegador me muestra la seccion para crear una cuenta con el boton continuar oculto