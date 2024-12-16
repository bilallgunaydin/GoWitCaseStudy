package BaseURLRepository;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseURL {
    protected static RequestSpecification url;

    @BeforeMethod
    public void setUp() {

        url = new RequestSpecBuilder().
                setBaseUri("https://petstore.swagger.io/v2/")
                .build();
    }
}
