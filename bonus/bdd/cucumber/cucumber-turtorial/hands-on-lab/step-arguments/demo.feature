Feature: Step Definition Demo

	Scenario: Just a website login
		When current page is
		"""
		http://www.google.com
		"""
		Then type access credentials
		| username | password |
		| demo	   | pwd      |
