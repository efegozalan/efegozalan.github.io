import java.util.Scanner;

public class GearTrain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Read the gear train
        String line = input.nextLine();

        // Separate the gears using T
        String[] gears = line.split("T");

        // Get the first and last gear
        int firstGear = Integer.parseInt(gears[0]);
        int lastGear = Integer.parseInt(gears[gears.length - 1]);

        // Calculate the revolutions of the last gear
        double revolutions = 10.0 * firstGear / lastGear;

        // Round to the nearest hundredth
        revolutions = Math.round(revolutions * 100.0) / 100.0;

        // Print the number of revolutions
        if (revolutions == (int) revolutions)
        {
            System.out.println((int) revolutions);
        }
        else
        {
            System.out.println(revolutions);
        }

        // Find the direction
        if (gears.length % 2 == 1)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("A");
        }
    }
}
