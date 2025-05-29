# 🛠️ CRUD Activity – Task & Project Management API

RESTful API built with Spring Boot for managing **projects**, **tasks**, and **users** within a team.  
Supports full **CRUD operations**, **assignments**, and **status tracking**, documented with Swagger/OpenAPI.

---

## ✅ Features

- CRUD for Projects, Tasks, and Users.
- Relationships:
    - Users ↔ Projects (Many-to-Many)
    - Projects → Tasks (One-to-Many)
    - Tasks → Users (Many-to-One)
- Filter and retrieve tasks by user or project.
- Swagger UI for interactive documentation.
- SQL script and data initializer included.

---

## 🛠️ Technologies Used

| Tool               | Description |
|--------------------|-------------|
| **Java 17**        | Main programming language |
| **Spring Boot 3.1.5** | Backend framework |
| **Spring Data JPA** | ORM and persistence |
| **MySQL**          | Relational database |
| **Swagger (Springdoc OpenAPI)** | API documentation |
| **Maven**          | Dependency management |
| **Lombok**         | Boilerplate code reduction |

---

## 🚀 Getting Started

### ✅ 1. Clone the repository

```bash
git clone https://github.com/YtzhakC/your-repo-name.git
cd your-repo-name
