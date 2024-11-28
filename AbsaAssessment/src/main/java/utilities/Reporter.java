package utilities;


import com.aventstack.extentreports.ExtentTest;

import static java.lang.System.out;

public class Reporter
{
    public static final ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private Reporter()
    {

    }

    public static synchronized void pass(String message)
    {
        out.println(ConsoleColors.GREEN +message + ConsoleColors.RESET);
        extentTest.get().pass(message);
    }
    public static synchronized ExtentTest fail(String message)
    {
        out.println(ConsoleColors.RED +message + ConsoleColors.RESET);
        return extentTest.get().fail(message);
    }

}
