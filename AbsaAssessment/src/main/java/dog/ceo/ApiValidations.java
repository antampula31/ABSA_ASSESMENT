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


    public static void verifyRetrieverBreedListIsReturned(JsonPath apiResponse)
    {
        int retrieverBreedSize = apiResponse.getInt("message.size()");

        if(retrieverBreedSize!=0)
            Reporter.pass("Retriever Sub Breed list Displayed");
    }

    public static void verifyGoldenBreedRandomImageIsReturned(JsonPath apiResponse)
    {
        String message = apiResponse.getString("message");

        if(!message.isEmpty())
            Reporter.pass("Retriever Sub Breed list Displayed");
    }
}
