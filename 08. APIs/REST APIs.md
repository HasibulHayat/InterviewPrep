# 📘 Detailed Guide to REST APIs

## 🔹 What is a REST API?

**REST** stands for **Representational State Transfer**. A **REST API** is an architectural style that allows different systems to communicate over **HTTP** by performing operations (like create, read, update, delete) on **resources**.

> 💡 Key idea: Everything is a **resource** (e.g., a user, a book, an order), and you interact with these resources using standard **HTTP methods**.

---

## 🔹 Key Principles of REST

1. **Statelessness**  
   - Each request must contain all the necessary information.
   - The server does not store client session info between requests.

2. **Client-Server Architecture**  
   - Client (frontend) and server (backend) are independent.

3. **Uniform Interface**  
   - A consistent way of interacting with resources (URIs, HTTP methods).

4. **Resource-Based**  
   - Everything is a resource, and each resource is accessible via a unique URI.

5. **Representation of Resources**  
   - Resources are typically represented in **JSON** or **XML**.

6. **Cacheability**  
   - Responses must define whether they can be cached.

---

## 🔹 HTTP Methods in REST

| Method  | Action         | Description                             |
|---------|----------------|-----------------------------------------|
| GET     | Read           | Fetch one or more resources             |
| POST    | Create         | Create a new resource                   |
| PUT     | Update         | Replace an existing resource entirely   |
| PATCH   | Partial Update | Update part of a resource               |
| DELETE  | Delete         | Remove a resource                       |

---

## 🔹 RESTful URI Design

- Use **nouns**, not verbs  
  ✅ `/api/books` – get all books  
  ✅ `/api/books/1` – get book with ID 1  
  ❌ `/api/getBook` – bad practice

- Use **plural nouns** for collections  
  ✅ `/users`, `/products`

- Nest resources logically  
  ✅ `/users/5/orders` – orders of user 5

---

