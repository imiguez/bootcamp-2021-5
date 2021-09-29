  Feature: Obligar loguearse para comprar
    Como usuario web,
    Quiero tener que loguearme/registrarme
    Para poder comprarun producto.

    @atc03 @atc
    Scenario: Compra de producto sin loguearse
      Given estoy en un navegador con la pagina inicial de Mercadolibre
      When busco la palabra "celular" en la barra de busqueda
      Then la barra de busqueda me muestra que se busco "celular"
      And selecciono el primer resultado
      And clickeo en el boton para comprar
      Then el navegador me muestra la seccion crea tu cuenta con el mensaje "¡Hola! Para comprar, ingresa a tu cuenta"