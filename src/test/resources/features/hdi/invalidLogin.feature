@login @hdi @checkout

Feature: Login HDI

  Scenario: Negative case login hdi
    Given user access page "https://www.hdistore.com"
    When user click on hdi login button on header menu
    And user input hdi email "ID55666777"
    And user input  hdi password "XXyyZZZ"
    And user click on hdi login button
    Then system display hdi login alert box is "ID Enterpriser atau Password Anda salah (2)."