Feature: Background example
	 使用编辑博客的例子来说明 Background 的用法

	 Background: 
	 	  Given there is a user "editor" with password "123456"
		  Given there is a user "admin" with password "123456"

	 Scenario: Log on the system as editor
	 	  When user log on
		  When user create a new blog
		  Then he should view the create blog page

	 Scenario: Log on the system as admin
	 	  When user log on
		  When user create new user
		  Then he should view the create user page