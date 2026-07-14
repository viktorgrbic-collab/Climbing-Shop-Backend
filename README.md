A full-stack web application designed for managing a climbing equipment store. The project consists of a Spring Boot REST API backend and a JavaScript frontend that communicate through HTTP requests. The backend is built with Spring Boot, Spring Security, JWT authentication, Spring Data JPA, Hibernate, and MySQL, providing secure access to all protected resources. The frontend offers an intuitive interface for managing products, stores, inventory, users, and customer orders. The application includes authentication and authorization, complete CRUD functionality, relational database management, and follows a layered architecture to ensure maintainability, scalability, and separation of concerns.
## Running the Backend

1. Clone the repository.
2. Create a MySQL database.
3. Configure the database connection by updating the `application.properties` file with your MySQL username and password.
4. Open the backend project in your preferred IDE (IntelliJ IDEA, Eclipse, or NetBeans).
5. Run the Spring Boot application, or execute:

```bash
mvn spring-boot:run
```

The backend server will start at:

```
http://localhost:8080
```
