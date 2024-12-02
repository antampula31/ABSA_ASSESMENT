package dog.ceo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.ReadVariables;

import static io.restassured.RestAssured.given;

public class ApiCalls
{
    private ApiCalls()
    {}
    public static JsonPath listOfBreeds()
    {
        ReadVariables.readVariablesFile();
        RestAssured.baseURI = ReadVariables.getApiBaseURL();
        String response = given().log().all().
                when().
                get(ReadVariables.getApiBreedsUri()).
                then().
                log().all().
                assertThat().statusCode(200).extract().response().asString();

        //convert response to json
        return CommonApiValidations.rawToJson(response);
    }

    public static JsonPath listOfSubBreedsByBreed(String breedName)
    {
        ReadVariables.readVariablesFile();
        RestAssured.baseURI = ReadVariables.getApiBaseURL();
        String response = given().log().all().pathParam("breed", breedName).
                when().
                get(ReadVariables.getSubBreedsUri()).
                then().
                log().all().
                assertThat().statusCode(200).extract().response().asString();

        //convert response to json
        return CommonApiValidations.rawToJson(response);
    }

    public static JsonPath randomImageOfABreed(String breedName)
    {
        ReadVariables.readVariablesFile();
        RestAssured.baseURI = ReadVariables.getApiBaseURL();
        String response = given().log().all().pathParam("breed", breedName).
                when().
                get(ReadVariables.getSubBreedsRandomImageUri()).
                then().
                log().all().
                assertThat().statusCode(200).extract().response().asString();

        //convert response to json
        return CommonApiValidations.rawToJson(response);
    }


}
