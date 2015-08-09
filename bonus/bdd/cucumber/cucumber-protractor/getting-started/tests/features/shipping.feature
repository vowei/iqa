Feature: Managing deliver address

	 Scenario: Create a new address
	 	   Given user has less than 5 saved addresses
		   When user chooses "use new address" radio box
		    And user inputs following values on new address form
		   When user clicks "Save address" button
		   Then new address is created

	 Scenario: Delete an existing address and confirm it
	 	   Given user has more than 1 saved addresses
		   When user chooses the first saved address
		    And user clicks "Delete" buutton
		   Then a confirm dialog is poped
		   When user clicks "Yes" on confirm dialog
		   Then the picked address is deleted

	 Scenario: Delete an existing address with confirm it
	 	   Given user has more than 1 saved addresses
		   When user chooses the first saved address
		    And user clicks "Delete" buutton
		   Then a confirm dialog is poped
		   When user clicks "No" on confirm dialog
		   Then the picked address should not deleted

	 Scenario: Pick an address
	 	   Given user has more than 1 saved addresses
		   When user chooses the first saved address
		    And user clicks "Continue" button
		   Then browser goes to "Home" page