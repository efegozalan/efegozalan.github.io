/**
 * AP CSA Unit 1 - Lesson 3: Calling Class (static) Methods and the Math Class
 * Topics 1.9 - 1.11
 *
 * Math methods in the AP Java Quick Reference:
 *   Math.abs(int), Math.abs(double), Math.pow(double, double),
 *   Math.sqrt(double), Math.random()
 */
public class Lesson3_Math
{
    /**
     * Returns the length of the hypotenuse of a right triangle.
     * Example: hypotenuse(3, 4) returns 5.0
     */
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));  // TODO: replace this line
    }

    /**
     * Returns the distance between points (x1, y1) and (x2, y2).
     * Example: distance(1, 1, 4, 5) returns 5.0
     * Challenge: call your hypotenuse method!
     */
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return hypotenuse(x2 - x1, y2 - y1);  // TODO: replace this line
    }

    /**
     * Returns how far apart a and b are (always non-negative).
     * Example: absDifference(3, 10) returns 7, absDifference(10, 3) returns 7
     */
    public static int absDifference(int a, int b)
    {
        return Math.abs(a - b);  // TODO: replace this line
    }

    /**
     * Returns the area of a circle with radius r.
     * Use Math.PI.
     */
    public static double circleArea(double r)
    {
        return Math.PI * Math.pow(r, 2);  // TODO: replace this line
    }

    /**
     * Returns a random int between min and max, INCLUSIVE.
     * Example: randomInRange(1, 6) simulates a die roll (1, 2, 3, 4, 5, or 6).
     * Formula: (int) (Math.random() * (number of values)) + min
     */
    public static int randomInRange(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1)) + min;  // TODO: replace this line
    }

    /**
     * Returns the value of an investment after `years` years of
     * compound interest:  amount = principal * (1 + rate)^years
     * Example: compoundInterest(1000, 0.10, 2) returns 1210.0 (approximately)
     */
    public static double compoundInterest(double principal, double rate, int years)
    {
        return principal * Math.pow(1 + rate, years);  // TODO: replace this line
    }

    public static void main(String[] args)
    {
        // Roll two dice 5 times and print the totals
        for (int i = 0; i < 5; i++)
        {
            int total = randomInRange(1, 6) + randomInRange(1, 6);
            System.out.println("Roll " + (i + 1) + ": " + total);
        }

        // What range of values can each expression produce?
        // (int) (Math.random() * 10)        -> 0 to 9
        // (int) (Math.random() * 10) + 5    -> 5 to 14
        // (int) (Math.random() * 21) - 10   -> -10 to 10
    }
}
