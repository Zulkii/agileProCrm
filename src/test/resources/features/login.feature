@AGIL-1604
Feature: As a user, I should be able to login

  Background: User is on the Login page
    Given User is on the Login page

  @AGIL-1602
  Scenario Outline: User should be able to login as HR user with Valid Credentials
    When HR user enter valid username "<username>"
    And HR user enter valid password "<password>"
    And User click on the login button
    Then User should land on the homepage

    Examples:
      | username                | password |
      | hr33@cybertekschool.com | UserUser |
      | hr55@cybertekschool.com | UserUser |
      | hr77@cybertekschool.com | UserUser |


  @AGIL-1606
  Scenario Outline: User should be able to login as HMarketing user with Valid Credentials
    When Marketing user enter valid username "<username>"
    And Marketing user enter valid password "<password>"
    And User click on the login button
    Then User should land on the homepage

    Examples:
      | username                       | password |
      | marketing33@cybertekschool.com | UserUser |
      | marketing55@cybertekschool.com | UserUser |
      | marketing77@cybertekschool.com | UserUser |

  @AGIL-1618
  Scenario Outline: User should be able to login as Helpdesk user with Valid Credentials
    When Helpdesk user enter valid username "<username>"
    And Helpdesk user enter valid password "<password>"
    And User click on the login button
    Then User should land on the homepage

    Examples:
      | username                      | password |
      | helpdesk88@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com | UserUser |
      | helpdesk66@cybertekschool.com | UserUser |

  @AGIL-1620
  Scenario Outline: Users should not be able to login with invalid credentials
    When user enter invalid username "<username>"
    And  user enter invalid password "<password>"
    And User click on the login button
    Then User should see error message

    Examples:
      | username                      | password |
      | invalid                       | UserUser |
      | helpdesk99@cybertekschool.com | invalid  |
      | invalid                       | invalid  |
      | invalid@cybertekschool.com    | UserUser |
      | invalid                       | useruser |

  @AGIL-1621
  Scenario: User should be able to click "Remember me on this computer" checkbox
    When user click on the checkbox
    Then checkbox should be selected

  @AGIL-1622
  Scenario: User should be able to click "FORGOT YOUR PASSWORD?" link
    When user click on the FORGOT YOUR PASSWORD link
    Then user should be land on Get Password page



