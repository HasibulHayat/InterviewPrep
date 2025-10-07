# Factory Method Pattern

## What is the Factory Method Pattern?

- A **Creational Design Pattern** that defines an interface for creating objects but allows subclasses to decide which class to instantiate.
- It encapsulates object creation logic, promoting loose coupling by delegating instantiation to subclasses.
- The client code interacts with the factory and created objects through interfaces.

---

## Why Use the Factory Method Pattern?

- **Encapsulates Creation Logic**: Hides object instantiation from the client.
- **Promotes Flexibility**: Easily add new object types without modifying client code.
- **Reduces Coupling**: Client depends on interfaces, not concrete classes.
- **Supports Open/Closed Principle**: Extend the system without altering existing code.

---

## Real-World Examples

- **Messaging Systems**: Creating Email, SMS, or Push notifications dynamically.
- **Document Generators**: Factories for creating PDF or Word documents.
- **Game Development**: Factories for spawning different enemy types.

---

## Notes

- Part of the Gang of Four's *Design Patterns* book.
- Focuses on creating a single type of object (unlike Abstract Factory, which handles families of objects).
- Ideal for simple, extensible systems where creation logic needs to be centralized.
