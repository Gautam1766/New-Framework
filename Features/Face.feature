Feature: Login 
Scenario Outline:

 Successful login with valid input
Given user launch edge browser
When user open url "https://practicetestautomation.com/practice-test-login/"
And user enter the username "<Username>" and password "<Password>"
And user click on submit button
Then Page title should be "Logged In Successfully | Practice Test Automation"
When  Click on logout button
And close browser

Examples:
|Username|Password|
|student|Password123|
|Stu12|Pass@3211|