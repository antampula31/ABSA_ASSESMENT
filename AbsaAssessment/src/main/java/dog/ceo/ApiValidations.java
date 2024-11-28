package dog.ceo;

import io.restassured.path.json.JsonPath;
import utilities.Reporter;

public class ApiValidations
{
    private ApiValidations()
    {}
    public static void verifyRetrieverBreedWithinTheList(JsonPath apiResponse)
    {
        String retrieverBreed = apiResponse.getString("message.retriever");

        if(retrieverBreed.equals("retriever"))
            Reporter.pass("Verify" + "   -retriever is within the list");
    }
}
