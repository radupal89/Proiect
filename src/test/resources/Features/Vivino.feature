Feature: Testare functii website Vivino


  Scenario: Verificare functie de inregistrare user nou
    Given Accesare Website Vivino
    Then Click acceptare cookies
    When Click pictograma silueta profil
    And Click join vivino
    Then Click acceptare termeni si conditii
    Then Introducere adresa de email "radude1989@gmail.com"
    And Click buton Continue
    Then Adaugare nume "Pal"
    And Adaugare prenume "Radu"
    Then Adaugare parola "Parola12345"
    And Click buton Join Vivino






