import java.util.Scanner;

public class WordFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your middle name: ");
        String midName = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.println();

        // Change uppercase and lowercase
        String changedName = "";

        for (int i = 0; i < name.length(); i++) {
            String letter = name.substring(i, i + 1);

            if (letter.equals(letter.toUpperCase())) {
                changedName += letter.toLowerCase();
            }
            else {
                changedName += letter.toUpperCase();
            }
        }

        System.out.println("Changed name: " + changedName);

        System.out.println();

        // Compare name and surname lengths
        if (name.length() > surname.length()) {
            System.out.println("Name is longer.");
        }
        else if (surname.length() > name.length()) {
            System.out.println("Surname is longer.");
        }
        else {
            System.out.println("Name and surname are equal in length.");
        }

        System.out.println();

        // Count vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for (int j = 0; j < name.length(); j++) {
            String letter = name.substring(j, j + 1).toLowerCase();

            if (letter.equals("a") || letter.equals("e") ||
                letter.equals("i") || letter.equals("o") ||
                letter.equals("u")) {
                vowels++;
            }
            else if (!letter.equals(" ")) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        if (vowels > consonants) {
            System.out.println("There are more vowels.");
        }
        else if (consonants > vowels) {
            System.out.println("There are more consonants.");
        }
        else {
            System.out.println("Vowels and consonants are equal.");
        }

        System.out.println();

        // First name pattern
        for (int a = 0; a < name.length(); a++) {

            for (int count = a + 1; count > 0; count--) {
                System.out.print(name.substring(a, a + 1).toUpperCase());
            }

            System.out.println();
        }

        System.out.println();

        // Last name pattern
        for (int b = 0; b < surname.length(); b++) {

            for (int count = surname.length() - b; count > 0; count--) {
                System.out.print(surname.substring(b, b + 1).toUpperCase());
            }

            System.out.println();
        }

        System.out.println();

        // Middle name pattern
        System.out.println("Print middle name? true/false");
        boolean secondName = input.nextBoolean();

        if (secondName) {

            for (int c = 0; c < midName.length(); c++) {

                for (int count = c + 1; count > 0; count--) {
                    System.out.print(midName.substring(c, c + 1).toUpperCase());
                }

                System.out.println();
            }
        }

        input.close();
    }
}
