# Types of APIs

APIs can be categorized based on **access level**, **usage**, or **communication style**.

---

## 1. Based on **Access Level** (Who can use the API?)

### **Open (Public) APIs**
- Available to everyone on the internet
- Usually free or require simple registration
- **Example**: OpenWeatherMap API, GitHub Public API

### **Partner APIs**
- Shared only with specific partners/businesses
- Require API keys, agreements, or contracts
- **Example**: A payment gateway API shared with trusted e-commerce partners

### **Internal (Private) APIs**
- Used only within a company or organization
- Helps integrate internal systems and services
- Not exposed to the public

---

## 2. Based on **Purpose or Usage**

### **Web APIs**
- Accessed over HTTP/HTTPS
- Used for building web and mobile apps
- **Examples**:
  - REST APIs
  - GraphQL APIs
  - SOAP APIs

### **Library APIs**
- Part of a software development kit (SDK)
- Used within a programming language to simplify tasks
- **Example**: Java Collections API, NumPy in Python

### **Operating System APIs**
- Allow software to interact with the OS
- **Example**: Windows API, Android API

### **Hardware APIs**
- Interface with hardware components
- **Example**: Camera API, GPS API on smartphones

---

## 3. Based on **Communication Style / Architecture**

### **REST (Representational State Transfer)**
- Most popular web API type
- Uses HTTP methods (GET, POST, PUT, DELETE)
- Lightweight, stateless, and easy to use
- **Example**: `/api/books/1`

### **GraphQL**
- Client specifies what data it needs
- Reduces over-fetching and under-fetching
- Flexible, modern alternative to REST

### **SOAP (Simple Object Access Protocol)**
- Uses XML and strict rules
- Enterprise-grade, secure
- Common in banking or legacy systems

### **gRPC (Google Remote Procedure Call)**
- High-performance, binary protocol
- Uses Protocol Buffers (protobuf)
- Good for microservices and real-time systems

---

## Summary Table

| Type         | Description                              | Example                      |
|--------------|------------------------------------------|------------------------------|
| **Public API**   | Available to anyone                      | GitHub API                   |
| **Private API**  | Used inside an organization              | Internal HR or billing API   |
| **Partner API**  | Shared with partners                     | Stripe or PayPal integrations|
| **REST**         | Lightweight, uses HTTP                   | `/api/users`                 |
| **GraphQL**      | Client-defined queries                   | `query { user { name } }`    |
| **SOAP**         | XML-based, strict                        | Used in banking systems      |
| **gRPC**         | Binary, fast, for microservices          | Backend service-to-service   |
