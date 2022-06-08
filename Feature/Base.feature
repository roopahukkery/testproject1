@loginTest 
Feature: DigiBoxx login test 

Scenario: the login test 
	Given go to url 
	Then Verify the url 
	When enter space name 
	When enter email 
	When enter password 
	And click on sighnin button 
	Then display homepage
	

Scenario: upload file test
	Given go to add button 
	Then click on upload file 
	When click on desktop 
	When click on folder
	And click on image 
	Then click on open 
	