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

### Shield Test Warm-Up

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


