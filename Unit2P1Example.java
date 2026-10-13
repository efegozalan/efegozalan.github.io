import java.util.Scanner;

public class Unit2P1Example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your score:");
        int score = input.nextInt();

        boolean oldEnough = age >= 15;
        boolean passed = score >= 60;

        if (oldEnough)
        {
            if (passed)
            {
                System.out.println("You can join the activity.");
            }
            else
            {
                System.out.println("Your score is too low.");
            }
        }
        else
        {
            System.out.println("You are too young.");
        }

        if (score >= 90)
        {
            System.out.println("Grade: A");
        }
        else if (score >= 80)
        {
            System.out.println("Grade: B");
        }
        else if (score >= 70)
        {
            System.out.println("Grade: C");
        }
        else if (score >= 60)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}
