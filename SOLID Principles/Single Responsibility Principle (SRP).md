
The **Single Responsibility Principle (SRP)** is one of the SOLID principles of object-oriented design. It states that **a class should have only one reason to change**, meaning it should have only one responsibility or job. This makes classes easier to maintain, test, and extend.

### Key Idea
If a class handles multiple responsibilities (e.g., business logic, data persistence, and UI rendering), changes to one responsibility might break others. SRP encourages separating concerns into distinct classes.

### Example in Java

#### Bad Example (Violating SRP)
Suppose we have a `Book` class that handles:
1. Storing book details (title, author).
2. Printing book details.
3. Saving book details to a file.

```java
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Responsibility 1: Manage book data
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Responsibility 2: Print book details
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    // Responsibility 3: Save book to file
    public void saveToFile() {
        try {
            // Simulate saving to a file
            System.out.println("Saving book: " + title + " to file.");
            // Code to write to file...
        } catch (Exception e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }
}
