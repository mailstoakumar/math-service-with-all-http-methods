# Math Service with Spring Boot

This is a Spring Boot microservice for performing basic math operations. The service provides REST APIs to add, subtract, multiply, divide, set, and reset a value.

## Project Structure

The project follows a standard Spring Boot structure with packages organized by functionality:

- **controller**: Contains the REST controllers for handling HTTP requests.
- **service**: Contains the business logic for math operations.
- **repository**: Manages the state of the current value (simulated as an in-memory repository).
- **exception**: Handles global exceptions for the application.

## Endpoints

The base URL for the endpoints is `http://localhost:9090/math` (assuming the default port is changed to `9090`).

| HTTP Method | Endpoint           | Description                          | Example URL                                      |
|-------------|--------------------|--------------------------------------|--------------------------------------------------|
| `GET`       | `/current`         | Get the current value.               | `http://localhost:9090/math/current`             |
| `POST`      | `/add`             | Add a value to the current value.    | `http://localhost:9090/math/add?value=5`         |
| `POST`      | `/subtract`        | Subtract a value from the current value. | `http://localhost:9090/math/subtract?value=3`    |
| `POST`      | `/multiply`        | Multiply the current value by a value. | `http://localhost:9090/math/multiply?value=4`    |
| `POST`      | `/divide`          | Divide the current value by a value. | `http://localhost:9090/math/divide?value=2`      |
| `PUT`       | `/set`             | Set a new value.                     | `http://localhost:9090/math/set?value=10`        |
| `DELETE`    | `/reset`           | Reset the value to zero.             | `http://localhost:9090/math/reset`               |

## Setup and Run

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/math-service-with-all-http-methods.git
