Feature: 没有包含Tag的Feature
	 用来演示 cucumber 的 tag 测试

	 Background:
		When run features "没有包含Tag的Feature"

	 Scenario: 没有Tag的场景
	 	  When run scenario "没有Tag的场景" 

	 @登录 @e2e
	 Scenario: 包含 @登录 @e2e 的场景
	 	  When run scenario "包含 @登录 @e2e 的场景" 