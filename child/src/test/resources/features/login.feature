Feature: to validate login functionality of the application
@reg 
Scenario Outline: to validate login functionallity with valid user nae and passworrd

Given user launches url
When user navigates to app
And user entres valid user name and passsword
And user clicks login button


Examples:
|username|balakumaran |
|password| 02071996@bk|

