@demoqa @elements @textbox @smoke

Feature: DemoQA - Elements - Text Box
  Scenario: Completar Text Box y validar el output
    Given Estoy en la pagina principal de DemoQA
    And Hago click en la card "Elements"
    And Selecciono la opcion "Text Box" del menu lateral
    And Ingreso "Christian" en el campo "Full Name"
    And Ingreso "christianqa@test.com" en el campo "Email"
    And Ingreso "Santiago, Chile" en el campo "Current Address"
    And Ingreso "San Miguel, Chile" en el campo "Permanent Address"
    When Presiono el boton "Submit"
    Then Valido el contenido de output
      """
      Name:Christian
      Email:christianqa@test.com
      Current Address :Santiago, Chile
      Permananet Address :San Miguel, Chile
      """