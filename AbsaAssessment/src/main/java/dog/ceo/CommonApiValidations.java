package dog.ceo;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.Map;

public class CommonApiValidations
{
    private CommonApiValidations()
    {
    }

    public static JsonPath rawToJson(String response) {
        return new JsonPath(response);
    }

    public static String convertMapToJson(Map<String, Object> data)
    {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.writeValueAsString(data);
        }

        catch (Exception e)
        {
            Assert.fail(e.getMessage());
            return "FAIL";
        }


    }
}
