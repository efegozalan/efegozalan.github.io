import java.util.Scanner;

public class FabLabFilament {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String record = input.nextLine();

         String material = record.substring(0, 3);

         int spool1 = Integer.parseInt(record.substring(4, 7));
         int spool2 = Integer.parseInt(record.substring(8, 11));
         int spool3 = Integer.parseInt(record.substring(12, 15));
         int spool4 = Integer.parseInt(record.substring(16, 19));
         int spool5 = Integer.parseInt(record.substring(20, 23));
         int spool6 = Integer.parseInt(record.substring(24, 27));

         int total = spool1 + spool2 + spool3 + spool4 + spool5 + spool6;
         double average = (double) total / 6;

         System.out.println("Material: " + material);
         System.out.println("Total filament: " + total + " grams");
         System.out.println("Average per spool: " + average + " grams");
    }
}
