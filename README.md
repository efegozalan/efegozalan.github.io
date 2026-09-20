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
- ChatGPT - used for checking explanations and organizing the portfolio entry
