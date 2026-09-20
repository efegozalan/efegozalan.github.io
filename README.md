# efegozalan.github.io
# Computer Science Portfolio
Welcome to my Computer Science website!
This website will include my class notes, Java code, exercises, and projects throughout the year.
## My Work
### R_U1_P1 RUNESTONE

#### Topics
Introduction to Algorithms, Variables and Data Types, Expressions and Output

#### Class Notes

In this assignment, I learned the basic structure of Java programs and how Java code is compiled and executed. An algorithm is a step-by-step process used to solve a problem. Java programs usually contain a class and a `main` method, which is where the program begins.

I also learned about variables and data types. An `int` stores whole numbers, a `double` stores decimal numbers, a `boolean` stores `true` or `false`, and a `String` stores text. Variables must be declared with a data type before they are used.

Another important topic was expressions and operators. Java can use operators such as `+`, `-`, `*`, `/`, and `%`. When two integers are divided, Java uses integer division and removes the decimal part. The `%` operator gives the remainder after division.

I also learned the difference between syntax errors and run-time errors. Syntax errors happen when the Java rules are not followed, such as missing a semicolon or using the wrong capitalization. Run-time errors happen while the program is running, such as dividing an integer by zero.

#### Java Code Example - Pay Calculator

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



### R_U1_P2 RUNESTONE

#### Topics
Assignment and Input, Casting and Ranges of Values, Compound Assignment Operators, APIs and Libraries, Documentation with Comments and Preconditions

#### Class Notes

In this assignment, I learned more about how variables can change while a Java program is running. An assignment statement uses the `=` operator to store a value in a variable. The value on the right side is calculated first and then stored in the variable on the left side. I also learned how temporary variables can be used to swap the values of two variables.

I learned about type casting and the difference between integer and decimal calculations. Casting with `(double)` can be used to make an expression produce a decimal result. Casting a `double` to an `int` removes the decimal part. I also learned that Java `int` values have a limited range and that going outside this range can cause integer overflow.

Another topic was compound assignment operators. Operators such as `+=`, `-=`, `*=`, `/=`, and `%=` are shorter ways to update variables. I also learned that `++` increases a variable by 1 and `--` decreases it by 1.

I learned how APIs and libraries allow programmers to use code that has already been written. A class is a main building block in Java, attributes store information about an object, and methods describe behaviors that an object can perform. For example, the Turtle library has methods such as `forward()`, `turnRight()`, and `turnLeft()`.

Finally, I learned how comments help explain code. Java uses `//` for single-line comments, `/* */` for multi-line comments, and `/** */` for documentation comments. I also learned about preconditions and postconditions. A precondition describes what must be true before a method runs, while a postcondition describes what should be true after the method finishes.

#### Java Code Example - Average of Three Grades

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
