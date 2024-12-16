package Tests.NegativeCase;

import BaseURLRepository.BaseURL;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Util.UtilsMethods;

import static ForVerify.verifyMethods.assertNumber;
import static ForVerify.verifyMethods.assertString;

public class negativeCasesTests extends BaseURL {


    @Test()
    @Parameters({"id", "categoryId", "categoryName", "name", "photoUrl", "tagId", "tagName", "status"})
    public void createPetNegativeScenario(long id, int categoryId, String categoryName,
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
    public void UpdatePetNegativeScenario(long id, int categoryId, String categoryName,
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
    public void getPetNegativeScenario(long id) {
        assertNumber(id);
        UtilsMethods.getPetById(id);
    }


    @Test()
    @Parameters({"status"})
    public void getPetListByStatusNotExists(String status) {
        assertString(status);
        String[] statusArray = status.split(",");
        for (String s : statusArray) {
            UtilsMethods.getPetListByStatus(s);
        }
        //Bu testin sonunun 200 ve boş response dönmesi sunucudan kaynaklanıyor.
        //Meğer var olmayan bir string statusu gönderirsek yine de 200 dönüyormuş.
    }

    @Test()
    @Parameters({"id"})
    public void deletePetNotExists(long id) {
        assertNumber(id);
        UtilsMethods.deletePetById(id);
    }
}
