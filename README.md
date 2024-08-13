# Spring Codeschool

This is a Spring Boot application for managing student data.

## Project Structure

- `src/main/java/lk/codeschool/spring_codeschool/` - Main application package
    - `SpringCodeschoolApplication.java` - Main class to run the Spring Boot application
    - `api/` - Contains REST API controllers
        - `StudentApi.java` - REST controller for student-related endpoints
    - `dto/` - Contains Data Transfer Objects (DTOs)
        - `Student.java` - DTO for student data

- `src/main/resources/` - Contains application configuration files
    - `application.properties` - Main configuration file

- `pom.xml` - Maven configuration file

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Test
- Lombok

## Running the Application

1. Ensure you have Java 17 installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Run the application using Maven:
   ```sh
   mvn spring-boot:run