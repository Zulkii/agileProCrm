@AGIL-1641
Feature: As a user, I should be able to logout

  @AGIL-1639
  Scenario Outline: Verify that user can log out and can not back to the homepage again after logout
    Given user logged in with valid credentials "<username>" and "<password>"
    When user click on the user block
    And user click on the Logout button
    Then user should navigated to the login page
    # AC-2
    And user click on the step back button
    Then user should stay on the login page

    Examples:
      | username                       | password |
      | hr33@cybertekschool.com        | UserUser |
      | marketing33@cybertekschool.com | UserUser |
      | helpdesk33@cybertekschool.com  | UserUser |

  @AGIL-1640
  Scenario Outline: Verify that users must be logged out if the user closes the browser
    Given user logged in with valid credentials "<username>" and "<password>"
    When user closes the browser
    And navigate to the login page
    Then user should not logged in

    Examples:
      | username                       | password |
      | hr33@cybertekschool.com        | UserUser |
      | marketing33@cybertekschool.com | UserUser |
      | helpdesk33@cybertekschool.com  | UserUser |










