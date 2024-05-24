# FolksDev-Custom-Queries-in-Spring-Boot-JPA-JPQL-Native-Query

JPA (Java Persistence API):

JPA is a Java specification for managing relational data in Java applications. It provides a set of interfaces and annotations to define how Java objects will be mapped to and from database tables. JPA abstracts away the interaction details with different database management systems (DBMS) and offers a consistent API for performing CRUD (Create, Read, Update, Delete) operations. It allows developers to work with entities, which are Java objects representing data stored in the database.

JPQL (Java Persistence Query Language):

JPQL is a query language provided by JPA and used to perform database queries using entities. Similar to SQL (Structured Query Language), JPQL operates on entities instead of database tables. JPQL queries are written in a platform-independent manner, allowing developers to write queries regardless of the underlying database syntax. JPQL queries are translated into native SQL queries by the JPA provider at runtime, enabling developers to write database queries in an object-oriented manner.

Native Query:

A native query is an SQL query written in the native query language supported by the underlying database. Unlike JPQL queries, native queries are specific to the used database and may not be portable across different database management systems. Native queries are useful when developers need to utilize database-specific features or optimize performance by directly writing complex queries in the SQL language.

JPQL operates on entities, while a native query operates directly on the database.
