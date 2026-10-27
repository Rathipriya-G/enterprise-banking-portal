# Enterprise Banking Portal

A responsive banking portal demonstration built with Java 21 and Spring Boot.

## Features
- Responsive HTML, CSS, and JavaScript frontend
- Spring Boot REST API
- Spring Security session-based authentication
- Global exception handling with `@RestControllerAdvice` and `@ExceptionHandler`
- Swagger UI / OpenAPI documentation
- H2 in-memory database configuration

## Technology Stack
- Java 21
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI
- HTML5, CSS3, JavaScript
- Maven

## Prerequisites
- JDK 21
- Maven 3.9 or later

## Run Locally
1. Clone or download this repository.
2. Open a terminal in the folder containing `pom.xml`.
3. Run `mvn test`.
4. Run `mvn spring-boot:run`.
5. Open `http://localhost:8080/`.

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/health` | Public application health check |
| GET | `/api/account` | Sample account information; requires login |
| GET | `/api/demo-error` | Demonstrates global error handling; requires login |
| GET | `/swagger-ui.html` | OpenAPI documentation |

## Security
Spring Security protects the account endpoints using form login and an authenticated session. The default development user is created by Spring Security. Configure explicit credentials and production security settings before any deployment.

## Demo Data Notice
This is an educational project. Account information and balances are fictional. It does not connect to a real bank and must not be used for real financial transactions.

## Build and Test
Run `mvn test` to execute the automated tests.

## Author
Rathipriya G
