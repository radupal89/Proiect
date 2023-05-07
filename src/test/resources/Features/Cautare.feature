Feature: Testare Website Vivino.com functia de cautare produs


Scenario: Cautare produs dupa nume
  Given Deschidere pagina principala Vivino
  And   Accept cookies
  Then  Click pe chenarul search
  And   Introducere nume produs "7Arts Cabernet Sauvignon"
  Then  Selectare produs


Scenario: Cautare produs dupa tip
  Given Deschidere site Vivino
  And   Accept cookie
  Then  Click pe search any wine
  And   Selectare tip de vin "Red"
  Then  Scroll in jos
  Then  Selectare rating vin
  And   Aplicare filtru tip strugure "Granache"
  Then  Selectare regiune "Rhone Valey"
  Then  Scroll in sus
  And   Selectare produs aparut


