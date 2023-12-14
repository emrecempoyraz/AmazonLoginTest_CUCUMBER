@SmokeTest

  Feature: Check Amazon Register Page

    Scenario Outline: Try to failed Login

      Given Navigate to website
      And click login button
      And type eMail "<Email>"
      And type password "<password>"
      When submit login form
      Then verify message
      Examples:
        | Email | password |
        |tester12@gmail.com |12345|
        |tester45@gmail.com|252525|
        |tester3@gmail.com|353535|
        |tester4@gmail.com|787878|



