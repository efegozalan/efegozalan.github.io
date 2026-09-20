import java.util.Scanner;

public class FarmerRyan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int bag1 = input.nextInt();
        int bag2 = input.nextInt();
        int bag3 = input.nextInt();
        int bag4 = input.nextInt();
        int bag5 = input.nextInt();
        int bag6 = input.nextInt();

        int total = bag1 + bag2 + bag3 + bag4 + bag5 + bag6;

        System.out.println("Ryan has to plant " + total + " beans");
    }
}
