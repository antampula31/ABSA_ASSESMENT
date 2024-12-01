package utilities;

import io.restassured.path.json.JsonPath;
import dog.ceo.CommonApiValidations;
import org.testng.Assert;
import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class ReadVariables {
    static Map<String, Object> data;
    static String objectFilepath = "./src/main/resources/variables.yml";
    static JsonPath jsonPath;
    static String json;

    private ReadVariables()
    {}

    public static void readVariablesFile()
    {
        try
        {
            Reader reader = new FileReader(ReadVariables.objectFilepath);
            Yaml yaml = new Yaml();
            data = yaml.load(reader);
            reader.close();
            json = CommonApiValidations.convertMapToJson(data);
            jsonPath = CommonApiValidations.rawToJson(json);
        }
        catch (IOException e)
        {
            Assert.fail(e.getMessage());
        }
    }

    public static String getApiBaseURL()
    {
        return jsonPath.getString("URL.API_BASE_URL");
    }

    public static String getApiBreedsUri()
    {
        return jsonPath.getString("URI.LIST_OF_BREEDS");
    }

    public static String getSubBreedsUri()
    {
        return jsonPath.getString("URI.SUB_BREEDS_LIST");
    }

    public static String getSubBreedsRandomImageUri()
    {
        return jsonPath.getString("URI.RANDOM_BREED_IMAGE");
    }

    public static String getWebUrl()
    {
        return jsonPath.getString("URL.WEB_BASE_URL");
    }
    public static String addUserLink()
    {
        return jsonPath.getString("LOCATORS.ADD_USER_LINK");
    }
    public static String firstName()
    {
        return jsonPath.getString("LOCATORS.FIRST_NAME");
    }
    public static String lastName()
    {
        return jsonPath.getString("LOCATORS.LAST_NAME");
    }
    public static String username()
    {
        return jsonPath.getString("LOCATORS.USERNAME");
    }
    public static String password()
    {
        return jsonPath.getString("LOCATORS.PASSWORD");
    }
    public static String customerCompanyAAA()
    {
        return jsonPath.getString("LOCATORS.CUSTOMER_COMPANY_AAA");
    }
    public static String customerCompanyBBB()
    {
        return jsonPath.getString("LOCATORS.CUSTOMER_COMPANY_BBB");
    }
    public static String role()
    {
        return jsonPath.getString("LOCATORS.ROLE");
    }
    public static String email()
    {
        return jsonPath.getString("LOCATORS.EMAIL");
    }
    public static String cellphone()
    {
        return jsonPath.getString("LOCATORS.CELLPHONE");
    }
    public static String saveButton()
    {
        return jsonPath.getString("LOCATORS.SAVE_BUTTON");
    }




}
