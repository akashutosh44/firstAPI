# Step 1: Use a base image with OpenJDK 8
FROM openjdk:8-jdk-alpine as builder

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the packaged JAR file from your local machine to the container
COPY target/firstAPI-0.0.1-SNAPSHOT.jar /app/firstAPI.jar

# Step 4: Expose the port the app will run on (optional, default 8080)
EXPOSE 8083

# Step 5: Set the entry point to run the JAR file
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "firstAPI.jar"]
