Feature: Shipping

	 Scenario: create new shipping address
 	 	   Given user has less than 5 saved address
		   When user chooses "new shipping address" button
		   Then validate required fields in shipping address
		   And validate field format in shipping address

	 Scenario: validate required fileds in shipping address		   
		   When user input shipping address with following value
		   | name    	 | mobile     	      | address |
		   | shiyimin	 | 18621519910	      | 	|
		   And user clicks "Save" button
		   Then system does following required field validation
		   | address   	    	      |
		   | address is required      |

	 Scenario: validate field format in shipping address
	 	   When user input shipping address with following value
		   | mobile  	   | phone  	    |
		   | 18621519910   | abcd	    |
		   And user clicks "Save" button
		   Then system does following required field validation
		   | phone     	    	      	       |
		   | abcd is not valid phone value     |

	 Scenario: Modify a shipping address
	 	   Given user has more than 1 saved address
		   When user chooses first address
		   Then validate required fields in shipping address
		   And validate field format in shipping address

	 Scenario: Delete a shipping address
	 	   Given user has more than 1 saved address
		   When user chooses first address
		    And clicks "delete" button
		   Then a confirm dialog is popped
		   When user chooses "No" button
		   Then the dialog is disappeared
		   When user chooses first address
		    And clicks "delete" button
		   Then a confirm dialog is popped
		   When user chooses "Yes" button
		   Then the address is deleted