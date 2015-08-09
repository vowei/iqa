Feature: Test Product List With Scenario Outlines

	Scenario Outline: Search an existing product in list
		Given sort by drop-down value is Newest
		When I type <key> in search text box
		Then the first product is <product name>

	Examples:
		| key		| product name	|
		| google	| Nexus S 	|
		| dell		| Dell Streak 7 |
