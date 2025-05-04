# 📘 Introduction to APIs

## 🔹 What is an API?

**API** stands for **Application Programming Interface**. It is a set of rules and protocols that allow one software application to interact with another.

Think of an API like a **waiter in a restaurant**:
- You (the client) tell the waiter what you want.
- The waiter (API) takes your request to the kitchen (server).
- The kitchen prepares the food (response), and the waiter brings it back to you.

---

## 🔹 Types of APIs

1. **Web APIs** (most common today)
   - Accessible over the web using **HTTP/HTTPS**
   - Example: REST APIs, GraphQL APIs

2. **Library APIs**
   - Functions provided by programming libraries (e.g., `Math.sqrt()` in Java)

3. **OS APIs**
   - Allow apps to interact with operating system functions

---

## 🔹 Web APIs

Let’s focus on **Web APIs**, especially **REST APIs**, which are most commonly used.

### REST API Concepts

| Term | Meaning |
|------|---------|
| **Client** | The application making the request (e.g., your frontend) |
| **Server** | The system that handles the request and returns data |
| **Endpoint** | A specific URL that performs a certain task |
| **HTTP Methods** | Describe the type of operation |

### Common HTTP Methods:

| Method | Use |
|--------|-----|
| `GET` | Read data (e.g., get all books) |
| `POST` | Create new data (e.g., add a new book) |
| `PUT` | Update existing data (e.g., change book info) |
| `DELETE` | Remove data (e.g., delete a book) |

---

## 🔹 Example: Simple REST API

Let’s say you’re building a **Library Management System**.

| Action | Method | Endpoint | Description |
|--------|--------|----------|-------------|
| Get all books | GET | `/api/books` | Returns list of books |
| Add a book | POST | `/api/books` | Adds a new book |
| Update a book | PUT | `/api/books/1` | Updates book with ID 1 |
| Delete a book | DELETE | `/api/books/1` | Deletes book with ID 1 |

---

## 🔹 How APIs Communicate

Communication usually happens in **JSON** format.

### Example Request (POST):
```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
