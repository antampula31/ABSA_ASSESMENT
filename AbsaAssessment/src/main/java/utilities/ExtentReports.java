package utilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeTest;

public class ExtentReports
{
    public static com.aventstack.extentreports.ExtentReports extent;
    public static ExtentTest test = null;


    @BeforeTest(alwaysRun = true)
    public static void setExtentReport()
    {
        ExtentSparkReporter htmlSparkReporter = new ExtentSparkReporter("src/main/Results/index.html");

        htmlSparkReporter.config().setDocumentTitle("OLD MUTUAL FINANCE TESTING");
        htmlSparkReporter.config().setReportName("OLD MUTUAL FINANCE");
        htmlSparkReporter.config().setTheme(Theme.STANDARD);

        extent = new com.aventstack.extentreports.ExtentReports();
        extent.attachReporter(htmlSparkReporter);
        extent.setSystemInfo("Tester", "Abongile Ntampula");
    }

    public static void endReport()
    {
        extent.flush();
    }
}