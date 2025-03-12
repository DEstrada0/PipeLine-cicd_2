import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @BeforeAll
    public static void setUp() {
        Server.main(new String[]{}); // Start the server before tests run
        try {
            Thread.sleep(2000); // Wait for the server to start
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void tearDown() {
        System.exit(0); // Stop the server after tests
    }

    @Test
    public void testAppIsWorking() {
        Response response = RestAssured.get("http://localhost:8080/");
        assertEquals(200, response.getStatusCode());  // Check if response is 200 OK
        assertEquals("Hola", response.getBody().asString());  // Check response body
    }
}
