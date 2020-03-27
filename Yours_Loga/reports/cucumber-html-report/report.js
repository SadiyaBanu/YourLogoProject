$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium_Code_Mars/Yours_Loga/src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Your Loga Website",
  "description": "",
  "id": "your-loga-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Your_Loga"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Search and select product then increase quantity as 2 then add to card and check the price",
  "description": "",
  "id": "your-loga-website;search-and-select-product-then-increase-quantity-as-2-then-add-to-card-and-check-the-price",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Loga"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user launch an chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user open an login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user Search a product",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The user increase the quantity and click add to card",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "check the price of the product",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCard_StepDefinition.the_user_launch_an_chrome_browser()"
});
formatter.result({
  "duration": 7621105065,
  "status": "passed"
});
formatter.match({
  "location": "AddToCard_StepDefinition.the_user_open_an_login_page()"
});
formatter.result({
  "duration": 21337814699,
  "status": "passed"
});
formatter.match({
  "location": "AddToCard_StepDefinition.the_user_Search_a_product()"
});
formatter.result({
  "duration": 25194520167,
  "status": "passed"
});
formatter.match({
  "location": "AddToCard_StepDefinition.the_user_increase_the_quantity_and_click_add_to_card()"
});
formatter.result({
  "duration": 9982183349,
  "status": "passed"
});
formatter.match({
  "location": "AddToCard_StepDefinition.check_the_price_of_the_product()"
});
formatter.result({
  "duration": 25582985788,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Invalid Search in Your Loga Application",
  "description": "",
  "id": "your-loga-website;invalid-search-in-your-loga-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC02_Loga"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "The user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "The user open the login page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user perform Invalid Search",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Print the error message in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "Invalid_Search_StepDefinition.the_user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 3943604506,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Search_StepDefinition.the_user_open_the_login_page()"
});
formatter.result({
  "duration": 18942741921,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Search_StepDefinition.the_user_perform_Invalid_Search()"
});
formatter.result({
  "duration": 10454406098,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Search_StepDefinition.print_the_error_message_in_the_console()"
});
formatter.result({
  "duration": 17293692795,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search and select two product and then remove one product from card",
  "description": "",
  "id": "your-loga-website;search-and-select-two-product-and-then-remove-one-product-from-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC03_Loga"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "The user launches the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "The user opens the login page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "The user Search and select two products",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "The user remove one product from card",
  "keyword": "Then "
});
formatter.match({
  "location": "Select_Two_Product.the_user_launches_the_chrome_browser()"
});
formatter.result({
  "duration": 3621252599,
  "status": "passed"
});
formatter.match({
  "location": "Select_Two_Product.the_user_opens_the_login_page()"
});
formatter.result({
  "duration": 13724422522,
  "status": "passed"
});
formatter.match({
  "location": "Select_Two_Product.the_user_Search_and_select_two_products()"
});
formatter.result({
  "duration": 42303955914,
  "status": "passed"
});
formatter.match({
  "location": "Select_Two_Product.the_user_remove_one_product_from_card()"
});
formatter.result({
  "duration": 13485083393,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Search then select and compare two product in Your Loga Application",
  "description": "",
  "id": "your-loga-website;search-then-select-and-compare-two-product-in-your-loga-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC04_Loga"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "The user launches a chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "The user opens a login page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "The user Search and Select two products",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "The user compare two product",
  "keyword": "Then "
});
formatter.match({
  "location": "Compare_Product.the_user_launches_a_chrome_browser()"
});
formatter.result({
  "duration": 4010596227,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Product.the_user_opens_a_login_page()"
});
formatter.result({
  "duration": 15692482194,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Product.the_user_Search_and_Select_two_products()"
});
formatter.result({
  "duration": 23456673084,
  "status": "passed"
});
formatter.match({
  "location": "Compare_Product.the_user_compare_two_product()"
});
formatter.result({
  "duration": 15269411894,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Invalid Login in Your Loga Application",
  "description": "",
  "id": "your-loga-website;invalid-login-in-your-loga-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@TC05_Loga"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "The user launch a chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "The user open a login page",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "The user click sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "The user enter invalid details",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "The user click sigin in button and print error message in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "Invalid_Login_StepDefinition.the_user_launch_a_chrome_browser()"
});
formatter.result({
  "duration": 3826870199,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Login_StepDefinition.the_user_open_a_login_page()"
});
formatter.result({
  "duration": 11519276827,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Login_StepDefinition.the_user_click_sign_in()"
});
formatter.result({
  "duration": 6497201224,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Login_StepDefinition.the_user_enter_invalid_details()"
});
formatter.result({
  "duration": 6802745056,
  "status": "passed"
});
formatter.match({
  "location": "Invalid_Login_StepDefinition.the_user_click_sigin_in_button_and_print_error_message_in_the_console()"
});
formatter.result({
  "duration": 16629866628,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Fill details in Contact Us in Loga application",
  "description": "",
  "id": "your-loga-website;fill-details-in-contact-us-in-loga-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@TC06_Loga"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "The user launch chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "The user open Contact Us page",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "The user fills the details",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "The user submit the details",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUs_StepDefinition.the_user_launch_chrome_application()"
});
formatter.result({
  "duration": 3656645325,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_StepDefinition.the_user_open_Contact_Us_page()"
});
formatter.result({
  "duration": 13887245511,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_StepDefinition.the_user_fills_the_details()"
});
formatter.result({
  "duration": 18215096270,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_StepDefinition.the_user_submit_the_details()"
});
formatter.result({
  "duration": 15550539116,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "To perform valid Registration",
  "description": "",
  "id": "your-loga-website;to-perform-valid-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@TC07_Loga"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "The user launches an chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "The user opens an login page",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "The user email and click register",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "The user enters all valid details",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "The user clicks Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "Valid_Registration_Step_Definition.the_user_launches_an_chrome_browser()"
});
formatter.result({
  "duration": 3900744610,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Registration_Step_Definition.the_user_opens_an_login_page()"
});
formatter.result({
  "duration": 14013941701,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Registration_Step_Definition.the_user_email_and_click_register()"
});
formatter.result({
  "duration": 1757467556,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Registration_Step_Definition.the_user_enters_all_valid_details()"
});
formatter.result({
  "duration": 34503992927,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Registration_Step_Definition.the_user_clicks_Register_button()"
});
formatter.result({
  "duration": 3405600635,
  "status": "passed"
});
});