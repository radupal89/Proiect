Feature: Testare meniu Windows

Scenario: Windows page Separate section
  Given Open azimut "Windows" page
  Then Select section "Separate"
  And Click on the section "Separate" button
  And Close other window tabs

Scenario: Windows page Multiple section
  Given Open azimut "Windows" page
  Then Select section "Multiple"
  And Cick on the section "Multiple" button
  And Close other window tabs

Scenario: Windows page Multiple closing specific tabs
  Given Open azimut "Windows" page
  Then Select section "Multiple"
  And Cick on the section "Multiple" button
  And Close window tab with url : "https://demo.automationtesting.in/Index.html"