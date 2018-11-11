Feature: Login for Leaftaps 
@smoke	
Scenario Outline: Login Positive 1 
	And Enter the username as <username>
	And Enter the password as <password> 
	When Click on the login button 
	Then verify login is success
Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|
#@reg @smoke	
#Scenario: Login negative 
##Given Launch the browser
##And Enter the URL
#	And Enter the username as DemoCSR1 
#	And Enter the password as crmsfa 
#	When Click on the login button #	But verify login is fail