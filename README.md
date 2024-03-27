Technical Assessment

Overview :
Using Java, write a web based RESTful API for a fictional public library that can perform the
following functions:
1. List all books in the library
2. CRUD operations on a single book
The application does not have to be fully functional, but please take the time needed to exhibit your
skills.
There are no restrictions on what resources or third-party plugins you may use. We are looking for
your best thoughts on application architecture, API design, maintainability, etc.
Please return you submission as a link to a GitHub repo once completed. We look forward to seeing
your results!

Technical notes:
- Multi-service architecture created using Docker compose
  - Backend MySQL database called `library` containing one table, `book`
    - init-db.sql used to create the database and populate it with two dummy records upon startup
  - Spring Boot web app, with embedded Tomcat to run the library app
    - Built using Maven
    - Heavily reliant on dependency injection
    - 3-layer MVC architecture (Controller, Service, Repository, Domain)
    - Lombok in use
    - Book.java:
      - entity class used to construct the table
      - also a data transfer object used for serialization/deserialization
    - Documented API requests/responses using Restdoc
    - Controller testing


Future improvements:
- Create a full frontend using angular
- Extend application so it represents a real-life library management system

How to run:
1. Download the repo to a location of your choice
2. Execute the following command `docker-compose up -d`
3. Open the app on localhost:8080 and navigate to endpoint
 
