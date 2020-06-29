Feature:
Scenario Outline:
Given the url is "https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm"
When user clicks signin button
And user enters username "<username>"
And user enters password "<password>"
And user clicks login button
Then user clicks signout button

Examples:
|username||password|
|lalitha||password123|