# Employee Management System

A Spring Boot application for managing employee information.

## Features

- Web interface for employee data entry
- RESTful APIs for CRUD operations
- H2 in-memory database
- Input validation
- Error handling
- Unit tests

## Prerequisites

- Java 17 or higher
- Gradle

## Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application:
   ```bash
   ./gradlew bootRun
   ```
4. Access the application:
   - Web Interface: http://localhost:8080
   - H2 Console: http://localhost:8080/h2-console
   - API Endpoints: http://localhost:8080/api/employees

## API Endpoints

1. Get all employees:
   ```
   GET /api/employees
   ```

2. Get employee by ID:
   ```
   GET /api/employees/{id}
   ```

3. Create new employee:
   ```
   POST /api/employees
   Content-Type: application/json
   {
     "name": "John Doe",
     "age": 30,
     "location": "New York"
   }
   ```

4. Update employee:
   ```
   PUT /api/employees/{id}
   Content-Type: application/json
   {
     "name": "John Doe",
     "age": 31,
     "location": "Boston"
   }
   ```

5. Delete employee:
   ```
   DELETE /api/employees/{id}
   ```

## Running Tests

```bash
./gradlew test
```

## H2 Database Access

1. Go to http://localhost:8080/h2-console
2. JDBC URL: jdbc:h2:mem:employeedb
3. Username: sa
4. Password: password