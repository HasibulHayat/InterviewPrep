# SRP
<br>

The `Single Responsibility Principle (SRP)` is one of the SOLID principles of object-oriented design. It states that `a class should have only one reason to change`, meaning it should have only one responsibility or job. This makes classes easier to maintain, test, and extend. 
<br><br>

### Key Idea
If a class handles multiple responsibilities (e.g., business logic, data persistence, and UI rendering), changes to one responsibility might break others. SRP encourages separating concerns into distinct classes.
<br><br>

### Example in Java

#### Bad Example (Violating SRP)
Suppose we have an Employee class that handles:

1. Storing employee details (name, ID, salary).
2. Calculating the employee’s bonus.
3. Generating a report for the employee.

### <br>

```java

// Employee Class

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

<br><br>

## Problems with the Original Employee Class

- The `Employee` class has three responsibilities: managing employee data, calculating bonuses, and generating reports.
- If the bonus calculation logic changes (e.g., different rules for different roles), the `Employee` class must change, even though its core purpose is to represent an employee.
- If the report format changes (e.g., to JSON or PDF), the `Employee` class must be modified, which is unrelated to employee data or bonuses.
- Testing the report generation requires dealing with bonus calculation, making tests more complex.
<br><br>

## Refactored Example (Following SRP)

To adhere to the **Single Responsibility Principle (SRP)**, we’ll split the responsibilities into separate classes:

- **Employee**: Manages employee data.
- **BonusCalculator**: Calculates the employee’s bonus.
- **EmployeeReportGenerator**: Generates reports for employees.

### <br>


```java

// Responsibility 1: Manage employee data

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}


// Responsibility 2: Calculate bonus

public class BonusCalculator {
    public double calculateBonus(Employee employee) {
        // Simple bonus: 10% of salary
        return employee.getSalary() * 0.10;
    }
}


// Responsibility 3: Generate report

public class EmployeeReportGenerator {
    public String generateReport(Employee employee, BonusCalculator bonusCalculator) {
        return "Employee Report:\n" +
               "ID: " + employee.getId() + "\n" +
               "Name: " + employee.getName() + "\n" +
               "Salary: $" + employee.getSalary() + "\n" +
               "Bonus: $" + bonusCalculator.calculateBonus(employee);
    }
}
```
<br><br>

## Why This Follows SRP

- **Employee**: Only responsible for storing and providing access to employee data (name, ID, salary). It doesn’t handle bonuses or reporting.
- **BonusCalculator**: Only responsible for calculating the bonus based on employee data. If bonus rules change (e.g., different percentages for managers), only this class needs modification.
- **EmployeeReportGenerator**: Only responsible for formatting and generating reports. If the report format changes (e.g., to HTML or CSV), only this class is affected.
<br><br>

## Benefits of SRP

- **Maintainability**: Each class is focused, so changes to one responsibility don’t affect others.
- **Testability**: Smaller, single-purpose classes are easier to test. For example, you can test `BookPersistence` without worrying about printing logic.
- **Reusability**: The `BookPrinter` or `BookPersistence` classes can be reused for other types of books or objects.
- **Flexibility**: You can swap out `BookPersistence` for a `DatabasePersistence` class without touching `Book` or `BookPrinter`.
<br><br>

## When to Apply SRP

- If a class is doing too much (e.g., mixing data management with I/O operations), consider splitting it.
- Be cautious not to over-engineer. If responsibilities are tightly related and unlikely to change independently, they might belong together.


