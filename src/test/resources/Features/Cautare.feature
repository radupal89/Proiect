Feature: Testare Website Vivino.com functia de cautare produs


Scenario: Cautare produs dupa nume
  Given Deschidere pagina principala Vivino.com
  Then  Click pe chenarul search
  And   Introducere nume produs "Petrus"
  Then  Selectare produs din sugestiile aparute


Scenario: Cautare produs dupa tip
  Given Deschidere pagina principala Vivino.com
  Then  Click pe chenarul search
  And   Selectare tip de vin "Red"
  Then  Aplicare filtru pret intre "0 - 50"
  And   Aplicare filtru tip strugure "Pinot Noir"
  Then  Aplicare filtru regiune "Bordeaux"
