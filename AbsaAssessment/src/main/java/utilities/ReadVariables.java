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

    private ReadVariables() {
    }

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
        return jsonPath.getString("BASE_URL");
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



}
