Feature:
TestMeApp Registration Feature file
Business Need:
Create valid username and password by using registration form
Scenario: valid user registration
Given the url of the testmeapp reg is "https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm"
When the user clicks on signup button
And user enters username for registration "ananth191"
And user enters firstname for registration "ananth"
And user enters lastname for registration "ajay"
And user enters password for registration "ajay1710"
And user enters confirmpassword for registration "ajay1710"
And user enters choose gender for registration
And user enters email for registration "ask@gmail.com"
And user enters mobilenumber for registration "7032561976"
And user enters dob for registration "05/04/1998"
And user enters addresss for registration "Visakhapatnam"
And user selects securityquestion for registration 
And user enters answer for registartion "blue"
And user submits register button
Then user registered successfully