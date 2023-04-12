Feature: Test Demo Page
  Testare pagina de login


  Scenario: Logare cu succes
    Given Deschidere pagina Test Demo Login
    Then Introducere email "adresa"
    And Click buton de login

  Scenario:  Adaugare date de intregistrare
    Given Deschidere pagina register
    Then Adaugare nume "radu"
    Then Adaugare prenume "pal"
    And Adaugare adresa "adresa"
    Then Adaugare adresa de email "email"
    And Adaugare telefon "telefon"
    Then Selectare gender "male"
    And Selectare hobby "cricket"
    And Selectare skill "oracle"
    Then Selectare tara "australia"
    And Selectare data "data"
    Then Adaugare parola "pass"
    And Confirmare parola "cpass"
    Then Finalizare inregistrare "submit"











