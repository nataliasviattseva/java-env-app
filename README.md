# Java Environment Application

## Overview
This project, `java-env-app`, is a Java-based application that utilizes JavaFX for UI components. It is built using Maven and configured with essential development tools such as Checkstyle for code quality checks and JaCoCo for test coverage reporting.

## Project Structure
- **Language:** Java 21
- **Build Tool:** Apache Maven
- **Package Format:** JAR
- **Main Class:** `com.app.HelloFX`

```
java-env-app/
│── src/
│   ├── main/java/com/app/ (Application source code)
│   ├── test/java/com/app/ (Test cases)
│── pom.xml (Maven build configuration)
│── README.md (Project documentation)
```

## Dependencies
The project includes the following dependencies:
- **JavaFX Controls (`org.openjfx:javafx-controls:21.0.2`)** - Required for JavaFX UI components.
- **JUnit Jupiter API (`org.junit.jupiter:junit-jupiter-api:5.12.1`)** - Used for writing unit tests.
- **Checkstyle (`com.puppycrawl.tools:checkstyle:10.21.4`)** - Ensures consistent code quality.

## Build Plugins
The project includes the following Maven plugins:
- **Maven Checkstyle Plugin (`org.apache.maven.plugins:maven-checkstyle-plugin:3.3.0`)** - Runs Checkstyle during the validation phase.
- **JaCoCo Maven Plugin (`org.jacoco:jacoco-maven-plugin:0.8.11`)** - Configured for generating test coverage reports.
- **JavaFX Maven Plugin (`org.openjfx:javafx-maven-plugin:0.0.8`)** - Used for JavaFX application packaging and execution.

## Build and Run
### Prerequisites
Ensure you have the following installed:
- Java 21
- Apache Maven

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/nataliasviattseva/java-env-app.git
   cd java-env-app
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```

### Run the Application
To run the JavaFX application, use:
```sh
mvn javafx:run
```

### Running Tests
To execute the test cases:
```sh
mvn test
```

## Code Quality and Test Coverage
### Checkstyle
To check code style consistency:
```sh
mvn checkstyle:check
```

Generate Checkstyle Report:
```sh
mvn checkstyle:checkstyle
```
The report will be generated in `target/site/checkstyle.html`.

### Generate JaCoCo Report
To generate a test coverage report:
```sh
mvn verify
```
The report will be generated in `target/site/jacoco/index.html`.

## Dependencies
- JavaFX Controls (`org.openjfx:javafx-controls:21.0.2`)
- JUnit 5 (`org.junit.jupiter:junit-jupiter-api:5.12.1`)
- Checkstyle (`com.puppycrawl.tools:checkstyle:10.21.4`)
- JaCoCo Plugin (`org.jacoco:jacoco-maven-plugin:0.8.11`)

## Maven Plugins Used
- `maven-checkstyle-plugin`: Ensures code style compliance
- `jacoco-maven-plugin`: Generates test coverage reports
- `javafx-maven-plugin`: Facilitates JavaFX application execution
