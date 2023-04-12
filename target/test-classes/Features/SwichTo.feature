Feature: Testare meniu Switch To

Background: Preconditii
  Given Deschidere pagina Demo


Scenario: Alerts with ok
  Given Deschidere pagina Demo
  Then Click button
  And Accept alert

Scenario: Alerts with ok and cancel
  Then Click ok and Cancel
  And Click the confirm box
  Then Alert with ok
  And Alert with cancel

Scenario: Alerts with textbox
  Then Click Textbox
  And Click prompt box button
  And Enter name "Radu"



Scenario: Switch to frames
  Given Deschidere pagina Demo Frames
  And Click single iframe
  Then Introducere text "testare"

