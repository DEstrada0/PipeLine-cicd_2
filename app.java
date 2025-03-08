import static spark.Spark.*;

public class app {
    public static void main(String[] args) {
        port(8080);  // Start server on port 8080
        get("/", (req, res) -> "Hello World!");  // Define a simple route
    }
}
