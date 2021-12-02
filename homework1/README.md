# Spring Dependencies

Following Spring dependencies is used in the project.

- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySQL Driver

I have used MySQL database.

## Steps to Run the Application
### First: 

Run "Homework1ApplicationTests", it will add some example data to the database.

### Second:

Change "spring.jpa.hibernate.ddl-auto=create" to "spring.jpa.hibernate.ddl-auto=update" in the first line of the application.properties file.

### Third:

Run "Homework1Application", now the system is up and running

### Fourth:

Now you can send requests to check different endpoints.


## Endpoints Supported
(GET)    /shops: List all shops (returns only address and name of the shop)

(POST)   /shops: Adds a shop to the shop table (accepts only name and address)

(GET)    /shops/[shop-id]/products/[price-greater-than]: Returns the id, address, name and the products whose price is 
greater than specified "[price-greater-than]" of a particular shop specified by the [shop-id].

(DELETE) /shops/[shop-id]: Deletes the shop whose id is [shop-id], it also unassigns the products and customers related
to particular shop.