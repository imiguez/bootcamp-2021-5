Feature: Ofertas deben tener un precio mas bajo
  Como usuario web,
  Quiero poder ver productos con oferta
  Para que tengan un precio menor
  
  @atc05 @atc
    Scenario: Ofertas con un precio menor al original
    Given estoy en un navegador con la pagina inicial de Mercadolibre
    When me dirigo a la seccion de ofertas
    Then el navegador me muestra las ofertas con un menor precio que el original