# efegozalan.github.io
# Computer Science Portfolio
Welcome to my Computer Science website!
This website will include my class notes, Java code, exercises, and projects throughout the year.
## My Work
---

# R_U1_P1 RUNESTONE

**Date: September 20, 2026**


#### Topics
Introduction to Algorithms, Variables and Data Types, Expressions and Output

#### Class Notes

In this assignment, I learned the basic structure of Java programs and how Java code is compiled and executed. An algorithm is a step-by-step process used to solve a problem. Java programs usually contain a class and a `main` method, which is where the program begins.

I also learned about variables and data types. An `int` stores whole numbers, a `double` stores decimal numbers, a `boolean` stores `true` or `false`, and a `String` stores text. Variables must be declared with a data type before they are used.

Another important topic was expressions and operators. Java can use operators such as `+`, `-`, `*`, `/`, and `%`. When two integers are divided, Java uses integer division and removes the decimal part. The `%` operator gives the remainder after division.

I also learned the difference between syntax errors and run-time errors. Syntax errors happen when the Java rules are not followed, such as missing a semicolon or using the wrong capitalization. Run-time errors happen while the program is running, such as dividing an integer by zero.

#### Java Code Example - Pay Calculator

[View R_U1_P1 RUNESTONE Code](R_U1_P1%20RUNESTONE)

```java
public class Challenge1_3_Pay_Calculator
{
    public static void main(String[] args)
    {
        // Pay for 4 hours at 10 dollars an hour
        System.out.println("Pay for 4 hours of work at 10 dollars an hour");
        System.out.println(4 * 10);

        // Number of hours worked if pay is 120 dollars and rate is 15 dollars per hour
        System.out.println("Number of hours worked for pay 120 dollars & rate 15 dollars");
        System.out.println(120 / 15);

        // Pay for 12 hours at 7.50 dollars per hour
        System.out.println("Pay for 12 hours of work at 7.50 dollars an hour");
        System.out.println(12 * 7.50);

        // Integer division
        System.out.println("Number of int hours worked for pay 100 dollars & rate 9 dollars per hour");
        System.out.println(100 / 9);

        // Remainder
        System.out.println("The remainder of 100 dollars divided by 9 dollars per hour");
        System.out.println(100 % 9);
    }
}
```


#### Code Explanation

This program uses arithmetic operators to calculate pay and working hours. Multiplication is used to calculate total pay, division is used to calculate the number of hours worked, and the remainder operator `%` is used to find the amount left over after integer division.

#### Sample Output

```text
Pay for 4 hours of work at 10 dollars an hour
40
Number of hours worked for pay 120 dollars & rate 15 dollars
8
Pay for 12 hours of work at 7.50 dollars an hour
90.0
Number of int hours worked for pay 100 dollars & rate 9 dollars per hour
11
The remainder of 100 dollars divided by 9 dollars per hour
1
```

#### Reflection

In this assignment, I learned how Java programs are structured and how variables, data types, and arithmetic operators work. One challenge I had was understanding why integer division does not give a decimal answer. I learned that when both numbers are integers, Java removes the decimal part. I also practiced finding and fixing syntax errors, such as missing semicolons, incorrect capitalization, and missing quotation marks. Debugging these errors helped me understand Java syntax better.

#### Sources and Tools

