
# RBAC System – Java

## Project Overview
This project implements a simple Role-Based Access Control (RBAC) system using Java 21.

The system allows users to be assigned to roles and permissions to be assigned to roles. It checks user permissions before allowing access to account operations.

## Technologies Used
- Java 21
- HashMap
- HashSet
- Git & GitHub

## User Roles and Permissions

| Role | Permissions |
|------|-------------|
| Admin | Create, View, Update, Delete |
| Manager | View, Update |
| Customer | View |

## Project Structure

```text
RBAC-System/
├── src/
│   └── RBACSystem.java
├── README.md
└── .gitignore
```

## Features
- Assign users to roles.
- Define permissions for each role.
- Check user access permissions.
- Grant or deny access.
- Display roles and permissions.

## How to Run

Compile the program:

```bash
javac -d out src/RBACSystem.java
```

Run the program:

```bash
java -cp out RBACSystem
```

## Testing
The program tests different users and permissions:

- Admin: Full access.
- Manager: View and Update.
- Customer: View only.

## Author
Mahmoud Shurrab

## Course
Software Security (SDEV 4303)

## Assignment
Chapter 4 – Access Control
