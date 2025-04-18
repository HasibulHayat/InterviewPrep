
# Understanding Liskov Substitution Principle (LSP) in SOLID

## 📜 What is LSP?
LSP stands for **Liskov Substitution Principle**.

### Simple Definition:
If class **B** is a subclass of class **A**, then we should be able to use **B** wherever **A** is expected — **without breaking the program**.

> Subclasses should behave like their parent class.

---

## 🧠 Real-Life Analogy
Imagine you have a **Bird** class with a method `fly()`. Then you create a subclass called **Penguin**. But penguins **can’t fly**! If someone tries to use a `Penguin` object expecting it to fly like a normal `Bird`, the app will break.

That’s a **violation** of LSP — because Penguin is not truly substitutable for Bird.

---

## ✅ Easy Java Example (Correct LSP)
```java
class Bird {
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }
}

class Sparrow extends Bird {
    // Inherits makeSound(), nothing breaks
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();  // OK!
        bird.makeSound();           // Outputs: Chirp chirp!
    }
}
```

---

## ❌ Bad Example (Violates LSP)
```java
class Bird {
    public void fly() {
        System.out.println("Flying in the sky!");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
```

### Problem:
```java
Bird myBird = new Ostrich();
myBird.fly();  // 💥 Boom! Runtime exception!
```

This **violates LSP**. Even though `Ostrich` is a `Bird`, it cannot behave like one fully — especially regarding flying.

---

## ✅ Fixing It: Using Interfaces for Better Abstraction
```java
abstract class Bird {
    public abstract void makeSound();
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void fly() {
        System.out.println("Flying!");
    }
}

class Ostrich extends Bird {
    public void makeSound() {
        System.out.println("Boom boom!");
    }

    // No fly() method here
}
```

Now we only give flying ability to birds **that can fly**, keeping LSP intact.
