#   Java Programming Language
***
## Introduction
This document provides a comprehensive guide to Java programming, covering fundamental concepts to advanced topics. It is designed to help both beginners and experienced programmers understand and master Java.

## Table of Contents
1. [Introduction](#introduction)
2. [Variables](#variables)
3. [Datatypes](#datatypes)
4. [Operators](#operators)
5. [Control Flow Statements](#control-flow-statements)
6. [Methods](#methods)
7. [Object-Oriented Programming](#object-oriented-programming)
8. [Exception Handling](#exception-handling)
9. [Collections Framework](#collections-framework)
10. [Streams and File I/O](#streams-and-file-io)
11. [Multithreading and Concurrency](#multithreading-and-concurrency)
12. [Advanced Topics](#advanced-topics)

## Variables
Variables are containers for storing data values. In Java, each variable must be declared with a data type.

## Datatypes
Data types specify the type of data that can be stored in a variable. Java is a statically-typed language; all variables must be declared before they can be used. There are 8 primitive data types in Java:

1. **Boolean**  
  This has two possible values: `true` and `false`, where the default is always `false`.  
  **Example**:
  ```java
  class Main {
     public static void main(String[] args) {
        boolean name = true;
        System.out.println(name); // true
     }
  }
  ```

2. **byte**  
  This has values from `-128` to `127` (8-bit signed two's complement integer), the default is always 0.
  ```java
  class Main {
     public static void main(String[] args) {
        byte range = 122;
        System.out.println(range); // 122
     }
  }
  ```

3. **short**  
  This datatype has values from `-32768` to `32767` (16-bit signed two's complement integer), the default is always 0.
  ```java
  class Main {
     public static void main(String[] args) {
        short range = -3334;
        System.out.println(range); // -3334
     }
  }
  ```

4. **int**  
  This datatype has values from `-2^31` to `2^31 - 1` (32-bit signed two's complement integer), the default is always 0.
  ```java
  class Main {
     public static void main(String[] args) {
        int range = -450000;
        System.out.println(range);  
     }
  }
  ```

5. **long**  
  This datatype has values from `-2^63` to `2^63 - 1` (64-bit signed two's complement integer), the default is always 0.
  ```java
  class Main {
     public static void main(String[] args) {
        long range = -444450000L;
        System.out.println(range); 
     }
  }
  ```

6. **float**  
  This datatype has single precision 32-bit floating point, the default is always 0.00.
  ```java
  class Main {
     public static void main(String[] args) {
        float range = 42.45f;
        System.out.println(range);  
     }
  }
  ```

7. **double**  
  This datatype has double precision 64-bit floating point, the default is always 0.00.
  ```java
  class Main {
     public static void main(String[] args) {
        double range = -4.10;
        System.out.println(range);  
     }
  }
  ```

8. **char**  
  This datatype is a 16-bit Unicode character with minimum and maximum values of `\u0000` (default) and `\uffff`.
  ```java
  class Main {
     public static void main(String[] args) {
        char letter = '\u0051';
        System.out.println(letter);  // prints Q
     }
  }
  ```

**String**  
This is not a primitive data type; it's an object from the `java.lang.String` class.
```java
class Main {
   public static void main(String[] args) {
      String myString = "Learning Java";
      System.out.println(myString);  // prints Learning Java
   }
}
```

## Operators
Operators are special symbols that perform operations on variables and values. Java has several types of operators:

- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators**: `&&`, `||`, `!`
- **Assignment Operators**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- **Unary Operators**: `+`, `-`, `++`, `--`, `!`
- **Bitwise Operators**: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`

## Control Flow Statements
Control flow statements determine the order in which statements are executed. Java supports several control flow statements:

- **Conditional Statements**: `if`, `else if`, `else`, `switch`
- **Looping Statements**: `for`, `while`, `do-while`
- **Branching Statements**: `break`, `continue`, `return`

## Methods
Methods are blocks of code that perform a specific task. They are used to define the behavior of objects in Java.

- **Method Declaration**: `returnType methodName(parameters) { // body }`
- **Method Invocation**: `object.methodName(arguments);`

## Object-Oriented Programming
Java is an object-oriented programming (OOP) language. The four main principles of OOP are:

1. **Encapsulation**: Wrapping data and methods into a single unit (class).
2. **Inheritance**: Mechanism where one class acquires the properties and behaviors of another class.
3. **Polymorphism**: Ability of a variable, function, or object to take on multiple forms.
4. **Abstraction**: Hiding the implementation details and showing only the functionality.

## Exception Handling
Exception handling is a mechanism to handle runtime errors. Java provides five keywords for exception handling:

- **try**: Block of code to be tested for errors.
- **catch**: Block of code to handle the error.
- **finally**: Block of code that will always execute.
- **throw**: Used to throw an exception.
- **throws**: Indicates what exceptions may be thrown by a method.

## Collections Framework
The Java Collections Framework provides a set of classes and interfaces for storing and manipulating groups of data as a single unit.

- **List**: Ordered collection (e.g., `ArrayList`, `LinkedList`)
- **Set**: Unordered collection with no duplicates (e.g., `HashSet`, `TreeSet`)
- **Map**: Collection of key-value pairs (e.g., `HashMap`, `TreeMap`)
- **Queue**: Collection used to hold multiple elements prior to processing (e.g., `PriorityQueue`)

## Streams and File I/O
Java provides classes for reading and writing data to files and other input/output sources.

- **File Class**: Represents a file or directory.
- **FileReader and FileWriter**: For reading and writing text files.
- **BufferedReader and BufferedWriter**: For efficient reading and writing of text.
- **FileInputStream and FileOutputStream**: For reading and writing binary data.

## Multithreading and Concurrency
Multithreading is a Java feature that allows concurrent execution of two or more threads for maximum utilization of CPU.

- **Thread Class**: Represents a thread of execution.
- **Runnable Interface**: Should be implemented by any class whose instances are intended to be executed by a thread.
- **Synchronization**: Mechanism to control the access of multiple threads to shared resources.

## Advanced Topics
Advanced Java topics include:

- **Generics**: Enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods.
- **Lambda Expressions**: Provide a clear and concise way to represent one method interface using an expression.
- **Stream API**: Used to process collections of objects.
- **JavaFX**: Used for creating desktop applications.
- **Annotations**: Provide metadata about the program.
- **Reflection**: Allows inspection and modification of the program at runtime.
