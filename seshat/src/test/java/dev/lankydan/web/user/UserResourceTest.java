package dev.lankydan.web.user;

import io.quarkus.test.junit.QuarkusTest;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class UserResourceTest {

    @Test
    public void testUserEndpoint() throws Throwable {
        var obj = new JSONParser().parse(new FileReader("/Users/Shaco/quarkus-library-project/seshat/src/test/resources/user-sample-0.json"));
        given()
                .body(obj)
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when()
                .post("/user/user");
    }
}
