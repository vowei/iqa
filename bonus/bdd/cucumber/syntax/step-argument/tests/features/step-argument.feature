Feature: Step argument example

	Scenario: DocString example
		  Given a blog post named "Random" with Markdown body
		    """
		    Some Title, Eh?
		    ===============
		    Here is the first paragraph of my blog post. Lorem ipsum dolor sit amet,
		    consectetur adipiscing elit.
		    """
	
	Scenario: Character escape in DocString
		  Given a scenario with:
		    """
		    Given a calculator
		    When the calculator adds up the following numbers:
		      \"\"\"
		      3
		      6
		      1
		      12
		      \"\"\"
		    Then the calculator returns "22"
		    """

	Scenario: Data table example
		  Given the following users exist:
		  | name    | email      	    | twitter         |
		  | Aslak   | aslak@cucumber.io	    | @aslak_hellesoy |
		  | Julien  | julien@cucumber.io    | @jbpros         |
		  | Matt    | matt@cucumber.io	    | @mattwynne      |