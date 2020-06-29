Feature: Shout Feature file
Business Need: Distance between Sean and Lucia cannot be more than 100 meters
Scenario: Saun and Lucia are Within range
Given Saun is 20 meters away from Lucia
When Saun shouts "free coffee" to Lucia
Then Lucia listens to message
Scenario: Saun and Lucia are not in the range
Given Saun is 300 meters away from Lucia
When Saun shouts "free coffee" to Lucia
Then Lucia cannot listens to message
