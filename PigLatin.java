import java.util.Scanner;

public class PigLatin
{
    public static String pigLatin(String word)
    {
        // İlk harfi sona atıp ay ekledim
        String pigLatin =
            word.substring(1) + word.substring(0, 1) + "ay";

        return pigLatin;
    }

    public static void main(String[] args)
    {
        // Scanner ile kelime aldım
        Scanner scan = new Scanner(System.in);

        // Girilen kelimeyi aldım
        String word = scan.nextLine();

        // Sonucu yazdırdım
        System.out.println(word + " in Pig Latin is " + pigLatin(word));

        scan.close();
    }
}
