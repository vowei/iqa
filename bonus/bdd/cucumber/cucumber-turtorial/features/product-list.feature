Feature: Product List

	Scenario: Search an existing product in list
		Given sort by drop-down value is Newest
		When I type google in search text box
		Then the first product is Nexus S
