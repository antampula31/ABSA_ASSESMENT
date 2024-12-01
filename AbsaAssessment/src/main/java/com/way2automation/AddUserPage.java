package com.way2automation;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ReadVariables;

import java.io.File;
import java.time.Duration;

public class AddUserPage
{
    private AddUserPage()
    {}

    public static void addUser(WebDriver driver, String firstName, String lastName, String username, String password,
                               String customer, String role, String email, String phoneNumber)
    {
        try
        {
            Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(30));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ReadVariables.addUserLink())));
            driver.findElement(By.xpath(ReadVariables.addUserLink())).click();
            driver.getWindowHandle();
            driver.switchTo().window(driver.getWindowHandle());
            driver.findElement(By.xpath(ReadVariables.firstName())).sendKeys(firstName);
            driver.findElement(By.xpath(ReadVariables.lastName())).sendKeys(lastName);
            driver.findElement(By.xpath(ReadVariables.username())).sendKeys(username);
            driver.findElement(By.xpath(ReadVariables.password())).sendKeys(password);
            CommonMethods.clickElementByLabel(driver, customer);
            CommonMethods.selectValueByText(driver,role);
            driver.findElement(By.xpath(ReadVariables.email())).sendKeys(email);
            driver.findElement(By.xpath(ReadVariables.cellphone())).sendKeys(phoneNumber);
            driver.findElement(By.xpath(ReadVariables.saveButton())).click();
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("src/main/Results/Screenshots/image.png"));
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
