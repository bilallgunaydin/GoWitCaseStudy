package Tests.HappyPathCases;

import BaseURLRepository.BaseURL;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Util.UtilsMethods;
import static ForVerify.verifyMethods.assertNumber;
import static ForVerify.verifyMethods.assertString;

public class HappyPathTests extends BaseURL {


    @Test()
    @Parameters({"id", "categoryId", "categoryName", "name", "photoUrl", "tagId", "tagName", "status"})
    public void createPet(long id, int categoryId, String categoryName,
                          String name, String photoUrl, int tagId, String tagName, String status) {
        assertNumber(id);
        assertNumber(categoryId);
        assertNumber(tagId);
        assertString(categoryName);
        assertString(name);
        assertString(photoUrl);
        assertString(tagName);
        assertString(status);
        UtilsMethods.createPet(id, categoryId, categoryName, name, photoUrl, tagId, tagName, status);
    }

    @Test()
    @Parameters({"id", "categoryId", "categoryName", "name", "photoUrl", "tagId", "tagName", "status"})
    public void updatePet(long id, int categoryId, String categoryName,
                          String name, String photoUrl, int tagId, String tagName, String status) {
        assertNumber(id);
        assertNumber(categoryId);
        assertNumber(tagId);
        assertString(categoryName);
        assertString(name);
        assertString(photoUrl);
        assertString(tagName);
        assertString(status);
        UtilsMethods.updatePet(id, categoryId, categoryName, name, photoUrl, tagId, tagName, status);
    }

    @Test()
    @Parameters({"id"})
    public void getPet(long id) {
        assertNumber(id);
        UtilsMethods.getPetById(id);
    }

    @Test()
    public void getPetList() {
        UtilsMethods.getPetList();
    }

    @Test()
    @Parameters({"status"})
    public void getPetListByStatus(String status) {
        assertString(status);
        String[] statusArray = status.split(",");
        for (String s : statusArray) {
            UtilsMethods.getPetListByStatus(s);
        }

    }

    @Test()
    @Parameters({"id"})
    public void deletePet(long id) {
        assertNumber(id);
        UtilsMethods.deletePetById(id);
    }
}

