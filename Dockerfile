FROM gradle:7.5.1-jdk17 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy all project files to the container
COPY . .

# Build the application using Gradle
RUN gradle build --no-daemon

# Use a lightweight base image for running the built Java application
FROM eclipse-temurin:17-jre-alpine

# Set the working directory in the runtime container
WORKDIR /app

# Copy the built JAR file from the builder container
COPY --from=builder /app/build/libs/*.jar app.jar

# Specify the command to run the application
CMD ["java", "-jar", "app.jar"]
