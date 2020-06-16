# learning-spring
A project created to learn basic concepts of Spring, a popular Java framework. The project explores the out of box Spring solutions with almost, no configuration such as 
<br> 1. Embedded Tomcat server
<br> 2. Embedded/In-memory H2 database
<br> 3. Thymeleaf Templating Engine (for mapping static content with dynamic data from model)
<br> 4. Maven as a build automation tool

### Summery of Spring terminologies

#### Plain Old Java Objects (POJO)
With respect to Spring, a POJO is a Bean with state and behaviour. 
Unlike EJB's which only holds state, getters and setters for that state.

#### Data Transfer Objects (DTO)
It is used to transfer the state across the application.

#### Inversion of Control (IOC)
Normal control: A custom code used the code from library.
Inversion of control: A code from the library uses custom code.

#### Dependency Injection
DI is one of the forms of IOC. It is a technique using which object contruction and usages is separated.
<br>Dependency/Service - A object of a class on which some other class depends
<br>Client - It depends on the service
<br>Injector - Creates the service and inject into the client
This way client does not have to worry about creating the object. 
It just have to use it. Abstraction!

Benefits:
 - Depeloper does not have to manage the object creation
 - Testing becomes easy using mock object.
 - Code becomes more readable.

#### Repository
An interface between database layer and Java layer. 
It provides ready to use access control mechanisms for data.

#### Entity
A Java class representation of Database table or document.



