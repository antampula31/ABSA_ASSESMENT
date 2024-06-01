package io.healthforce.www.keywords;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.healthforce.www.utilities.ReadVariables;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.BeforeMethod;

import java.util.Map;

public class CommonValidations
{
    private CommonValidations()
    {}

    public static JsonPath rawToJson(String response)
    {
        return new JsonPath(response);
    }

    public static String convertMapToJson(Map<String, Object> data) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(data);
    }

    @BeforeMethod
    public static void readYamlFile()
    {
        ReadVariables.readVariablesFile();

    }
}
