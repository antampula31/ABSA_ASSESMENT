package ui;

import com.way2automation.AddUserPage;
import com.way2automation.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExtentReports;
import utilities.ReadVariables;

public class AddUsersTests extends ExtentReports
{
    @Test(dataProvider = "Users")
    public static void addUserDetails(String firstName, String lastName, String username, String password,
                                      String customer,String role,String email,String phone)
    {
        test=extent.createTest("addUserDetails");
        WebDriver driver = new ChromeDriver();
        ReadVariables.readVariablesFile();
        HomePage.navigateToWay2AutomationSite(driver);
        AddUserPage.addUser(driver,firstName,lastName,username,password,customer,role,email,phone);
        endReport();
    }

    @DataProvider(name ="Users")
    public static Object[][] userDetails()
    {
        Object[][] usersData = new Object[2][8];
        usersData[0][0]="FName1";
        usersData[0][1]="LName1";
        usersData[0][2]="User1";
        usersData[0][3]="Pass1";
        usersData[0][4]="Company AAA";
        usersData[0][5]="Admin";
        usersData[0][6]="admin@mail.com";
        usersData[0][7]="082555";

        usersData[1][0]="FName2";
        usersData[1][1]="LName2";
        usersData[1][2]="User2";
        usersData[1][3]="Pass2";
        usersData[1][4]="Company BBB";
        usersData[1][5]="Customer";
        usersData[1][6]="customer@mail.com";
        usersData[1][7]="083444";

        return usersData;
    }
}
