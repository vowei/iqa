Feature: Scenario outline demo

	Scenario Outline: Logon website
		Given browse <url>
		When type <username> and <password>

	Examples:
		| url | username | password | 
		| www.google.com | google | pwd |
		| www.baidu.com | baidu | test |
	
