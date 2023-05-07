Feature: Testare Website Vivino.com functia de logare


Scenario: Logare website Vivino.com
  Given Accesare site Vivino
  Then Acceptare cookies
  And Click pictograma selectare profil
  Then Adaugare adresa de email "radupal89@yahoo.com"
  Then Click Continue
  And Introducere parola "Parola115"
  Then Click buton log in
