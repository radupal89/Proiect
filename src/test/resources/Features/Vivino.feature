Feature: Testare functii website Vivino.com


Background:
  Given Accesare Website Vivino.com


  Scenario: Inregistrare user nou
    When Click pictograma silueta profil
    And Click join vivino
    Then Click acceptare termeni si conditii
    Then Introducere adresa de email "palradu@yahoo.com"
    And Click buton Continue
    Then Adaugare nume "Pal"
    And Adaugare prenume "Radu"
    Then Adaugare parola "Parola12345"
    And Click buton Join Vivino

  Scenario: Logare website Vivino.com
    When Click pictograma silueta profil
    And Introducere adresa de email "radupal89@yahoo.com"
    Then Click buton Continue
    And Introducere parola "Parola115"
    Then Click buton Log in

  Scenario: Cautare produs dupa nume
    Then  Click pe chenarul search
    And   Introducere nume produs "Petrus"
    Then  Selectare produs din sugestiile aparute


  Scenario: Cautare produs dupa tip
    Then  Click pe chenarul search
    And   Selectare tip de vin "Red"
    Then  Aplicare filtru pret intre "0 - 50"
    And   Aplicare filtru tip strugure "Pinot Noir"
    Then  Aplicare filtru regiune "Bordeaux"