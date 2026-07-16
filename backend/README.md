# InventoryFlow Backend

Spring Boot REST API for InventoryFlow.

## Tech Stack

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Hibernate
- JWT
- H2 Database
- Maven

---

## Run

```bash
mvn spring-boot:run
```

or

Run

```
InventoryflowBackendApplication
```

Backend Port

```
8081
```

---

## H2 Console

```
http://localhost:8081/h2-console
```

Database URL

```
jdbc:h2:file:./data/inventoryflowdb
```

Username

```
sa
```

Password

```
(empty)
```

---

## Authentication

```
POST

/api/auth/login
```

Demo Users

| Username | Password | Role |
|-----------|----------|------|
| admin | admin123 | ADMIN |
| creator | creator123 | CREATOR |
| purchaser | purchaser123 | PURCHASER |

---

## API Modules

- Authentication
- Products
- Employees
- Inventory Requests

---

## Backend Architecture

```
Controller

↓

Service

↓

Repository

↓

Database
```
