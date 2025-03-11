# Use OpenJDK as base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/*.jar app.jar

# Expose the application port (adjust if needed)
EXPOSE 8080

# Run the application
CMD ["java", "-java", "app.java"]
