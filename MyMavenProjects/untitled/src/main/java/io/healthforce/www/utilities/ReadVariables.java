package io.healthforce.www.utilities;

import io.restassured.path.json.JsonPath;
import org.yaml.snakeyaml.Yaml;
import io.healthforce.www.keywords.CommonValidations;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class ReadVariables
{
    static Map<String,Object> data;
    static String objectFilepath="./src/main/resources/variables.yml";
    static JsonPath jsonPath;
    static String json;

    private ReadVariables()
    {}

    public static void readVariablesFile()
    {
        try
        {
            Reader reader = new FileReader(objectFilepath);
            Yaml yaml= new Yaml();
            data = yaml.load(reader);
            reader.close();
            json= CommonValidations.convertMapToJson(data);
            jsonPath= CommonValidations.rawToJson(json);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String getBaseURL()
    {
        return jsonPath.getString("BASE_URL.URL");
    }

    public static String chrome()
    {
        return jsonPath.getString("BROWSERS.CHROME");
    }

    public static String firefox()
    {
        return jsonPath.getString("BROWSERS.FIREFOX");
    }

    public static String redFormValidationLocator()
    {
        return jsonPath.getString("LOCATORS.RED_FORM_VALIDATION_XPATH");
    }

    public static String redValidationMessageLocator()
    {
        return jsonPath.getString("LOCATORS.RED_VALIDATION_MESSAGE_XPATH");
    }

    public static String enterIntegerLocator()
    {
        return jsonPath.getString("LOCATORS.ENTER_INTEGER_XPATH");
    }

    public static String calculateButtonLocator()
    {
        return jsonPath.getString("LOCATORS.CALCULATE_FACTORIAL_BUTTON_XPATH");
    }

    public static String factorialResultLocator()
    {
        return jsonPath.getString("LOCATORS.CALCULATE_FACTORIAL_RESULTS_XPATH");
    }



}
