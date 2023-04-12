Feature: Testare Website Vivino.com functia de logare


Scenario: Logare website Vivino.com
  Given Deschidere pagina principala Vivino.com
  Then Click pictograma silueta profil
  And Introducere adresa de email "radupal89@yahoo.com"
  Then Click buton Continue
  And Introducere parola "Parola115"
  Then Click buton Log in
