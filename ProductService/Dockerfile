# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the build artifact from the target directory
COPY target/products-service-0.0.1-SNAPSHOT.jar products-service.jar

# Expose the application port
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "products-service.jar"]
