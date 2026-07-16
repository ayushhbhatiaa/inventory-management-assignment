# InventoryFlow - Office Inventory Management System

InventoryFlow is a full-stack Office Inventory Management System built using **Spring Boot**, **React**, **JWT Authentication**, and **H2 Database**.

The application allows office employees to create inventory purchase requests while purchasers can review, approve, reject, and complete those requests.

---

## Assignment Overview

This project was developed as part of a Full Stack Java + React assessment.

### Features

- JWT Authentication
- Role Based Login
- Admin
- Creator
- Purchaser
- Product Management
- Employee Management
- Inventory Request Management
- CRUD Operations
- REST APIs
- H2 Database
- Responsive React UI
- React Router
- Axios API Integration
- Spring Security
- CORS Enabled

---

# Tech Stack

## Backend

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Hibernate
- H2 Database
- JWT Authentication
- Maven
- Lombok

## Frontend

- React 19
- Vite
- React Router
- Axios
- Bootstrap 5

---

# Project Structure

```
inventory-management-assignment

│

├── backend
│   ├── src
│   ├── pom.xml
│
├── frontend
│   ├── src
│   ├── package.json
│
└── README.md
```

---

# Demo Accounts

| Role | Username | Password |
|-------|----------|----------|
| Admin | admin | admin123 |
| Creator | creator | creator123 |
| Purchaser | purchaser | purchaser123 |

---

# Running the Backend

Open terminal

```bash
cd backend
```

Run

```bash
mvn spring-boot:run
```

or simply run

```
InventoryflowBackendApplication
```

Backend URL

```
http://localhost:8081
```

H2 Console

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

# Running the Frontend

Open another terminal

```bash
cd frontend
```

Install packages

```bash
npm install
```

Run

```bash
npm run dev
```

Frontend

```
http://localhost:5173
```

---

# Application Workflow

```
Login

↓

Dashboard

↓

Manage Products

↓

Manage Employees

↓

Create Inventory Requests

↓

Purchaser Reviews Request

↓

Approve / Reject

↓

Complete Request
```

---

# Authentication

JWT Token authentication is implemented.

On successful login

- JWT Token is generated
- Username is returned
- Role is returned

The frontend stores the token in Local Storage and uses it for authenticated requests.

---

# Roles

## Admin

- Login
- Manage Products
- Manage Employees
- View Requests

---

## Creator

- Create Requests
- Edit Draft Requests
- Submit Requests

---

## Purchaser

- View Submitted Requests
- Approve Requests
- Reject Requests
- Complete Requests

---

# REST APIs

## Authentication

```
POST /api/auth/login
```

---

## Products

```
GET /api/products/getAllProducts

POST /api/products/addProduct

PUT /api/products/updateProduct/{id}

DELETE /api/products/deleteProduct/{id}
```

---

## Employees

```
GET /api/employees/getAllEmployees

POST /api/employees/addEmployee

PUT /api/employees/updateEmployee/{id}

DELETE /api/employees/deleteEmployee/{id}
```

---

## Inventory Requests

```
GET /api/inventoryRequests/getAllRequests

POST /api/inventoryRequests/addRequest

PUT /api/inventoryRequests/updateRequest/{id}

DELETE /api/inventoryRequests/deleteRequest/{id}
```

---

# Future Improvements

- Request Approval Workflow
- Request Rejection Notes
- Order Expiry Validation
- Multiple Items Per Request
- Pagination
- Search
- Sorting
- Filters
- Role Guards
- Refresh Token
- Docker Deployment
- PostgreSQL Support

---

# Developed By

**Ayush Bhatia**

Senior Software Engineer

GitHub

https://github.com/ayushhhbhatiaa
