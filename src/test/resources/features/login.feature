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
  Scenario Outline: User should be able to login as HR user with Valid Credentials
    When Marketing user enter valid username "<username>"
    And Marketing user enter valid password "<password>"
    And User click on the login button
    Then User should land on the homepage

    Examples:
      | username                | password |
      | marketing33@cybertekschool.com | UserUser |
      | marketing55@cybertekschool.com | UserUser |
      | marketing77@cybertekschool.com | UserUser |

