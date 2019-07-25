Feature: Test Login Functionality
 
Scenario: Login with valid data
    Given user opens login portal
    When user enters username as "mercury"
    When user enters password as "mercury"
    And clicks on signIn button
    Then validate login success