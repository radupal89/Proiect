Feature: Testare functie customer support


Scenario: Accesare functie support
  Given Deschidere website
  And Accept cokies
  Then Click buton support
  And Introducere text "hello"
  Then Inchidere functie