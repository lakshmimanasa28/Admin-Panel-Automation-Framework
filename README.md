# Admin Panel Automation Framework

## Overview

This project is a Selenium-based test automation framework developed to validate core functionalities of a sample web application.

The framework follows the **Page Object Model (POM)** design pattern and covers multiple test modules including Forms, Tables, Alerts, Dynamic Elements, and Frames.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager

---

## Project Structure

```
src/main/java
  ├── base        → Base classes (Driver setup)
  ├── pages       → Page Object classes
  ├── utils       → ConfigReader & utilities

src/test/java
  ├── tests       → Test classes

src/main/resources
  ├── config.properties
```

---

## Configuration

Edit `config.properties`:

```
browser=chrome
baseUrl=https://testpages.eviltester.com/styled
timeout=10
headless=false
```

---

## How to Run Tests

### Using Eclipse

* Right-click `testng.xml`
* Click **Run As → TestNG Suite**

### Using Maven

```
mvn clean test
```

---

## Test Modules Covered

### 🔹 Module 1 – Form Interactions

* Fill form and submit
* Dropdown selection validation
* Radio & checkbox validation
* Empty form validation

### 🔹 Module 2 – Table Operations

* Verify table headers
* Sort table and validate changes
* Pagination handling
* Verify row data across pages

### 🔹 Module 3 – Alerts & Dialogs

* Handle alert popups
* Accept/Dismiss confirm dialogs
* Handle prompt inputs

### 🔹 Module 4 – Dynamic Elements

* Handle dynamic visibility
* Interact with dynamic buttons
* Validate dynamic behavior

### 🔹 Module 5 – Frames

* Switch to iframe
* Handle nested frames
* Switch back to main content

---

## Features

* Reusable Page Object Model
* Externalized configuration
* Explicit waits (no hardcoded sleeps)
* Clean and scalable design

---

## Outcome

* Automated multiple UI scenarios
* Improved test reliability
* Demonstrated real-world automation practices

---

## Author
Katakamsetty Lakshmi Manasa
