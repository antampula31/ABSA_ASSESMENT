package api;

import dog.ceo.ApiCalls;
import dog.ceo.ApiValidations;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import utilities.ExtentReports;

public class ListOfBreedsTests extends ExtentReports
{
    @Test
    public static void getListOfAllBreeds()
    {
        test=extent.createTest("getListOfAllBreeds");
        JsonPath apiResponse= ApiCalls.listOfBreeds();
        ApiValidations.verifyRetrieverBreedWithinTheList(apiResponse);
        endReport();
    }

    @Test
    public static void getListOfRetrieverBreeds()
    {
        test=extent.createTest("getListOfRetrieverBreeds");
        String breed="retriever";
        JsonPath apiResponse= ApiCalls.listOfSubBreedsByBreed(breed);
        ApiValidations.verifyRetrieverBreedListIsReturned(apiResponse);
        endReport();
    }

    @Test
    public static void getRandomImageOfGoldenBreed()
    {
        test=extent.createTest("getRandomImageOfGoldenBreed");
        String breed="golden";
        JsonPath apiResponse= ApiCalls.randomImageOfABreed(breed);
        ApiValidations.verifyGoldenBreedRandomImageIsReturned(apiResponse);
        endReport();

    }
}
