## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

1. Verify that when user fill out all the required information user can place an order.

   **Steps:**
   
      1. Go to the "Pizza Order Form" page.
      2. Fill out all the required fields.
      3. Click on the "Place Order" button.

   **Expected result:**
      One popup should show up with a success message.  


2.When user click on the Reset button all the fields should show the default values.

   **Steps:**

   1. Go to the "Pizza Order Form" page.
   2. Select first option from Pizza1.
   3. Type 2 in Quantity. 
   4. Click on the "Reset" button.

   **Expected result:**
   All fields should show the default values.

3. When user select "No Topping" pizza, Toppings1 and Toppings2 fields should be disabled.

   **Steps:**

   1. Go to the "Pizza Order Form" page.
   2. Select "Small 6 Slices - no toppings $6.75" option from Pizza1.
   3. Check Toppings1 and Toppings2 fields.

   **Expected result:**
   Toppings1 and Toppings2 fields should be disabled.


4. When user place an order without a required field then error message should show up.

   **Steps:**

   1. Go to the "Pizza Order Form" page.
   2. Select "Medium 8 Slices - 2 toppings $9.75" option from Pizza1.
   3. Select 2 toppings for Toppings1 and Toppings2 fields.
   4. Add Quantity.
   5. Type Name and Email.
   6. Select Payment Info 
   7. Click on Place Order button.

   **Expected result:**
   Error message should show, missing phone number.



