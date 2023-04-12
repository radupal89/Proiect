Feature: Testare Website Vivino functia de inregistrare


Scenario: Inregistrare user nou
  Given Deschidere pagina pagina principala Vivino.com
  Then Click pictograma silueta profil
  And Click join vivino
  Then Click acceptare termeni si conditii
  Then Introducere adresa de email "palradu@yahoo.com"
  And Click buton Continue
  Then Adaugare nume "Pal"
  And Adaugare prenume "Radu"
  Then Adaugare parola "Parola12345"
  And Click buton Join Vivino
