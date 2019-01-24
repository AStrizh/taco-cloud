# taco-cloud
This is an implementation of the taco-cloud application explored in Spring in Action 5th Edition.  
It is a learning tool to study the Java Spring Framework.

As of last update: 
The code from Chapter 3 (JDBC) has been implemented

Note: As written the code would not work. IngredientByIdConverter (described in the following section on JPA) must be implemented as well.
Additionally, the H2 database version *.196 must be set in the POM as shown below.  
The default version (likely *.197) breaks auto incrementation; which causes GeneratedKeyHolder.getKey() to return null.
<h2.version>1.4.196</h2.version>  -- include this in the properties section of the .pom file.

## Build Tools

- Java 1.8
- Spring 2.1.1
- Intellij IDEA
---

## Author

Aleksandr Strizhevskiy, strizhevskiy@erudos.com

implementing the project from 

Spring in Action 5th Edition by Craig Walls

---
