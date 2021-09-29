Feature: Obligar loguearse para vender
  Como usuario web,
  Quiero tener que loguearme
  Para poder vender productos

  @atc04 @atc
  Scenario: Vender producto sin loguearse
    Given estoy en un navegador con la pagina inicial de Mercadolibre
    When clickeo en la opcion vender
    Then el navegador me muestra la seccion crea tu cuenta con el mensaje "¡Hola! Para vender, ingresa a tu cuenta"