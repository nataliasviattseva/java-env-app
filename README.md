# Java Environment App

## Overview
`java-env-app` is a Java-based application that utilizes JavaFX for UI development. The project is built using Maven and is configured with various plugins and dependencies to support development, testing, and code quality.

## Features
- JavaFX-based graphical user interface
- JUnit 5 for unit testing
- Checkstyle for code style validation
- JaCoCo for test coverage analysis

## Requirements
- Java 21 or later
- Maven 3.8+

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/java-env-app.git
   cd java-env-app
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```

## Running the Application
Execute the following command to run the application:
```sh
mvn javafx:run
```

## Testing
To run the tests, use:
```sh
mvn test
```

## Code Quality Checks
### Checkstyle
To check the coding style, run:
```sh
mvn checkstyle:check
```

### JaCoCo Test Coverage
To generate the test coverage report, run:
```sh
mvn verify
```
The report will be available in `target/site/jacoco/index.html`.

## Project Structure
```
java-env-app/
│── src/
│   ├── main/java/com/app/ (Application source code)
│   ├── test/java/com/app/ (Test cases)
│── pom.xml (Maven build configuration)
│── README.md (Project documentation)
```

## Dependencies
- JavaFX Controls (`org.openjfx:javafx-controls:21.0.2`)
- JUnit 5 (`org.junit.jupiter:junit-jupiter-api:5.12.1`)
- Checkstyle (`com.puppycrawl.tools:checkstyle:10.21.4`)
- JaCoCo Plugin (`org.jacoco:jacoco-maven-plugin:0.8.11`)

## Maven Plugins Used
- `maven-checkstyle-plugin`: Ensures code style compliance
- `jacoco-maven-plugin`: Generates test coverage reports
- `javafx-maven-plugin`: Facilitates JavaFX application execution

## License
This project is licensed under the MIT License.

## Author
Your Name (or Organization)

