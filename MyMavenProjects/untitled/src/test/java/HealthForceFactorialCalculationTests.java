import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import io.healthforce.www.keywords.KeyHealthFactorial;
import io.healthforce.www.utilities.ReadVariables;

import static io.healthforce.www.keywords.KeyHealthFactorial.validateIntegerFactorialValueOfNonInteger;
import static io.healthforce.www.keywords.KeyHealthFactorial.validateIntegerFactorialValueOfSeven;

public class HealthForceFactorialCalculationTests
{

    @Test
    public static void checkIntegerFactorialValueOfSeven()
    {
        ReadVariables.readVariablesFile();

        WebDriver driver= KeyHealthFactorial.navigateToGreatestFactorialCalculator(ReadVariables.chrome());

        validateIntegerFactorialValueOfSeven(driver);

        driver.close();

    }

    @Test
    public static  void checkIntegerFactorialValueOfDecimalValue()
    {
        String decimalValue="0.5";

        ReadVariables.readVariablesFile();

        WebDriver driver= KeyHealthFactorial.navigateToGreatestFactorialCalculator(ReadVariables.chrome());

        validateIntegerFactorialValueOfNonInteger(driver,decimalValue);

        driver.close();

    }

    @Test
    public static  void checkIntegerFactorialValueOfString()
    {
        String stringValue="String";

        ReadVariables.readVariablesFile();

        WebDriver driver= KeyHealthFactorial.navigateToGreatestFactorialCalculator(ReadVariables.chrome());

        validateIntegerFactorialValueOfNonInteger(driver,stringValue);

        driver.close();
    }

    @Test
    public static  void checkIntegerFactorialValueOfSpecialCharacters()
    {
        String stringValue="@@@###";

        ReadVariables.readVariablesFile();

        WebDriver driver= KeyHealthFactorial.navigateToGreatestFactorialCalculator(ReadVariables.chrome());

        validateIntegerFactorialValueOfNonInteger(driver,stringValue);

        driver.close();
    }

}
