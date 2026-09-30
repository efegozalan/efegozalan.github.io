/**
 * AP CSA Unit 1 - Lesson 1: Variables, Data Types, Expressions, Compound Assignment
 * Topics 1.2 - 1.6
 *
 * Complete every method marked TODO.
 * Then run Unit1Tester.main() to check your work.
 */
public class Lesson1_Variables
{
    /**
     * Returns how many whole minutes are in totalSeconds.
     * Example: minutesPart(135) returns 2
     */
    public static int minutesPart(int totalSeconds)
    {
        return totalSeconds / 60;  // TODO: replace this line
    }

    /**
     * Returns the seconds left over after removing whole minutes.
     * Example: secondsPart(135) returns 15
     * Hint: use the % (remainder) operator.
     */
    public static int secondsPart(int totalSeconds)
    {
        return totalSeconds % 60;  // TODO: replace this line
    }

    /**
     * Returns the average of three int values as a double.
     * Example: average(1, 2, 2) returns 1.6666...
     * Careful: integer division!
     */
    public static double average(int a, int b, int c)
    {
        return (a + b + c) / 3.0;  // TODO: replace this line
    }

    /**
     * Returns the last digit of a non-negative integer.
     * Example: lastDigit(4739) returns 9
     */
    public static int lastDigit(int n)
    {
        return n % 10;  // TODO: replace this line
    }

    /**
     * Returns the tens digit of a non-negative integer.
     * Example: tensDigit(4739) returns 3
     */
    public static int tensDigit(int n)
    {
        return (n / 10) % 10;  // TODO: replace this line
    }

    /**
     * Converts Celsius to Fahrenheit:  F = C * 9 / 5 + 32
     * Example: celsiusToFahrenheit(100.0) returns 212.0
     */
    public static double celsiusToFahrenheit(double c)
    {
        return c * 9 / 5 + 32;  // TODO: replace this line
    }

    /**
     * Starting from x, apply these steps IN ORDER using compound assignment
     * operators (+=, -=, *=, /=, %=) and return the result:
     *   1) add 5   2) multiply by 3   3) subtract 4   4) divide by 2   5) remainder by 7
     * Example: applySteps(1) -> 6 -> 18 -> 14 -> 7 -> 0, returns 0
     */
    public static int applySteps(int x)
    {
        x += 5;
        x *= 3;
        x -= 4;
        x /= 2;
        x %= 7;

        return x;  // TODO: replace this line
    }

    /**
     * PREDICT FIRST! Write down what you think each line prints,
     * then right-click the class in BlueJ and run main to check.
     */
    public static void main(String[] args)
    {
        System.out.println(7 / 2);          // prediction: 3
        System.out.println(7 / 2.0);        // prediction: 3.5
        System.out.println(7 % 2);          // prediction: 1
        System.out.println(2 + 3 * 4);      // prediction: 14
        System.out.println("A" + 1 + 2);    // prediction: A12
        System.out.println(1 + 2 + "A");    // prediction: 3A

        int count = 10;
        count++;
        count *= 2;
        count -= 3;
        System.out.println(count);          // prediction: 19
    }
}
