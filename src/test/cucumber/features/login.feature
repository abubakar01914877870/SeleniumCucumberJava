Feature: test feature file

  Scenario: Test scenario
    Given I open this url "https://ui-int2.fndev.net/login"
    When I login with username and password "buyer.admin" "buyer.admin"
    Then I check flightboard page
