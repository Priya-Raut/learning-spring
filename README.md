# learning-spring
A project created to learn basic concepts of Spring, a popular Java framework

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
<br>Dependency/Service - A object to be used
<brClient - It depends on the service
<br>Injector - Created the service and inject into the client
This way client does not have to worry about creating the object. 
It just have to use it. Abstraction!

#### Repository
An interface between database layer and Java layer. 
It provides ready to use access control mechanisms for data.

#### Entity
A Java class representation of Database table or document.



