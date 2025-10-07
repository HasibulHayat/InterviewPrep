# Design Pattern
<br>


## Definition

- A `proven, reusable solution` to a common software design problem.  
- They act like `blueprints`, not exact code, that guide how to structure classes, objects, and interactions to solve specific challenges.

**In Other Words** 
- Design patterns are `reusable templates` for solving common software design problems.  
- They represent `best practices`, evolved through `trial and error` by experienced developers.

---

## Things to Remember When Applying Design Patterns

- **Not a Silver Bullet**  
  Design patterns are tools, not rules. Know your project well and **only use patterns when they clearly solve a problem**.

- **Don't Overdo It**  
  _`Projects are not for patterns; patterns are for projects.`_  
  Overusing patterns can `overcomplicate` your design. Apply them `only when necessary`.

- **Use in Combination**  
  Sometimes, `multiple design patterns` may work together to solve a more complex design problem.

- **Evaluate Trade-offs**  
  Every pattern has `pros and cons`. Use a pattern only when its `benefits outweigh the drawbacks`.

---

## Types of Design Patterns

- **Creational Patterns**
- **Structural Patterns**
- **Behavioral Patterns**

---

### 1. Creational Patterns

- Handle object creation in a flexible and reusable way.
- Avoid tight coupling between code and object creation.
- **Examples**:
  - **Singleton** – Only one instance allowed.
  - **Factory Method** – Delegate object creation to subclasses.
  - **Abstract Factory** – Create families of related objects.
  - **Builder** – Construct complex objects step-by-step.
  - **Prototype** – Clone existing objects.

---

### 2. Structural Patterns

- Focus on how classes and objects are composed to form larger structures.
- Help ensure flexibility and maintainability.
- **Examples**:
  - **Adapter** – Convert one interface to another.
  - **Decorator** – Add behavior to objects dynamically.
  - **Proxy** – Control access to an object.
  - **Composite** – Treat individual objects and compositions uniformly.
  - **Facade** – Simplify a complex subsystem with a unified interface.
  - **Bridge** – Separate abstraction from implementation.
  - **Flyweight** – Optimize memory by sharing common data.

---

### 3. Behavioral Patterns

- Focus on communication between objects and responsibilities.
- Define how objects interact and respond to each other.
- **Examples**:
  - **Strategy** – Choose an algorithm at runtime.
  - **Observer** – Notify dependent objects of state changes.
  - **Command** – Encapsulate requests as objects.
  - **Template Method** – Base class defines an algorithm, subclasses customize steps.
  - **State** – Change behavior based on internal state.
  - **Chain of Responsibility** – Pass requests through a chain of handlers.
  - **Mediator** – Centralize complex communication between objects.

---


