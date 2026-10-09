@tag
Feature:As Admin user i want test with multiple data in Orannge Hrm
@login
Scenario:
As admin user i want test login using cucumber
Given user navigate Url "http://orangehrm.qedgetech.com/" in a browser
When User Enter username as "Admin"
And User Enter password as "Qedge123!@#"
And User click login button
Then User validate login success
When User close browser
@AddEmp
Scenario Outline:
As Admin user i want to add multiple employees
Given user navigate Url "http://orangehrm.qedgetech.com/" in a browser
When User Enter username as "Admin"
And User Enter password as "Qedge123!@#"
And User click login button 
Then User validate login success
When User navigates to Add Employee page
And user Enter as"<Firstname>" in firstname 
And user Enter as "<middleName>" in middlename
And user Enter as "<lastname>" in last name
And user capture eid
And user click save button
Then user validate employee id after adding
When User close browser
Examples:
|Firstname|middleName|lastname|
|john|JS|Welson|
|ramu|TS|sita|
|abdul|Basha|Ameer|
|ranga|Ps|Pappasani|
|Akhi|PRR|Ranga|
|john3|test|Welson3|
|john5|JSt|Welsond|
|john32|PlayWright|Welson1|

