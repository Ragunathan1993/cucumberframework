Feature: Amazon Login Funtion And Purchase

Scenario: User Login With User Name And User Password In Amazon Login Funtion

Given User Landed on The Amazon Page
When User Enter The SignInButton And Navigate The LoginPage
When User Enter The User Name In User Name Box "jayaaadhithya@gmail.com"
And User Enter The Continue Button
And User Enter The User Password In User Name Box "jaya1395"
And User Click The SignIn Button And Move The HomePage
Then User Landed On The Amazon Homepage

Scenario Outline:User Search Product And Add To The Cart

When User Enter The Product Name In Search Box "<products>"
And User Click The Search Button
Then User Click The Product Name And Navigate The New Window
And User Click The Add to Cart Button And Navigate To The PopUp Page
And User Landed In CartPage

Examples:

|products|
|samsung|
|realme|
|oppo|

Scenario: User Will Go For PaymentProcess

Then User Go To  The Shopping Card Page
And User Click The ProceedPay Button And Navigate The Amazon CheckOut Page
And User Click The Use This Address Button
And User Moving The Select Payment Method And Click The Credit Or Debit Card Button
And User Click The End Card Details And Navigate The PopUp Page
And User Enter The Card Number And Click Enter Card Details

