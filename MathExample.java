public class MathExample
{
    public static int square(int number)
    {
        return number * number;
    }

    public static void main(String[] args)
    {
        int answer = square(5);

        System.out.println("Square: " + answer);
        System.out.println("Absolute value: " + Math.abs(-4));
        System.out.println("Square root: " + Math.sqrt(9));
        System.out.println("Power: " + Math.pow(3, 2));
    }
}
