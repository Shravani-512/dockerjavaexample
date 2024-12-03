# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code into the container
COPY TrafficLight.java .

# Compile the Java program
RUN javac TrafficLight.java

# Define the command to run the program
CMD ["java", "TrafficLight"]

