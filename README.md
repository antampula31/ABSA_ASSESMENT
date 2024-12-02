**# HybridAutomationFramework**

A java based automation testing framework built with rest assured,TestNG, Selenium Webdriver as well as some other technologies.
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

Inside the features' folder, Clone the Framework into the features' folder and checkout e.g feature\master. Start IntelliJ, and select open. Navigate to the C:\DevWork\features folder and open your cloned project. Once the project has fully loaded, a small pop up should appear in the bottom right corner concerning maven dependencies. For this option, click the enable auto import button. If this pop up does not appear, continue to the next set of steps. At this point, you should now have the framework open in intelliJ. Time to set the IDE settings. Press and hold the following keys, in order to open up the settings window: CTRL+ALT+S In the search bar, search for Maven. In the maven panel, tick the option to "Always update snapshots" In the panel on the left, under the Maven option, select the Importing option. For this pane, tick the option to "Import Maven projects automatically" Click "Apply", followed by "OK" Once the Settings panel is closed, lets take a look at setting the project settings. Press and hold the following keys: SHIFT+CTRL+ALT+S Under the Project section make sure that the Project SDK is set to 17.0.7 and that the Language level is set to SDK default (17) Under the Modules section, on the right hand side, select the "Dependencies" tab, click on the plus icon and select the JARS or Directories option. In the file selection pop up, navigate to the resource dependencies folder, and add all jars you can find. (Best make double sure and check every folder/ directory in the repo folder). Once all required jar files have been added, and you have applied the change in the project settings, click the OK button. The final step for the installation, is to build the project. Under the "Build" option on the context ribbon at the top of the IDE, select the option to "Build project" or "Rebuild project". Once the build process is complete, there should be no errors. If any errors are given, for the time being, recite this mantra: "Google, is my friend...."



**#Test Execution**
-You can run your tests by simple clicking play button next to each test case in this path AbsaAssessment/src/test/java

Running tests can also be kicked off in maven commandline, this is an easiest way to switch between environments by passing environment name you want.

- If we want to execute a single test class.
    mvn clean test -Dtest=”TestClassName” 
    
-If we want to execute a single test method or test case.
    mvn clean test Dtest=”TestClassName#TestMethodName” 
    
--If we want to execute a test Suite.
    mvn clean test -DxmlFile="TestSuiteName"

**#Test Report**
-  can view reports by simple running the following command to view Allure report allure serve C:\Development\AbsaAssessment\allure-results. NB This path will be based on your project you created on you machine.
- Also you can view Extent Report by opening index.html file on the pathsrc/main/Results/index.html and choose to open with Chrome browser, preferrable.


**# Jenkins Integration**

Assumption is you already have jenkins server. Start the Jenkins server by Opening the browser and navigate to your Automation jenkins server. Click New Item in the dashboard. Enter the project name and select the project type as Maven project. Click Ok. Now you could see a job being created successfully in the dashboard. Click the project and click Configure. Under the Build section, enter the complete path of your pom.xml . In the Goals and options, enter the command "clean test -DsuiteFile="AbsaAssessmentSuite.xml" ". In Post-build Actions,under publish HTML reports, go to index pages then paste src/Results/java/index.html. You can setup Auto Email, under Editable Email Notification.This will be your report that will be sent Recipients incase you choose AUTO email it. Under Advanced Settings make sure you add Trigger of an email, like SUCCESS as an example depending on your requirements.

Click Apply and then Save Click Apply and then Save.
****
**#Author**

Abongile Ntampula
