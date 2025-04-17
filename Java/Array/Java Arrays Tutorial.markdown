# Java Arrays Tutorial

This document covers the fundamentals of arrays in Java, including their declaration, usage, and common operations. It also addresses the role of the `java.util.Arrays` class and why it is used.

## 1. What Are Arrays in Java?

An **array** is a data structure in Java that holds a fixed number of elements of the same data type in contiguous memory locations. Arrays are useful for storing and manipulating collections of data.

### Key Characteristics
- **Fixed Size**: The size of an array cannot be changed after creation.
- **Same Data Type**: All elements must be of the same type (e.g., `int`, `String`).
- **Indexed**: Elements are accessed using zero-based indices (starting at `0`).
- **Reference Type**: Arrays are objects stored on the heap.

## 2. Declaring and Creating Arrays

### Declaration
```java
int[] numbers;      // Preferred style
String[] names;     // Array of strings
double[] prices;    // Array of doubles
```

### Creating an Array
Using the `new` keyword:
```java
int[] numbers = new int[5]; // Array of 5 integers, initialized to 0
```

With initial values:
```java
String[] names = {"Alice", "Bob", "Charlie"}; // Array of 3 strings
```

## 3. Accessing and Modifying Arrays

### Accessing Elements
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

### Modifying Elements
```java
numbers[1] = 25; // Changes the second element to 25
```

### Array Length
```java
System.out.println(numbers.length); // Output: 5
```

## 4. Iterating Over Arrays

### Using a For Loop
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using an Enhanced For Loop
```java
for (int num : numbers) {
    System.out.println(num);
}
```

## 5. Common Array Operations

### Initializing with Default Values
```java
int[] numbers = new int[3]; // Elements are 0, 0, 0
String[] names = new String[2]; // Elements are null, null
```

### Copying Arrays
Using a loop (manual):
```java
int[] original = {1, 2, 3};
int[] copy = new int[original.length];
for (int i = 0; i < original.length; i++) {
    copy[i] = original[i];
}
```

### Sorting Arrays (Manual Bubble Sort)
```java
int[] numbers = {5, 2, 8, 1, 9};
for (int i = 0; i < numbers.length; i++) {
    for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
```

### Searching Arrays (Manual Binary Search)
```java
int[] numbers = {1, 2, 5, 8, 9};
int key = 5;
int left = 0, right = numbers.length - 1;
int index = -1;
while (left <= right) {
    int mid = (left + right) / 2;
    if (numbers[mid] == key) {
        index = mid;
        break;
    } else if (numbers[mid] < key) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}
```

## 6. Multidimensional Arrays

### Declaring and Initializing
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Accessing Elements
```java
System.out.println(matrix[1][2]); // Output: 6
```

### Iterating
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## 7. Common Array Errors

- **ArrayIndexOutOfBoundsException**:
```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[3]); // Throws exception
```

- **NullPointerException**:
```java
int[] numbers;
System.out.println(numbers[0]); // Throws exception
```

## 8. Role of `java.util.Arrays`

### Is `java.util.Arrays` a Class?
Yes, `java.util.Arrays` is a **final class** in the `java.util` package with **static methods** for array operations. It is a utility class, not required for basic array functionality.

### Why Import `java.util.Arrays`?
You can work with arrays without importing `java.util.Arrays` for basic operations (e.g., declaring, accessing, iterating). However, `java.util.Arrays` provides convenient methods for tasks like:

- **Sorting**: `Arrays.sort(array)`
- **Converting to String**: `Arrays.toString(array)`
- **Copying**: `Arrays.copyOf(array, length)`
- **Searching**: `Arrays.binarySearch(array, key)`
- **Filling**: `Arrays.fill(array, value)`
- **Comparing**: `Arrays.equals(array1, array2)`
- **Multidimensional Arrays**: `Arrays.deepToString(array)`

### Example Using `java.util.Arrays`
```java
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers); // Sorts to {1, 2, 5, 8, 9}
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 8, 9]

        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.equals(numbers, copy)); // Output: true

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix)); // Output: [[1, 2], [3, 4]]
    }
}
```

### When to Import `java.util.Arrays`?
- **Import** if you use its utility methods to simplify tasks.
- **Skip** if you only need basic array operations or prefer custom logic.

## 9. Arrays vs. ArrayList

- **Arrays**: Fixed size, faster for simple operations, less flexible.
- **ArrayList**: Dynamic size, part of the Java Collections Framework, more flexible but slower.

**Example of ArrayList**:
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
System.out.println(list); // Output: [1, 2]
```

## 10. Best Practices

- Check array bounds to avoid `ArrayIndexOutOfBoundsException`.
- Initialize arrays to avoid `NullPointerException`.
- Use `java.util.Arrays` methods for convenience when needed.
- Consider `ArrayList` for dynamic-size collections.