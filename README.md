# camt053parser

A simple camt.053 XML parser built using java, maven and JAXB. This tool allows you to parse camt.053 bank statement files into Java objects for further processing or analysis.

## Features
- Parse camt.053 XML files (version [camt.053.001.02](https://www.betaalvereniging.nl/wp-content/uploads/IG-Bank-to-Customer-Statement-CAMT-053-v1-1.pdf)).
- Convert the XML content into structured Java objects.
- Licensed under the MIT License.

## Requirements
- Java 17 or higher
- Maven

## Installation

1. Clone the repository:
```bash
git clone https://github.com/plusminapp/camt053parser.git
```
2.  Navigate to the project directory:
```bash
cd camt053parser
```

3.   Build the project using Maven:
```bash
mvn clean install
```
This builds the library and copies `camt053parser-1.0.0.jar` and `camt053parser-1.0.0.pom` to tour local maven repository (usually `~/.m2`) 

## Usage

Add the parser as a dependency to your Maven project:
```xml
<dependency>
   <groupId>io.vliet</groupId>
   <artifactId>camt053parser</artifactId>
   <version>1.0.0</version>
</dependency>
```

A (kotlin) example usage can be found in the [Transactieservice](https://github.com/plusminapp/plusmin/blob/main/pm-backend/src/main/kotlin/io/vliet/plusmin/service/TransactieService.kt) of the [plusmin](https://github.com/plusminapp/plusmin.git) repo.

## License
This project is licensed under the [MIT](https://www.mit.edu/~amini/LICENSE.md) License.