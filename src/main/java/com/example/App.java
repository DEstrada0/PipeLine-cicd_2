package com.example;

import static spark.Spark.port;
import static spark.Spark.get;
import static spark.Spark.stop;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from World!");
        port(8080);
        get("/", (req, res) -> "Hello from World!");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down Spark server...");
            stop();
        }));

    }

    // Simple method to test
    public static String getGreeting() {
        return "Hello from World!";
    }

    
}
