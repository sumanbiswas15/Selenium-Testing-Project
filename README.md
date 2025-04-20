# Selenium Testing Project

## Overview
This project is a Selenium-based automation testing framework written in Java. It includes sample test scripts and automation utilities to interact with web browsers using Selenium WebDriver.

## Project Structure

- **Exe Files/**: Contains browser driver executables required for Selenium WebDriver (ChromeDriver, GeckoDriver, IEDriver).
- **jar Files/**: Contains Selenium Java libraries and dependencies.
- **SeliniumTesting/**: Main project directory containing source code, compiled classes, and project configuration files.
  - **src/**: Java source files for the Selenium tests.
  - **co/**: Additional Java source files organized by package structure.
  - **bin/**: Compiled Java class files.
  - **.classpath, .project**: Eclipse project configuration files.
- **README.md**: Project documentation file.

## Prerequisites
- Java Development Kit (JDK) installed.
- Eclipse IDE or any Java IDE for development.
- Browser drivers (ChromeDriver, GeckoDriver, IEDriver) compatible with your browser versions.

## How to Run
1. Import the project into your Java IDE.
2. Ensure the browser driver executables in `Exe Files/` are accessible and configured in your system PATH or specify their location in your test scripts.
3. Add the Selenium jar files from `jar Files/` to your project's build path.
4. Compile and run the test classes located in `SeliniumTesting/src` or `SeliniumTesting/co`.

## Sample Test
The `Demo.java` file in `SeliniumTesting/co/edureka/selenium/demo/` contains sample Selenium test scripts demonstrating browser automation.

## Notes
- Keep browser drivers updated to match your browser versions.
- This project uses Selenium 4.31.0 libraries.

## License
This project is provided as-is without any warranties.

## Compile and Run

To compile the `Demo.java` file, use the following command:

```
javac -cp "C:\Users\91843\OneDrive\Desktop\SE\jar Files\selenium-java-4.31.0\*;" co\edureka\selenium\demo\Demo.java
```

To run the compiled `Demo` class, use the following command:

```
java -cp ".;C:\Users\91843\OneDrive\Desktop\SE\jar Files\selenium-java-4.31.0\*" co.edureka.selenium.demo.Demo
```
java -cp ".;C:\Users\91843\OneDrive\Desktop\SE\jar Files\selenium-java-4.31.0\*" co.edureka.selenium.demo.Demo
javac -cp "C:\Users\91843\OneDrive\Desktop\SE\jar Files\selenium-java-4.31.0\*;" co\edureka\selenium\demo\Demo.java
To compile the `Demo.java` file, use the following command:


