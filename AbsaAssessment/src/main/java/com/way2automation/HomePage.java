package com.way2automation;

import org.openqa.selenium.WebDriver;
import utilities.ReadVariables;

public class HomePage
{
    private HomePage()
    {}
    public static void navigateToWay2AutomationSite(WebDriver driver)
    {
        driver.manage().window().maximize();
        driver.get(ReadVariables.getWebUrl());
    }
}
