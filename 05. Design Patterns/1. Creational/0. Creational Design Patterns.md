# Creational Design Patterns

<br>

### What is it?

- Creational Design Patterns are design solutions that deal with `object creation` in a flexible, controlled, and reusable way.
- They hide the complex logic of object creation and provide ways to `centralize that logic`, instead of scattering it across your codebase.

---

### What is Client Code?

- Client code is the part of your application `that uses objects` — creates them and calls their methods.

<br>

---

### Without Design Pattern (Messy and Tightly Coupled)

```JAVA

Customer customer;

if (type.equals("regular")) {
    customer = new RegularCustomer();
} else if (type.equals("premium")) {
    customer = new PremiumCustomer();
} else {
    customer = new GuestCustomer();
}

customer.placeOrder();

```
<br>

- The client code is handling creation logic, which makes it : `messy, hard to maintain, difficult to scale`

---

### Why Do We Need Creational Patterns?


**In real-world apps :**

- You deal with many object types (Customer, Product, Invoice, etc.)
- Creation may depend on conditions or external settings
- Repeating creation logic everywhere leads to : `code duplication, tight coupling, harder maintenance`

---


### With Design Pattern (e.g., Factory Method)

```JAVA

Customer customer = CustomerFactory.create(type);
customer.placeOrder();

```
<br>

- Client code just asks for the object
- The creation logic is hidden inside the factory

---

### What Problem Do Creational Patterns Solve?

- `Centralize` object creation logic
- Make code more modular, clean, and maintainable
- Allow easy `extension` (add new types with minimal change)
- `Decouple` creation from usage

---

<br>

## Types of Creational Design Patterns


There are `seven` creational design patterns commonly recognized in software engineering. These patterns focus on object creation mechanisms, providing flexibility and reusability. Below is the list with brief descriptions:



1. **Singleton Pattern** - Ensures a class has only one instance and provides a global point of access to it.

2. **Factory Method Pattern** - Defines an interface for creating an object but lets subclasses decide which class to instantiate.

3. **Abstract Factory Pattern** - Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

4. **Builder Pattern** - Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

5. **Prototype Pattern** - Creates new objects by copying an existing object, known as the prototype, to avoid the overhead of creating objects from scratch.

6. **Object Pool Pattern** - Manages a pool of reusable objects to improve performance by recycling objects instead of creating and destroying them repeatedly.

7. **Dependency Injection Pattern** - Supplies an object with its dependencies from an external source rather than having the object create them itself, promoting loose coupling.

### Notes

- The first five patterns **`(Singleton, Factory Method, Abstract Factory, Builder, and Prototype)`** are from the Gang of Four's *Design Patterns* book.
- **`Object Pool and Dependency Injection`** are widely accepted as creational patterns in modern literature due to their focus on object creation and lifecycle management.
- Some sources may list only the GoF's five patterns or include additional niche patterns, but seven is the most comprehensive and commonly referenced count.

---
