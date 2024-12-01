package com.way2automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ReadVariables;

public class CommonMethods
{
    private CommonMethods()
    {}
    public static void selectValueByText(WebDriver driver,String text)
    {
        Select selectValue= new Select(driver.findElement(By.xpath(ReadVariables.role())));
        selectValue.selectByVisibleText(text);
    }
    public static void clickElementByLabel(WebDriver driver,String label)
    {
        if (label.equalsIgnoreCase("Company AAA"))
        {
            driver.findElement(By.xpath(ReadVariables.customerCompanyAAA())).click();
        }
        else
        {
            driver.findElement(By.xpath(ReadVariables.customerCompanyBBB())).click();
        }
    }

}
