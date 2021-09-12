## Spring Boot app
A mini project for Spring Boot with dependencies of:
- Spring Web, 
- Spring Data JPA and
- PostgreSQL Driver

The purpose of this app is to build the API consisting of 3 layers (API layer, Service layer, Data Access layer) and connect to real database. 


This demo app is the introduction and demonstration of this framework. It aims to use the power of this amazing framework 


## UML Class Diagram

The diagram below illustrates usa case of backend infastrcuture of app, excluding the frontend. 

All layers are communicating each other. 

- The API layer receives GET, POST, PUT and DELETE requests. 

- The Service layer is essentially for business logic. 

- The Data Access layer is responsible for connecting to database. 

![Intro Page](https://github.com/gulbalasalamov/springboot-web-datajpa-postgresql/blob/master/docs/diagram.png)

## Documentation
End points:

GET http://localhost:8080/api/v1/student

POST http://localhost:8080/api/v1/student

PUT http://localhost:8080/api/v1/student/{{studentId}}

DELETE http://localhost:8080/api/v1/student/{{studentId}}
 
Packaging application into .jar, multiple instance of the application can be run. To run another instance of the app, start it in another port. 
> java -jar springdemo-0.0.1-SNAPSHOT.jar --server.port=8082 

