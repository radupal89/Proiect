Feature: Testare functii website Vivino


  Scenario: Verificare functie de inregistrare user existent
    Given Accesare Website Vivino
    Then Click acceptare cookies
    When Click pictograma silueta profil
    And Click join vivino
    Then Click acceptare termeni si conditii
    Then Introducere adresa de email "radupal89@yahoo.com"
    And Click buton Continue
    Then Adaugare nume "Pal"
    And Adaugare prenume "Radu"
    Then Adaugare parola "Parola12345"
    And Click buton Join Vivino
    Then Click buton de inchidere





