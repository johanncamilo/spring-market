# Spring Boot
[captura de apuntes](https://docs.google.com/document/d/1whzY5DwcKjnMf2dsteM3sRMzqClnMa-p1IHvUeYaE94/edit)

## ¿Qué es JPA?
#### Java Persistence Api
Jpa es una especificación de Java, standar, para un framework ORM. Quiere decir que son uan serie de reglas que Java define para que cualquier framework que quierea interactura con la BD de Java, tenga que seguir.

Los frameworks mas populares de Java para este fin son:

* Hibernate
* TopLink
* EclipseLink
* ObjectDB

### Anotaciones JPA
JPA utiliza anotaciones para conectar clases a tablas de la BD y asi evitar hacerlo de manera nativa con SQL.

* `@Entity` Indica a una clase de java que esta representando una tabla de nuestra BD.
* `@Table`  Recibe el nombre de la tabla a la cual esta mapeando la clase.
* `@Column`  Se le pone a los atributos de la clase, no es obligatoria, se indica sólo cuando el nombre de la columna es diferente al nombre del atributo de la tabla.
* `@id` amd `@EmbededID` Es el atributo como clave primaria de la tabla dentro de la clase. @id se utiliza cuando es clave primaria sencilla y @EmbededID cuando es una clave primaria compuesta.
* `@GeneratedValue`  Permite generar automáticamente generar valores para las clases primarias en nuestras clases
* `@OneToMany` and `@MatyToOne` Representar relaciones

## Spring Data
Spring Data NO es una implementacion de JPA, sino mas bien es un proyecto que usa JPA para ofrecer funcionalidaes extra en la gestion de tareas desde JAVA a las base de datos.

Spring Data internamente tiene varios subproyectos, entre ellos: Spring Data JPA y Spring Data JDBC, para conectarnos a BD relacionales (SQL). Spring Data MongoDB y Spring Data Cassandra, son proyectos para conectarnos a BD no relacionales.

La tarea principal de Spring Data es optimizar tareas repitivas.

Spring data nos provee de respositorios sin codigo, nos permiten hacer todo tipo de operaciones en BD (CRUD) sin utilizar una linea de código.

También nos provee de auditorías transparentes, por ello, posee un motor de auditorias que nos permite saber cuadno se insertó un registro, cuando se borró, cuando se actualizo en la BD, etc.


#### Implementación Spring Data en el proyecto Market:
Se busca en [MAVEN REPOSTITORY](https://mvnrepository.com/) el repositorio **Spring Boot Starter Data JPA**,
se copia el group y el name dentro del tag `dependencies` del archivo **build.gradle** 
de nuestro proyecto quedando de la siguiente manera.
```gradle
dependencies { 
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    ...
    }
```
