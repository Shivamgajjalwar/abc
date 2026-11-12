# ABC — Spring Boot starter

A Java 17 / Spring Boot 3 Maven project with a conventional layered package layout.

## Project structure

```text
src/
├── main/
│   ├── java/com/shivamgajjalwar/abc/
│   │   ├── AbcApplication.java
│   │   ├── api/          # REST controllers
│   │   ├── config/       # Spring configuration
│   │   ├── dto/          # Request/response objects
│   │   ├── exception/    # Application exceptions and REST error handling
│   │   ├── model/        # Domain models and entities
│   │   ├── repository/   # Persistence repositories
│   │   └── service/      # Business logic
│   └── resources/
│       └── application.properties
└── test/java/com/shivamgajjalwar/abc/
```

The starter includes a sample health endpoint at `GET /api/v1/health`, which returns `{"status":"UP"}`.

## Run

Requires Java 17 or newer and Maven.

```bash
mvn spring-boot:run
```

Run the tests with:

```bash
mvn test
```
