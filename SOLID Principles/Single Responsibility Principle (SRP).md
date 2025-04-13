# SRP
The **Single Responsibility Principle (SRP)** is one of the SOLID principles of object-oriented design. It states that **a class should have only one reason to change**, meaning it should have only one responsibility or job. This makes classes easier to maintain, test, and extend.


### Key Idea
If a class handles multiple responsibilities (e.g., business logic, data persistence, and UI rendering), changes to one responsibility might break others. SRP encourages separating concerns into distinct classes.


### Example in Java

#### Bad Example (Violating SRP)
Suppose we have an Employee class that handles:

1. Storing employee details (name, ID, salary).
2. Calculating the employee’s bonus.
3. Generating a report for the employee.



```java

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Responsibility 1: Manage employee data
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Responsibility 2: Calculate bonus
    public double calculateBonus() {
        // Simple bonus: 10% of salary
        return salary * 0.10;
    }

    // Responsibility 3: Generate report
    public String generateReport() {
        return "Employee Report:\n" +
               "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Salary: $" + salary + "\n" +
               "Bonus: $" + calculateBonus();
    }
}

```



## Benefits of SRP

- **Maintainability**: Each class is focused, so changes to one responsibility don’t affect others.
- **Testability**: Smaller, single-purpose classes are easier to test. For example, you can test `BookPersistence` without worrying about printing logic.
- **Reusability**: The `BookPrinter` or `BookPersistence` classes can be reused for other types of books or objects.
- **Flexibility**: You can swap out `BookPersistence` for a `DatabasePersistence` class without touching `Book` or `BookPrinter`.

## When to Apply SRP

- If a class is doing too much (e.g., mixing data management with I/O operations), consider splitting it.
- Be cautious not to over-engineer. If responsibilities are tightly related and unlikely to change independently, they might belong together.


