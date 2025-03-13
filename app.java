import static spark.Spark.*;

public class app {
    public static void main(String[] args) {
        port(8080);  // Start server on port 8080
        get("/", (req, res) -> "Hello World!");  // Return "Hello World!"

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down Spark server...");
            stop();
        }));
    }
}
