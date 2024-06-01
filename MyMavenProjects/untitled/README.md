# QA Requirements ANSWERS:


**1. Write a locator (CSS selector/XPath) for the red form validation styling**

* ANSWER: RED_FORM_VALIDATION_XPATH: //*[@style='color:rgb(255, 0, 0);']

**2. Find the console message printed**

* ANSWER: Please enter an integer

**3 .Write a Selenium script to test that the factorial of 7 is 5040**

* ANSWER: Please Navigate To ./src/test/java/HealthForceFactorialCalculationTests.java

**4. API Being Called:**

Request URL:
http://localhost:6464/factorial
Request Method:
POST

PAYLOAD:
{
    "number":7;
}

**REQUEST HEADERS:**

Accept:
*/*
Accept-Encoding:
gzip, deflate, br, zstd
Accept-Language:
en-US,en;q=0.9
Connection:
keep-alive
Content-Length:
8
Content-Type:
application/x-www-form-urlencoded; charset=UTF-8
Cookie:
_ga_F2PLZ6GCDD=GS1.1.1717147787.1.0.1717147787.0.0.0; _ga=GA1.1.1568686164.1717147788; _gid=GA1.1.1507343630.1717147789
Host:
localhost:6464
Origin:
http://localhost:6464
Referer:
http://localhost:6464/
Sec-Ch-Ua:
"Google Chrome";v="125", "Chromium";v="125", "Not.A/Brand";v="24"
Sec-Ch-Ua-Mobile:
?0
Sec-Ch-Ua-Platform:
"Windows"
Sec-Fetch-Dest:
empty
Sec-Fetch-Mode:
cors
Sec-Fetch-Site:
same-origin
User-Agent:
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36
X-Requested-With:
XMLHttpRequest

**RESPONSE:**
{
    "answer": 5040
}


**RESPONSE HEADERS:**

Connection:
close
Content-Length:
21
Content-Type:
application/json

Date:
Fri, 31 May 2024 22:29:21 GMT
Server:
Werkzeug/3.0.3 Python/3.12.3

**5.Write a bug report**

ANSWER: 

* DESCRIPTION: System is Unable to calculate Factorial of Integers with more than 3 digits.
  * STEPS TO RECREATE: 
      Navigate to localhost:6464,
      On Landing Page, Enter an Integer with More than 3 digits on a Text Box.
      Then Click Calculate Button.
      Data used 3333,4566.
      ExpectedResults: "The factorial of {$VALUE_WITH_MORE_THAN_3_DIGITS} is: {$FACTORIAL_VALUE}"
      ActualResults: No Factorial or validation message.
* SEVERITY: HIGH
* PRIORITY: HIGH
* REPORTER: Abongile Ntampula
* ASSIGNED TO: DEVELOPER

**6.Document a test case**

ANSWER:

TEST_CASE_DESCRIPTION:checkIntegerFactorialValueOfSeven

    TEST_STEPS                                  EXPECTED_RESULTS

    STEP#1:Navigate to localhost:6464           User Must be in the landing Page with Header 
                                                "The greatest factorial calculator!". 
                                                Text Boxt must be visible to enter an integer.
                                                And Calculate Button must be Active.

    STEP#2: User enter an Integer 7             The following message must be displayed:"The factorial of 7 is: 5040"
    then click Calculate Button

**7.Include test coverage**

**TESTS COVERED:**
* checkIntegerFactorialValueOfSeven
* checkIntegerFactorialValueOfDecimalValue
* checkIntegerFactorialValueOfString
* checkIntegerFactorialValueOfSpecialCharacters
* checkIntegerFactorialValueOfMoreThanThreeDigits


**8.Add any documentation that might be necessary to explain your process, include this in a file in the repo.**

 

This is a Hybrid java based automation testing framework built with rest assured,TestNG, Selenium WebDriver as well as some other technologies.
It is combination of Data Driven and Keyword Driven test Automation Approaches

**#Getting Started**

The following instructions will take you step by step through the process of setting up and getting to run the framework for the first time on your local machine or deployed to a testing machine/ VM.

**#Pre-requisites**

Before we can go through the step by step, you will need to having the following either downloaded and installed:
Java 17.0.7 sdk. Apache Maven 3.9.2. JetBrains IntelliJ installed (Community edition will also work).

**#Dependencies**

Check POM.xml,  Latests versions will work.

**#@icon-info-circle Interesting**

To make things simpler for yourself, a good idea is to store your resources in a single location.

**#Installation**

The following is a step-by-step tutorial for installing the framework. Or atleast as step-by-step as possible. This process assumes the following:

Java 17.0.7 has been installed, as well as added to your environment path. Maven has been extracted and added to your environment path. Your JDBC drivers have been downloaded and added under ./src/resources/drivers path as well. Git Bash or your chosen git management tool has been installed and set up. IntelliJ is installed and that you are Atleast familiar with some features of the IDE. That you have downloaded and stored your Selenium webdriver to a working directory.

**#Step By Step**

The first step is to create folders on your machine give it a name like C:\DevWork. Then create features folder.
Then Checkout the project.


**#Test Execution**

Navigate To ./src/test/java/HealthForceFactorialCalculationTests.java, 
and right-click play button next to each test case then select run. 
Or you can just run all of them at same time but running at a class level


