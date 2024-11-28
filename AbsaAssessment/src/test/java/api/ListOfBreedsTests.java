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
        test=extent.createTest("ListOfAllBreeds");
        JsonPath apiResponse= ApiCalls.listOfBreeds();
        ApiValidations.verifyRetrieverBreedWithinTheList(apiResponse);

        endReport();
    }

    @Test
    public static void getListOfRetrieverBreeds()
    {
        test=extent.createTest("ListOfRetrieverBreeds");
        String breed="retriever";
        JsonPath apiResponse= ApiCalls.listOfSubBreedsByBreed(breed);
        ApiValidations.verifyRetrieverBreedWithinTheList(apiResponse);
        endReport();
    }

    @Test
    public static void getRandomImageOfGoldenBreed()
    {
        test=extent.createTest("RandomImageOfGoldenBreed");
        String breed="golden";
        JsonPath apiResponse= ApiCalls.listOfSubBreedsByBreed(breed);
        ApiValidations.verifyRetrieverBreedWithinTheList(apiResponse);
        endReport();
    }
}
