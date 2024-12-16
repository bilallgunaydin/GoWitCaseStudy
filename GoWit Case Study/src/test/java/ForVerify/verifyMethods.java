package ForVerify;

import Enums.PetStatus;
import Pojos.Pet;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class verifyMethods {
    public static void verifyPets(Pet temprorary, Pet newPet) {
        assertThat(temprorary, equalTo(newPet));
    }

    public static void assertString(String value) {

        Assert.assertNotNull(value, "String value is null");
        Assert.assertFalse(value.isEmpty(), "String value is empty");
    }

    public static void assertNumber(Number value) {

        Assert.assertNotNull(value, "Integer value is null");
        Assert.assertTrue(value.doubleValue() >= 0, "Number value is less than 0");
    }

    public static void verifyAllPetsByStatus(List<Pet> pets, PetStatus status) {
        pets.forEach(pet -> assertThat(pet.getStatus(), equalTo(status)));
    }

    public static void verifyPetId(Pet pet, long expectedId) {
        assertThat(pet.getId(), equalTo(expectedId));
    }

    public static void verifyEndpoints(Response response) {
        try {

            if (response.statusCode() == 200) {
                response.body().prettyPrint();
            } else {
                System.out.println("Error Response:");
                System.out.println("Status Code: " + response.statusCode());
                System.out.println("Response Body:");
                response.body().prettyPrint();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
