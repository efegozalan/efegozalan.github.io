import java.util.Scanner;

public class GearTrain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        String line = input.nextLine();

        
        String[] gears = line.split("T");

        
        int firstGear = Integer.parseInt(gears[0]);
        int lastGear = Integer.parseInt(gears[gears.length - 1]);

        
        double revolutions = 10.0 * firstGear / lastGear;

        
        revolutions = Math.round(revolutions * 100.0) / 100.0;

        
        if (revolutions == (int) revolutions)
        {
            System.out.println((int) revolutions);
        }
        else
        {
            System.out.println(revolutions);
        }

        
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
