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