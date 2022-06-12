@loginTest 
Feature: DigiBoxx login test 

Scenario: the login test 
	Given Verify the url 
	When enter space name 
	When enter email 
	When enter password 
	And click on sighnin button 
	Then display homepage