# Thymeleaf Practice Project

This project is for practicing with Spring Boot and Thymeleaf.

## 📝 Project Overview

This is a simple project created to configure a Spring Boot and Thymeleaf environment and to get familiar with its features through hands-on practice.

## 🛠️ Environment

- **Language**: Kotlin
- **Java Version**: 21
- **Build Tool**: Gradle
- **Spring Boot Version**: 3.5.3
- **Key Dependencies**:
    - Spring Boot Starter Web
    - Spring Boot Starter Thymeleaf
    - Spring Boot Starter Data JPA

## 🚀 How to Run

1.  Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2.  Navigate to the project directory and build the project using Gradle:
    ```bash
    ./gradlew build
    ```
3.  Run the application:
    ```bash
    ./gradlew bootRun
    ```
    Alternatively, you can run the `ThymeleafPracticeApplication.kt` file directly from your IDE (e.g., IntelliJ).

4.  The application will be accessible at `http://localhost:8080`.

## ⚠️ Notes

This project includes the `spring-boot-starter-data-jpa` dependency, which requires a database connection.

-   **If you are not using a database**, you can remove or comment out the following line in your `build.gradle.kts` file to avoid configuration errors:
    ```kotlin
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    ```

-   **If you want to use an in-memory database (e.g., H2)** for local development, add the following configuration to `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```
