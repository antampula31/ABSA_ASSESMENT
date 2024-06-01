package io.healthforce.www.keywords;


import io.healthforce.www.utilities.ReadVariables;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.File;

public class KeyHealthFactorial
{
    public static WebDriver navigateToGreatestFactorialCalculator(String browser)
    {
        WebDriver driver = new ChromeDriver();
        try
        {


            if(browser.contains(ReadVariables.chrome()))
            {
                System.setProperty("WebDriver.chromedriver.exe","src/main/resources/BrowserDrivers/chromedriver.exe");
                driver.get(ReadVariables.getBaseURL());
                driver.manage().window().maximize();
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("src/main/Results/navigation/Screenshots/image.png"));
            }
            else if(browser.contains(ReadVariables.firefox()))
            {
                System.setProperty("WebDriver.geckodriver.exe","src/main/resources/WebDrivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(ReadVariables.getBaseURL());
                driver.manage().window().maximize();

            }
        }
        catch (Exception exception)
        {
            exception.getMessage();
        }
        return driver;
    }

    public  static void validateIntegerFactorialValueOfSeven(WebDriver driver)
    {
        try
        {
            WebElement enterInteger=driver.findElement(By.xpath(ReadVariables.enterIntegerLocator()));
            enterInteger.sendKeys("7");

            WebElement calculateButton= driver.findElement(By.xpath(ReadVariables.calculateButtonLocator()));
            calculateButton.click();

            WebElement factorialResults= driver.findElement(By.xpath(ReadVariables.factorialResultLocator()));

            String actualFactorial= factorialResults.getText();
            String  expectedFactorial="The factorial of 7 is: 5040";

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("src/main/Results/FactorialResults/Screenshots/image.png"));

            Assert.assertEquals(actualFactorial,expectedFactorial,"Values Are not the same");

        }
        catch (Exception exception)
        {
            exception.getMessage();
        }


    }

    public static void  validateIntegerFactorialValueOfNonInteger(WebDriver driver,String decimalValue)
    {
        try {
            WebElement enterInteger = driver.findElement(By.xpath(ReadVariables.enterIntegerLocator()));
            enterInteger.sendKeys(decimalValue);

            WebElement calculateButton = driver.findElement(By.xpath(ReadVariables.calculateButtonLocator()));
            calculateButton.click();

            WebElement validationMessage = driver.findElement(By.xpath(ReadVariables.redValidationMessageLocator()));
            validationMessage.getText();

            String actualValidationMessage = validationMessage.getText();
            String expectedValidationMessage = "Please enter an integer";

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("src/main/Results/ValidationMessage/Screenshots/image.png"));

            Assert.assertEquals(actualValidationMessage, expectedValidationMessage, " Validation Message is Not The same");


        }
        catch (Exception exception)
        {
            exception.getMessage();
        }


    }

}
