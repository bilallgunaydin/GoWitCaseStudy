package Util;

import BaseURLRepository.BaseURL;
import Enums.PetStatus;
import Pojos.Category;
import Pojos.Pet;
import Pojos.Tag;
import ForVerify.verifyMethods;
import io.restassured.response.Response;
import java.util.Collections;

import static ForVerify.verifyMethods.verifyEndpoints;
import static io.restassured.RestAssured.given;

public class UtilsMethods extends BaseURL {

    public static Pet petBuilderData(long id, int categoryId, String categoryName, String name,
                                     String photoUrl, int tagId, String tagName, String status) {
        return Pet.builder()
                .id(id)
                .category(Category.builder().id(categoryId).name(categoryName).build())
                .name(name)
                .photoUrls(Collections.singletonList(photoUrl))
                .tags(Collections.singletonList(new Tag(tagId, tagName)))
                .status(PetStatus.safeValueOf(status))
                .build();
    }

    public static void createPet(long id, int categoryId, String categoryName, String name,
                                 String photoUrl, int tagId, String tagName, String status) {
        Pet petTemporary = petBuilderData(id, categoryId, categoryName, name, photoUrl, tagId, tagName, status);

        Response response = given()
                .header("Content-Type", "application/json")
                .spec(url)
                .body(petTemporary)
                .post("pet");

        verifyMethods.verifyPets(petTemporary, response.as(Pet.class));
        verifyEndpoints(response);
    }

    public static void updatePet(long id, int categoryId, String categoryName, String name,
                                 String photoUrl, int tagId, String tagName, String status) {

        Pet petTemporary = petBuilderData(id, categoryId, categoryName, name, photoUrl, tagId, tagName, status);
        Response response = given()
                .header("Content-Type", "application/json")
                .spec(url)
                .body(petTemporary)
                .put("pet");
        verifyMethods.verifyPets(petTemporary, response.as(Pet.class));
        verifyEndpoints(response);
    }

    public static void getPetList() {
        for (PetStatus status : PetStatus.values()) {
            Response response = given()
                    .header("Content-Type", "application/json")
                    .spec(url)
                    .queryParam("status", status.name())
                    .when()
                    .get("pet/findByStatus");

            verifyEndpoints(response);
        }
    }

    public static void getPetListByStatus(String statusParametre) {

            Response response = given()
                    .header("Content-Type", "application/json")
                    .spec(url)
                    .queryParam("status", statusParametre)
                    .when()
                    .get("pet/findByStatus");
            verifyEndpoints(response);
    }

    public static void getPetById(long id) {
        try {

            Response response = given()
                    .contentType("application/json")
                    .when()
                    .spec(url)
                    .get("pet/" + id);
            if (response.statusCode() == 200) {
                System.out.println("Response Body (200 OK):");
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

    public static void deletePetById(long id) {
        try {
            Response response = given()
                    .contentType("application/json")
                    .when()
                    .spec(url)
                    .delete("pet/" + id);
            if (response.statusCode() == 200) {
                System.out.println("Response Body (200 OK):");
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
