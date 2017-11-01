Feature: Reset functionality on login page of Application

  Scenario Outline: Verification of Reset button with numbers of credentials
    Given I am opening Chrome and launch the application
    When I enter the Username <username> and Password <password>
    Then I reset the credential

    Examples:

      | username | password  |
      | User1    | password1 |
      | User2    | password2 |
      | User3    | password3 |