- CSAwesome / Runestone Academy - Unit 1 lessons and activities
- Java
- ChatGPT - used for organizing the portfolio entry. ( only things that I didn't know about github)



---

# R_U1_P2 RUNESTONE

**Date: September 20, 2026**


#### Topics
Assignment and Input, Casting and Ranges of Values, Compound Assignment Operators, APIs and Libraries, Documentation with Comments and Preconditions

#### Class Notes

In this assignment, I learned more about how variables can change while a Java program is running. An assignment statement uses the `=` operator to store a value in a variable. The value on the right side is calculated first and then stored in the variable on the left side. I also learned how temporary variables can be used to swap the values of two variables.

I learned about type casting and the difference between integer and decimal calculations. Casting with `(double)` can be used to make an expression produce a decimal result. Casting a `double` to an `int` removes the decimal part. I also learned that Java `int` values have a limited range and that going outside this range can cause integer overflow.

Another topic was compound assignment operators. Operators such as `+=`, `-=`, `*=`, `/=`, and `%=` are shorter ways to update variables. I also learned that `++` increases a variable by 1 and `--` decreases it by 1.

I learned how APIs and libraries allow programmers to use code that has already been written. A class is a main building block in Java, attributes store information about an object, and methods describe behaviors that an object can perform. For example, the Turtle library has methods such as `forward()`, `turnRight()`, and `turnLeft()`.

Finally, I learned how comments help explain code. Java uses `//` for single-line comments, `/* */` for multi-line comments, and `/** */` for documentation comments. I also learned about preconditions and postconditions. A precondition describes what must be true before a method runs, while a postcondition describes what should be true after the method finishes.

#### Java Code Example - Average of Three Grades

[View R_U1_P2 RUNESTONE Code](R_U1_P2%20RUNESTONE)

```java
public class AverageThreeGrades
{
    public static void main(String[] args)
    {
        // Three integer grades
        int grade1 = 90;
        int grade2 = 100;
        int grade3 = 94;

        // Add the grades together
        int sum = grade1 + grade2 + grade3;

        // Cast sum to double so the average keeps its decimal part
        double average = (double) sum / 3;

        // Print the result
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + average);
    }
}
```

#### Code Explanation

This program stores three grades as integer variables and adds them together. It then uses `(double)` casting before dividing the sum by 3. This is important because dividing two integers would use integer division and remove the decimal part. The program then prints each grade and the calculated average.

#### Sample Output

```text
Grade 1: 90
Grade 2: 100
Grade 3: 94
Average: 94.66666666666667
```

#### Reflection

In this assignment, I learned how assignment statements, casting, compound operators, APIs, libraries, and comments work in Java. One challenge I had was understanding why division sometimes did not give a decimal answer. I learned that when both values are integers, Java uses integer division. I solved this by casting one value to a `double` before dividing.

I also learned that small changes in code can affect the data type and result of an expression. Practicing compound operators and tracing variable values helped me understand how values change while a program runs. Learning about APIs, methods, attributes, preconditions, and comments also helped me understand how larger Java programs can be organized and documented.

#### Sources and Tools

- CSAwesome / Runestone Academy - Unit 1 lessons and activities
- Java
- ChatGPT - used for organizing the portfolio entry. ( only things that I didn't know about github)




---

# R_U1_P3 RUNESTONE

**Date: September 20, 2026**

## What I Learned

In this Runestone assignment, I learned about methods, method calls, method signatures, parameters, and arguments in Java.

A method is a named block of code that performs a specific task. Methods are useful because they allow programmers to organize programs into smaller parts and avoid repeating the same code many times.

I also learned about procedural abstraction. Procedural abstraction means that a programmer can use a method by knowing what it does without needing to know exactly how the method works internally.

A method is executed when it is called. When Java reaches a method call, it temporarily moves to that method, runs the statements inside it, and then returns to the point where the method was called.

For example:

```java
public static void sayHello()
{
    System.out.println("Hello!");
}
```

The method can be called using:

```java
sayHello();
```

## Method Signatures

A method signature identifies a method by its name and its parameter types.

For example:

```java
public static void greet(String name)
```

The method name is `greet` and its parameter type is `String`.

Java can use method signatures to determine which method should run.

Methods can also be overloaded. Method overloading means having multiple methods with the same name but different parameter lists.

For example:

```java
public static void printMessage(String message)
{
    System.out.println(message);
}

public static void printMessage(int number)
{
    System.out.println(number);
}
```

These methods have the same name but different parameter types.

## Parameters and Arguments

A parameter is a variable written in the method definition.

For example:

```java
public static void animalSound(String animal)
```

Here, `animal` is a parameter.

An argument is the actual value given to the method when the method is called.

For example:

```java
animalSound("cow");
```

Here, `"cow"` is the argument.

Java uses call by value, which means that the value of an argument is copied into the parameter.

## Using Methods to Reduce Repeated Code

One important idea I learned was that methods can reduce repeated code.

Instead of writing the same code several times, I can create one method and call it whenever I need it.

For example:

```java
public static void chorus()
{
    System.out.println("E-I-E-I-O");
}
```

Then I can use:

```java
chorus();
```

multiple times instead of rewriting the same `System.out.println()` statement.

## Java Code Example

The following program uses methods, parameters, and arguments to print different animal sounds.

```java
public class AnimalSounds
{
    // Prints the introduction of the song
    public static void intro()
    {
        System.out.println("Old MacDonald had a farm");
        chorus();
    }

    // Prints the repeated chorus
    public static void chorus()
    {
        System.out.println("E-I-E-I-O");
    }

    // Uses parameters so the same method can work
    // with different animals and sounds
    public static void verse(String animal, String sound)
    {
        System.out.println("And on this farm, they had a " + animal);
        chorus();

        System.out.println("With a " + sound + " " + sound + " here");
        System.out.println("And a " + sound + " " + sound + " there");
    }

    public static void main(String[] args)
    {
        intro();

        verse("cow", "moo");

        verse("duck", "quack");

        verse("goose", "honk");
    }
}
```

### What the Code Does

This program separates different parts of the program into methods.

The `intro()` method prints the beginning of the song.

The `chorus()` method prints the repeated chorus.

The `verse()` method has two parameters: `animal` and `sound`. This allows the same method to be reused for different animals instead of writing a completely new method each time.

For example:

```java
verse("cow", "moo");
```

passes `"cow"` and `"moo"` as arguments.

## Sample Output

```text
Old MacDonald had a farm
E-I-E-I-O
And on this farm, they had a cow
E-I-E-I-O
With a moo moo here
And a moo moo there
And on this farm, they had a duck
E-I-E-I-O
With a quack quack here
And a quack quack there
And on this farm, they had a goose
E-I-E-I-O
With a honk honk here
And a honk honk there
```
---

# FarmerRyan.java

**Date: September 20, 2026**

## Reflection

In this assignment, I learned how methods help organize Java programs and reduce repeated code. I also learned the difference between parameters and arguments and how values are passed into methods.

At first, one challenge was understanding the difference between a parameter and an argument. I solved this by remembering that a parameter is written when the method is created, while an argument is the actual value used when the method is called.

I also learned that using methods makes programs easier to read, understand, and modify. Instead of repeating similar code, I can create one reusable method and give it different arguments.


### Farmer Ryan

In this program, I used `Scanner` to read the number of beans in six different bags. Then I added all six values together and printed the total number of beans Ryan needs to plant.

[View FarmerRyan.java](FarmerRyan.java)

#### Sample Input

241 675 897 12 4354 7625

# GearTrain.java

**Date: September 20, 2026**


### Get It Into Gear

In this program, I used a `String` to read a gear train and separated the gears using `split()`. I used the number of teeth on the first and last gears to calculate how many revolutions the last gear makes. I also used the number of gears to determine whether the last gear turns clockwise or anti-clockwise.

[View GearTrain.java](GearTrain.java)

#### Sample Input

```text
12T3T12T6T5T
```

#### Sample Output

```text
24
C
```

#### Test Input

```text
10T5T15T4T
```

#### Test Output

```text
25
A
```

---

### Shield Test 

**Date: September 21, 2026**

In this activity, I practiced finding and fixing common Java errors. I worked with variables, casting, integer division and the modulo operator.
The program includes examples of using `(int)` and `(double)` casting, `%` for remainders, `Math.abs()`, `Math.pow()`, and `Math.random()`.

[View ShieldTest_WarmUp.java](ShieldTest_WarmUp.java)

#### Sample Output


=== SHIELD TEST INITIATED ===

[STEP 1] Charging energy...
Energy Level: 100
Voltage: 12

[STEP 2] Calculating efficiency...
Efficiency (Expected 12.5): 12.5
Leftover Energy (Expected 2): 2

[STEP 3] Mathematical verifications...
Deviation: 8.5
Target Power: 9.0
Random Code: 0-9

=== SHIELD TEST SUCCESSFUL! ===
```
---
## Galactic Cargo Station Sabotage

**Date: September 21, 2026**

In this assignment, I debugged a Java program called SpaceStation. The original program contained 32 errors. I fixed problems involving variables, data types, printing, math operations, casting, overflow, and the Math class.

[View SpaceStation.java](SpaceStation.java)
```
---

### Online Diner

**Date: September 21, 2026**

In this program, I made a simple restaurant ordering system. I used `Scanner` to ask the user how many burgers, fries, and drinks they want.The program stores the amount of food and the prices. Then it calculates the total number of items and the total price of the order.

[View OnlineDiner.java](OnlineDiner.java)

---
# CodeHS 1.10 

**Date:** September 23, 2026

## Main Ideas
I learned how to create and call class methods in Java. I also learned about parameters, arguments, return values, and calling methods from another class.


---


# CodeHS 1.11 – Math Class

**Date:** September 23, 2026

## Main Ideas
I learned how to use Java's Math class for calculations such as powers, square roots, absolute values, and random numbers.

--- 
## R_U1_P4 RUNESTONE

**Date: September 27, 2026**

### Topics
- Calling Class Methods
- Using the Math Class

### Main Ideas

In this assignment, I learned how methods can return values and how those values can be used in a program.

A `void` method does not return a value, while a non-void method returns a value such as an `int` or `double`.

I also learned how to use the Java Math class. Some important methods are:

- `Math.abs()` - finds the absolute value
- `Math.sqrt()` - finds the square root
- `Math.pow()` - raises a number to a power
- `Math.random()` - generates a random number

### Code Example

[View MathExample.java](MathExample.java)

This program uses a method called `square` that takes a number and returns its square. It also uses different methods from the Math class.

### Sample Output

```text
Square: 25
Absolute value: 4
Square root: 3.0
Power: 9.0
```

### Reflection

I learned how methods can return values and how to use those returned values in my code.

At first, understanding the difference between void and non-void methods was a little confusing. I learned that a non-void method uses `return` to send a value back.

I also learned that the Math class makes calculations easier with methods like `Math.sqrt()`, `Math.pow()`, and `Math.random()`.


--- 
## R_U1_P5 RUNESTONE

**Date: September 27, 2026**

### Topics
- Objects and Classes
- Attributes and Behaviors
- Constructors
- Creating Objects
- Instance Methods
- Method Calls

### Main Ideas
In this Runestone assignment, I learned that a class is like a blueprint and an object is an instance of a class.

Objects can have attributes, which store information, and methods, which describe what the object can do.

I also learned how constructors are used with the `new` keyword to create objects.

Instance methods are called using the object name and the dot operator.

### Java Example

[View ObjectExample.java](ObjectExample.java)

```java
ObjectExample student = new ObjectExample("Alex", 16);
student.printInfo();
```

### Sample Output

```text
Name: Alex
Age: 16
```

### Reflection
I learned how classes, objects, constructors, and instance methods work together. The most important thing I learned was how to create an object and then call its methods.

---

## CodeHS 1.12 - Objects: Instances of Classes

**Date: September 27, 2026**

### Main Ideas
- A class is a blueprint used to create objects.
- An object is an instance of a class.
- Objects can have different attribute values.
- Attributes describe an object.
- Methods describe what an object can do.
- Object variables store references to objects in memory.
- Subclasses can inherit attributes and methods from a superclass.

### Example
```java
Rectangle rect1 = new Rectangle(5, 8, "red");
Rectangle rect2 = new Rectangle(2, 10, "blue");
Rectangle rect3 = new Rectangle(10, 3, "violet");

System.out.println(rect1);
System.out.println(rect2);
System.out.println(rect3);

```
--- 
## CodeHS 1.13 — Object Creation and Storage (Instantiation)

**Date: September 27, 2026**

### Main Ideas
In this lesson, I learned how constructors are used to create objects in Java. The constructor has the same name as the class, and the arguments have to match the parameters in the correct order and data type.

Objects are created using `new`.

Example:

```java
Student alan = new Student("Alan", "Turing", 11);
```
---

# CodeHS 1.14 - Calling Instance Methods

**Date: September 27, 2026**

## What I Learned

In this lesson, I learned how to call instance methods on objects in Java.

- Instance methods are called using an object name.
- The dot operator (`.`) is used to call methods.
- Methods can take arguments inside parentheses.
- Some methods change an object's attributes.
- Some methods return values that can be stored or printed.
- Methods can be overloaded, meaning methods can have the same name but different parameters.
- I also practiced creating objects and using their methods to change their state.

## Example

```java
Balloon balloon1 = new Balloon(10.0, "red");

balloon1.inflate(10);
balloon1.changeColor("blue");

System.out.println(balloon1);
```
---
## CodeHS 1.15 – Strings

### Main Ideas
In this section, I learned how to work with Strings in Java. I practiced string concatenation and methods such as `length()`, `substring()`, `indexOf()`, `equals()`, and `compareTo()`.

### What I Learned
- How to combine Strings using `+` and `+=`
- How to find the length of a String
- How to take parts of a String using `substring()`
- How to find text using `indexOf()`
- How to compare Strings using `equals()` and `compareTo()`
- Strings are immutable, so String methods do not change the original String

### CodeHS Activities
- Museum Inventory
- Madlib Generator
- Bookstore Receipts
- String Methods Exploration 1
- String Methods Exploration 2
- Hidden Message
- Name Tag Generator
- Word Games

### Reflection
I learned how Java can manipulate and compare text using String methods. The most challenging part was understanding substring indexes, but practicing with different examples helped me understand how the start and end indexes work.

---

# BlueJ – AP CSA Unit 1

In this unit, I practiced the main Java concepts from AP CSA Unit 1 using BlueJ. These lessons helped me review variables, casting, Math methods, Strings, and objects.

## Lesson 1 – Variables, Data Types, and Expressions

**Topics:** Variables, data types, integer division, remainder, expressions, and compound assignment.

I practiced using arithmetic operators and learned the difference between integer and decimal division. I also used compound assignment operators such as `+=`, `-=`, `*=`, `/=`, and `%=`.

THE LINK FOR IT IS BELOW!

### Reflection
This lesson helped me understand how Java performs calculations with different data types. One challenge was remembering that dividing two integers gives an integer result.

---

## Lesson 2 – Casting and Ranges of Variables

**Topics:** Casting, truncation, rounding, integer overflow, and floating-point values.

I learned how to convert between `int` and `double` values using casting. I also practiced rounding numbers using casting and learned about `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, and overflow.

THE LINK FOR IT IS BELOW!

### Reflection
I learned that casting a double to an int removes the decimal part instead of rounding it. I also learned why integer overflow can produce unexpected results.

---

## Lesson 3 – Math Class and Static Methods

**Topics:** `Math.sqrt()`, `Math.pow()`, `Math.abs()`, `Math.PI`, `Math.random()`, and static methods.

I practiced using Java's Math class to calculate distances, areas, compound interest, and random numbers. I also created methods that called other methods.

THE LINK FOR IT IS BELOW!

### Reflection
This lesson helped me understand how built-in Math methods can make calculations easier. The random number formulas were challenging at first, especially finding the correct minimum and maximum values.

---

## Lesson 4 – String Manipulation

**Topics:** `length()`, `substring()`, `indexOf()`, `equals()`, and `compareTo()`.

I practiced extracting and changing parts of Strings. I created methods for initials, email usernames and domains, swapping characters, and comparing Strings.

THE LINK FOR IT IS BELOW!

### Reflection
I became more comfortable using String indexes and `substring()`. The most important thing I learned was that String indexes start at 0 and the ending index of `substring()` is not included.

---

## Lesson 5 – Objects, Constructors, and Instance Methods

**Topics:** Objects, constructors, instance methods, references, aliasing, and `null`.

I practiced creating `BankAccount` objects and calling methods such as `deposit()`, `withdraw()`, and `getBalance()`. I also learned that two variables can refer to the same object.

THE LINK FOR IT IS BELOW!

### Reflection
This lesson helped me understand the difference between an object and a reference variable. I also learned that changing an object through one reference affects every variable that refers to that same object.

LINKS FOR ALL 5 LESSONS:

[https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson1_Variables.java](https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson1_Variables.java)

[https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson2_Casting.java](https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson2_Casting.java)

[https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson3_Math.java](https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson3_Math.java)

[https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson4_Strings.java](https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson4_Strings.java)

[https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson5_Objects.java](https://efegozalan.github.io/BlueJ_Unit1/BlueJ_Unit1/Lesson5_Objects.java)


--- 

---

## FabLab Filament Record

In this activity, I worked with one String that included a material code and six spool amounts.

### Main Ideas
- Using `Scanner` to get input
- Using `substring()` to get parts of a String
- Using `Integer.parseInt()` to change String values into integers
- Finding the total amount
- Finding the average using casting

### What I Did
I separated the material code and each spool amount from the record. Then I changed the spool values into integers, added them together, and calculated the average.

### Reflection
This activity helped me understand substring and Integer.parseInt() better. I also practiced using casting so the average could be a decimal value.

### Code

[https://efegozalan.github.io/FabLabFilament.java](https://efegozalan.github.io/FabLabFilament.java)

---

## Robot Build Instructions

In this activity, I worked with Strings to create and organize robot building instructions.

### Main Ideas
- Using Strings in Java
- Combining text with concatenation
- Working with different pieces of information
- Printing clear instructions

### What I Did
I created instructions for building a robot by combining different String values. I practiced organizing text and printing the final result in a clear format.

### Reflection
This activity helped me practice working with Strings and combining text in Java. It also helped me understand how to organize output so it is easier to read.

### Code

[https://efegozalan.github.io/RobotBuildInstructions.java](https://efegozalan.github.io/RobotBuildInstructions.java)


--- 
# R_U1_P6 RUNESTONE

## Strings

In this section, I learned how to use String methods in Java.

### Main Ideas
- length() finds the number of characters
- substring() gets part of a String
- indexOf() finds the position of text
- equals() compares Strings
- compareTo() compares Strings alphabetically
- Strings are immutable

### Coding Challenge – Pig Latin
I used substring() to move the first letter to the end and add "ay".

### Reflection
This section helped me understand String indexes and String methods better.

### Code
[https://efegozalan.github.io/PigLatin.java](https://efegozalan.github.io/PigLatin.java)

---

# CodeHS 2.1 – Algorithms with Selection and Repetition

In this section, I learned how algorithms use sequencing, selection, and repetition.

### Main Ideas
- Sequencing means doing steps in a specific order
- Selection means making decisions using conditions
- Repetition means repeating steps until a condition is met
- The order of steps is important for getting the correct result

### Activities
I analyzed a morning jog algorithm, created a daily life algorithm, made a flowchart, and analyzed a guessing game.

### Flowchart
https://canva.link/k9ap37eudj4i2i2

### Reflection
This section helped me understand how decisions and repeated actions are used inside algorithms.

---

# CodeHS 2.2 – Boolean Expressions

In this section, I learned how boolean expressions work in Java and how relational operators return `true` or `false`.

### Main Ideas
- Boolean variables store `true` or `false`
- Relational operators include `>`, `<`, `>=`, `<=`, `==`, and `!=`
- Boolean methods can return the result of a comparison
- `==` compares values for primitive types
- For objects, `==` compares references

### Activities
I practiced predicting boolean expressions, debugging relational operators, checking goals, returning booleans from methods, and using boolean methods in a Triple-Double program.

### Reflection
This section helped me understand how comparisons are used to make decisions in Java. I also learned how boolean methods can return `true` or `false` directly.

---

# CodeHS 2.3 – If Statements

In this section, I learned how `if` and `if-else` statements are used to make decisions in Java.

### Main Ideas
- `if` runs code when a condition is true
- `else` runs when the condition is false
- `if-else` helps choose between two different actions
- Relational operators are used inside conditions

### Activities
I worked with temperature checks, debugging if statements, running speed, checking squares, adding tips, and drink orders.

### Reflection
This section helped me understand how Java chooses what code to run based on conditions.

---

# BlueJ – Undo/Redo Text Editor

In this task, I created a simple text editor that supports write, undo, and redo commands.

### Main Ideas
- Using `if` and `else if`
- Comparing Strings with `equals()`
- Using `substring()` and `indexOf()`
- Storing previous text versions for undo and redo
- Clearing redo history after a new write command
- Bonus: keeping only the last 3 undo versions

### Reflection
This task helped me understand how Strings and conditions can be used together to control a program. The hardest part was keeping track of the undo and redo versions.

### Example Input
```text
W hello
W world
U
R
```

### Example Output

Text: [hello]
Text: [hello world]
Text: [hello]
Text: [hello world]

### Code
[https://efegozalan.github.io/Project1undoredo.java](https://efegozalan.github.io/Project1undoredo.java)

---

# BlueJ – Emergency Room Triage Queue

In this project, I made a simple emergency room priority queue that can hold up to 3 patients.

### Main Ideas
- Using `if`, `else if`, and nested `if` statements
- Using `equals()` to compare names
- Using `compareTo()` when two patients have the same priority
- Keeping the queue sorted from highest to lowest priority
- Calling the first patient in the queue
- Transferring the lowest ranked patient if the queue is full
- Bonus: updating a patient's priority if the same name is added again

### Example Input
```text
A Can 2
A Mehmet 2
A Yigit 5
S
A Gunes 2
C
A Can 4.
```
### Example Output

Can added.
Mehmet added.
Yigit added.
1. Yigit (5) 2. Can (2) 3. Mehmet (2)
Mehmet transferred to another hospital. Gunes added.
Yigit called in.
Can updated.

### Reflection
This project helped me understand how a priority queue works. I also learned how compareTo() can be used to decide the order when two patients have the same priority.

### Code

[https://efegozalan.github.io/Project2TriageQueue.java](https://efegozalan.github.io/Project2TriageQueue.java)


---

# CodeHS 2.4 – Nested If Statements

In this section, I learned how nested `if` statements and `if-else-if` statements work.

### Main Ideas
- Using `if`, `else if`, and `else`
- Using nested `if` statements
- Checking ranges with comparison operators
- Making one decision inside another decision
- Making code shorter by grouping similar conditions

### Activities
- Salmon Spawn
- Smoothie Order
- Food Order
- Roller Coaster
- Temperature Classifier
- Theater Discounts

### Example
In the roller coaster activity, the program first checks the user's height. If the user is tall enough, it then checks the user's age.

### Reflection
This section helped me understand how a program can make multiple decisions. I also learned that nested `if` statements are useful when one condition depends on another condition.

---

# CodeHS 2.5 – Compound Boolean Expressions

In this section, I learned how to combine boolean expressions using `&&`, `||`, and `!`.

### Main Ideas
- `&&` means AND
- `||` means OR
- `!` means NOT
- Using compound conditions can make code shorter
- Compound expressions can replace some nested `if` statements
- The order of conditions is important

### Activities
- Debugging Booleans
- City Bus Discounts
- Converting Pseudocode
- Compound Salmon Spawn
- Find the Median

### Example
```java
if (month >= 8 && month <= 11)
{
    System.out.println("Spawning season");
}
```
### Reflection
This section helped me understand how multiple conditions can be checked in one if statement. I also learned that compound boolean expressions can make code easier to read and shorter.

---

# CodeHS 2.6 – Comparing Boolean Expressions

In this section, I learned how to compare boolean expressions and objects in Java.

### Main Ideas
- `==` compares object references
- `.equals()` compares object values/content
- Strings should usually be compared with `.equals()`
- Truth tables can show if two boolean expressions are equivalent
- De Morgan’s Law can simplify boolean expressions

### Activities
- Truth Tables
- Comparing Rectangles
- Comparing Strings
- Determine Classmates
- Simplifying Boolean Expressions

### Example
```java
if (one == two)
{
    System.out.println("Same student");
}
else if (one.getTeacher().equals(two.getTeacher()))
{
    System.out.println("Same class");
}
```
### Reflection
I learned that == and .equals() are not the same. == checks if two variables point to the same object, while .equals() can check if their values are the same.

---

# CodeHS 2.7 – While Loops

In this section, I learned how to use `while` loops to repeat code while a condition is true.

### Main Ideas
- `while` loops repeat code
- The condition must eventually become false
- `break` can stop a loop
- `return` can exit a method
- Infinite loops happen when the condition never changes

### Activities
- Lighting
- Making Taffy
- Vending Machine
- Infinite Loops
- Guess Mt. Everest's Height

### Example
```java
while (guess != EVEREST_HEIGHT)
{
    System.out.println("Guess the height:");
    guess = input.nextInt();
}
```
### Reflection
I learned how while loops can repeat actions until a condition is met. I also learned how to avoid infinite loops by changing variables or using break and return.


--- 

# Digit Detective Programming Project

In this project, I practiced using `while` loops and digit operations without using String or Math.

### What I Did
- Checked if digits are increasing from left to right
- Added digits until only one digit was left
- Removed even digits from a number
- Checked if a number is an Armstrong number

### Main Ideas
I used `% 10` to get the last digit and `/ 10` to remove the last digit. I also used while loops to go through the digits.

### Reflection
This project helped me understand how to work with each digit of a number using loops. The hardest part was keeping the digits in the correct order.

### Code
[DigitDetective.java](https://efegozalan.github.io/DigitDetective.java)


### BLUE J VERSION OF IT:

[BlueJ - Number Analysis](BlueJ_NumberAnalysis.java)

---

# CodeHS 2.8 – For Loops

In this section, I learned how to use `for` loops when I know how many times I want code to repeat.

### Main Ideas
- for loop structure
- counting up and down
- changing the loop by 1, 2, or other values
- using loops with methods
- fixing loop errors

### Activities
- For Loop Variations
- Print the Odds
- Debugging: Prime Numbers
- Multiplication Table
- Shopping Cart

### Example
```java
for (int i = 1; i <= 12; i++)
{
    System.out.println(num + " * " + i + " = " + (num * i));
}
```
### Reflection

I learned that for loops are useful when the number of repetitions is known. I also practiced changing the start, condition, and update parts of the loop.

# CodeHS 2.9 – Loop Algorithms

In this section, I practiced using loops to solve problems with numbers and user input.

### Main Ideas
- Finding averages
- Using `%` to find remainders
- Finding maximum and minimum values
- Working with digits
- Counting frequencies
- Using random numbers with loops

### Activities
- Running Average
- Factors
- Donation Collection
- Max and Min Values
- Digits
- Dice Frequencies

### Example
```java
while (num > 0)
{
    int digit = num % 10;
    System.out.println(digit);
    num /= 10;
}

```

### Reflection

I learned how loops can be used in different algorithms. I also understood % 10 and / 10 better when working with digits.

--- 

# Unit 2 – Runestone – R_U2_P1

In this part of Unit 2, I learned how Java programs make decisions using algorithms, boolean expressions, and conditional statements.

### Main Ideas
- Algorithms can use sequencing, selection, and repetition.
- Boolean expressions return `true` or `false`.
- Comparison operators include `>`, `<`, `>=`, `<=`, `==`, and `!=`.
- `%` can be used to check divisibility and even or odd numbers.
- `if` statements run code when a condition is true.
- `if-else` statements choose between two results.
- `else if` can be used when there are multiple possible conditions.
- Nested `if` statements allow one decision to happen inside another decision.
- `.equals()` should be used when comparing String values.

### Example
This example combines boolean expressions, `if`, `else if`, and nested `if` statements..

[https://efegozalan.github.io/Unit2P1Example.java](https://efegozalan.github.io/Unit2P1Example.java)

### Reflection
This part helped me understand how Java makes decisions based on different conditions. I learned how boolean expressions work and how `if`, `else if`, `else`, and nested `if` statements can be used together. I also got better at deciding which type of condition is best for a problem.

---
# Watch - Share - Unit 1

These are my notes from the College Board's Unit 1 videos.

---

## Unit 1: Preview

### Main Ideas
- Unit 1 introduces the basic structure of Java programs.
- Variables are used to store information.
- Java uses different data types such as `int`, `double`, `boolean`, and `String`.
- Expressions are used to calculate and change values.
- Methods help organize code.
- Objects are created from classes.

### What I Learned
I learned that Unit 1 gives the basic foundation for Java. Variables, methods, and objects are important because they are used in almost every program.

---

## Unit 1: Focus on Foundations of Programming (Topics 1.1-1.4)

### Main Ideas
- Java programs are organized inside classes and methods.
- The `main` method is where a program usually starts.
- Variables store values.
- Common primitive data types are `int`, `double`, and `boolean`.
- Assignment uses one equal sign `=`.
- Arithmetic operators include `+`, `-`, `*`, `/`, and `%`.
- Integer division removes the decimal part.
- `%` gives the remainder after division.

### What I Learned
I learned how variables, data types, and arithmetic expressions work in Java. I also learned the difference between normal division and integer division.

---

## Unit 1: Focus on Programming Building Blocks (Topics 1.5-1.9)

### Main Ideas
- Expressions can combine variables, numbers, and operators.
- Java follows order of operations.
- Casting can change one numeric type into another.
- Casting a `double` to an `int` removes the decimal part.
- The `Math` class has useful methods such as `Math.sqrt()`, `Math.pow()`, and `Math.abs()`.
- `Math.random()` can generate random values.
- Strings are used to store text.
- Common String methods include `length()`, `substring()`, and `indexOf()`.

### What I Learned
I learned how casting, Math methods, and String methods work. I also learned how changing the data type can change the result of an expression.

---

## Unit 1: Focus on Objects and Classes (Topics 1.10-1.15)

### Main Ideas
- A class is a blueprint for creating objects.
- An object is an instance of a class.
- Constructors are used to create objects.
- Objects can have attributes and behaviors.
- Instance methods are called using an object.
- Different objects from the same class can store different values.
- Object references store a reference to an object.
- Two variables can sometimes refer to the same object.
- `null` means a reference is not pointing to an object.

### What I Learned
I learned the difference between a class and an object. I also learned how constructors create objects and how instance methods are used with objects.

---

## Unit 1: Concepts in Context (Skill 1)

### Main Ideas
- It is important to understand what a program should do before writing code.
- Variable names should clearly describe the value they store.
- Reading code carefully helps us understand what each statement does.
- We can trace variable values step by step.
- Comments can make code easier to understand.

### What I Learned
I learned that planning and reading code carefully can make programming easier. Tracing variables also helps me understand how a program works.

---

## Unit 1: Concepts in Context (Skill 2)

### Main Ideas
- Programs should be tested with different values.
- We can predict the output before running a program.
- Testing helps find mistakes and logic errors.
- Small changes in expressions can change the final result.
- Expected output can be compared with actual output.

### What I Learned
I learned that testing is an important part of programming. Predicting the output first helps me check if I understand the code correctly.

---

## Unit 1: Concepts in Context (Skills 3 & 4)

### Main Ideas
- Methods help organize programs.
- Methods reduce repeated code.
- Parameters allow methods to work with different values.
- Arguments are the actual values passed into methods.
- Methods can return values.
- Debugging helps find and fix errors.
- Programs can be improved by testing and revising code.

### What I Learned
I learned why methods are useful and how parameters and return values make methods more flexible. I also learned that debugging is an important part of writing good code.

---

## Unit 1: Recap

### Main Ideas
- Variables store data.
- Data types control what kind of values can be stored.
- Expressions perform calculations.
- Casting changes numeric data types.
- The Math class provides useful mathematical methods.
- Strings store and manipulate text.
- Classes are used to create objects.
- Constructors initialize objects.
- Instance methods perform actions on objects.
- Methods help organize and reuse code.

### Reflection
Unit 1 helped me understand the main building blocks of Java. The topics I found most useful were variables, Math methods, Strings, and objects. Some topics like casting and object references were confusing at first, but practicing with examples made them easier to understand.


---
# Unit 2 - Runestone - R_U2_P2

In this part of Unit 2, I learned how to use compound Boolean expressions, compare expressions and objects, and use while loops.

### Main Ideas
- `&&` means AND. Both conditions must be true.
- `||` means OR. At least one condition must be true.
- `!` means NOT and reverses a Boolean value.
- Compound Boolean expressions can combine multiple conditions.
- Short-circuit evaluation can stop Java from checking the second part of a condition.
- Two Boolean expressions are equivalent if they always give the same result.
- De Morgan's Laws can be used to rewrite Boolean expressions.
- `==` compares object references.
- `.equals()` is used to compare the contents of Strings and other objects.
- `null` means that an object reference does not currently point to an object.
- A `while` loop repeats code while a Boolean condition is true.
- A loop usually has three parts: initialize, test, and update.
- Infinite loops happen when the loop condition never becomes false.
- Off-by-one errors happen when a loop runs one time too many or one time too few.
- While loops can also be controlled by user input.

### Example
This example combines compound Boolean expressions, String comparison, and a while loop.

[https://efegozalan.github.io/Unit2P2Example.java](https://efegozalan.github.io/Unit2P2Example.java)

### Reflection
This part helped me understand how conditions can become more complex by using `&&`, `||`, and `!`. I also learned the difference between `==` and `.equals()` when comparing objects. While loops helped me understand how programs can repeat actions until a condition becomes false. The most important thing for me was remembering to update the loop variable so the loop does''t run forever.


---
# Unit 2 - Runestone - R_U2_P2

In this part of Unit 2, I learned how to use compound Boolean expressions, compare values and objects, and use while loops.

### Main Ideas
- `&&` means AND, so both conditions must be true.
- `||` means OR, so at least one condition must be true.
- `!` reverses a Boolean value.
- Short-circuit evaluation can stop Java from checking the second part of a condition.
- `.equals()` is used to compare String contents.
- `==` checks if object references point to the same object.
- `null` means that a reference does not point to an object.
- A `while` loop repeats code while a condition is true.
- A loop usually needs three steps: initialize, test, and update.
- If the loop variable is not updated correctly, the loop can become infinite.
- Nested while loops can be used to create repeated patterns.

### Example
This example combines String methods, Boolean expressions, comparisons, and while loops.

[https://efegozalan.github.io/WordWhile.java](https://efegozalan.github.io/WordWhile.java)

### Reflection
This part helped me understand how Boolean expressions and while loops work together. I learned how to use `&&`, `||`, and `!` to create more detailed conditions. I also practiced comparing Strings and learned that `.equals()` should be used for String content.

One small mistake I made was forgetting that the loop variable has to change inside a `while` loop. If I do not update it correctly, the condition can stay true forever and create an infinite loop. Fixing this helped me understand why initialization, condition checking, and updating are all important parts of a loop.

In my `WordWhile.java` example, I used while loops to work through each letter in a name, count vowels and consonants, compare name lengths, change uppercase and lowercase letters, and create repeated letter patterns. This helped me understand how loops can be used with Strings instead of only numbers.

---

# Unit 2 - Runestone - R_U2_P3

In this part of Unit 2, I learned how to use `for` loops to repeat code a specific number of times.

### Main Ideas
- A `for` loop has three parts: initialization, condition, and update.
- The loop control variable keeps track of how many times the loop runs.
- `i++` increases the loop variable by 1.
- A loop can also count backwards using `i--`.
- The update can change by more than 1, such as `i += 2` or `i -= 2`.
- `for` loops are useful when the number of repetitions is known.
- A `for` loop can be rewritten as a `while` loop.
- Loops can reduce repeated code and make programs shorter and easier to read.
- For drawing polygons, the turtle can repeat the same forward and turn commands.
- The turning angle for a regular polygon can be found using `360 / numberOfSides`.

### Example
This example uses `for` loops to draw a square, triangle, pentagon, and other polygons with a Turtle.

[https://efegozalan.github.io/TurtleDrawShapes.java](https://efegozalan.github.io/TurtleDrawShapes.java)

### Reflection
This section helped me understand when a `for` loop is better than a `while` loop. I learned that `for` loops are useful when I already know how many times I want something to repeat.

One thing I had to be careful about was changing all three parts of the loop when counting backwards or counting by different amounts. I also learned that the turn angles for a shape have to add up to 360 degrees. Using `360 / n` made it possible to create one method that can draw different polygons instead of writing a separate method for every shape.

---
# Loop Comparison by For Loops 

### Loop Comparison Example
[LoopComparison.java](https://efegozalan.github.io/LoopComparison.java)

### Reflection
In this activity, I practiced rewriting loops using `for` loops. I learned that `for` loops are useful when I already know how many times the loop should run. I also learned that the initialization, condition, and update are all written in one line, which makes the loop shorter and easier to read.
---
