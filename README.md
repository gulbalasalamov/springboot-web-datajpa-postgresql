## Spring Boot app
A mini project for Spring Boot with dependencies of:
- Spring Web (Builds web, including RESTful, applications using Spring MVC)
- Spring Data JPA (Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate)
- PostgreSQL Driver (JDBC & R2DBC driver allowing Java programs to connect to PostgreSQL database using standart Java code)

The purpose of this app is to build the API consisting of 3 layers (API layer, Service layer, Data Access layer) and connect to real database. 


This demo app is the introduction and demonstration of this framework. It aims to use the power of this amazing framework 


## UML Class Diagram

The diagram below illustrates usa case of backend infastrcuture of app, excluding the frontend. 

All layers are communicating each other. 

- The API layer receives GET, POST, PUT and DELETE requests. 

- The Service layer is essentially for business logic. 

- The Data Access layer is responsible for connecting to database. 

The API layer is talking to Service layer to get some data, and Service layer talks to Data Access layer to get data to return so that it does a round trip all the way back between layers.

![Intro Page](https://github.com/gulbalasalamov/springboot-web-datajpa-postgresql/blob/master/docs/diagram.png)

## Documentation
End points:

GET http://localhost:8080/api/v1/student

Following request will populate and list all records in database.

```json
[
  {
    "id": 1,
    "name": "Gulbala",
    "email": "gulbala@gmail.com",
    "dob": "1990-11-20",
    "age": 30
  },
  {
    "id": 2,
    "name": "Alex",
    "email": "alex@gmail.com",
    "dob": "2004-11-05",
    "age": 16
  }
]
```
POST http://localhost:8080/api/v1/student

A new record in database with given name, email and dob is created. Specific id generated automatically and age calculated.


```json
{
  "name": "Daria",
  "email": "daria@gmail.com",
  "dob": "1994-07-15"
}
```

PUT http://localhost:8080/api/v1/student/{{studentId}}
> PUT ht<span>tp://localhost:8080/api/v1/student/3?name=Daria DA&email=daria_new'@'gmail.com
 
 Selected record's name and email associated with provided id is updated.

```json
[
  ...
  {
    "id": 3,
    "name": "Daria DA",
    "email": "daria_new@gmail.com",
    "dob": "1994-07-15",
    "age": 27
  }
 ...
]
```

DELETE http://localhost:8080/api/v1/student/{{studentId}}
 > DELETE ht<span>tp://localhost:8080/api/v1/student/2
 
Selected record and its information associated with provided id is removed.
 
## Running .jar and multiple instance of the app 


Packaging application into .jar, multiple instance of the application can be run. To run another instance of the app, start it in another port. 
  
 > java -jar springdemo-0.0.1-SNAPSHOT.jar --server.port=8082 
 
 ![Intro Page](https://github.com/gulbalasalamov/springboot-web-datajpa-postgresql/blob/master/docs/jar_instances.png)

the .jar file can be accessed from releases: https://github.com/gulbalasalamov/springboot-web-datajpa-postgresql/releases/tag/v1.0


