import java.util.Scanner;

public class TypingMishaps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String redo = "";

        // Exactly 4 key presses
        for (int i = 0; i < 4; i++)
        {
            String key = input.nextLine();

            // Undo
            if (key.equals("-"))
            {
                if (word.length() > 0)
                {
                    redo = word.substring(word.length() - 1);
                    word = word.substring(0, word.length() - 1);
                }
            }

            // Redo
            else if (key.equals("+"))
            {
                if (!redo.equals(""))
                {
                    word += redo;
                    redo = "";
                }
            }

            // Type a new letter
            else
            {
                word += key;
                redo = "";
            }
        }

        if (word.equals(""))
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(word);
        }

        input.close();
    }
}
