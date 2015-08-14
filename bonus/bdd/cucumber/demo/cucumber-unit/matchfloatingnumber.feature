Feature: Match a floating number

    Scenario: Match a normal number
        When I type "123.456"
        Then should match

    Scenario Outline: Match a floating number
        When I type "<value>"
        Then should match

     Examples:
        | value |
        | .456 |
        | +123.456 |
        | +.456 |
        | 123 |
        | -123.456 |
        | -.456 |
        | 0.456 |
    
    Scenario Outline: Match a non-floating number
        When I type "<value>"
        Then should match

     Examples:
        | value |
        | 123. |
        | ++123.456 |
        | 123.456.789 |
        | + |
        | - |
   
