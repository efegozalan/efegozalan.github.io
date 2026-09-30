/**
 * AP CSA Unit 1 - Lesson 2: Casting and Ranges of Variables
 * Topic 1.5
 */
public class Lesson2_Casting
{
    /**
     * Returns a / b as an exact decimal value (NOT integer division).
     * Example: exactDivide(7, 2) returns 3.5
     */
    public static double exactDivide(int a, int b)
    {
        return (double)a/b;  
    }

    /**
     * Returns x with the decimal part cut off (truncated).
     * Example: truncate(9.99) returns 9
     */
    public static int truncate(double x)
    {
        return (int)x;  // TODO: replace this line
    }

    /**
     * Rounds a NON-NEGATIVE double to the nearest int using casting only
     * (do not use Math.round).
     * Example: roundPositive(2.5) returns 3, roundPositive(2.49) returns 2
     */
    public static int roundPositive(double x)
    {
        return (int)(x + 0.5);  // TODO: replace this line
    }

    /**
     * Rounds a NEGATIVE double to the nearest int using casting only.
     * Example: roundNegative(-2.5) returns -3, roundNegative(-2.4) returns -2
     */
    public static int roundNegative(double x)
    {
        return (int)(x - 0.5);  // TODO: replace this line
    }

    /**
     * Rounds a price to 2 decimal places (for non-negative prices).
     * Example: roundToCents(3.14159) returns 3.14, roundToCents(2.346) returns 2.35
     * Hint: multiply, round with casting, then divide.
     */
    public static double roundToCents(double price)
    {
        return (int)(price * 100 + 0.5) / 100.0;  // TODO: replace this line
    }

    /**
     * PREDICT FIRST, then run.
     */
    public static void main(String[] args)
    {
        System.out.println((int) 3.99);              // prediction: 3
        System.out.println((double) 5 / 2);          // prediction: 2.5
        System.out.println((double) (5 / 2));        // prediction: 2.0
        System.out.println((int) -3.7);              // prediction: -3

        System.out.println(Integer.MAX_VALUE);       // prediction: 2147483647
        System.out.println(Integer.MAX_VALUE + 1);   // prediction: -2147483648  (overflow!)
        System.out.println(Integer.MIN_VALUE);       // prediction: -2147483648

        System.out.println(0.1 + 0.2);               // prediction: 0.30000000000000004  (round-off error)
    }
}
