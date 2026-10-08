import java.util.Scanner;
public class Project1undoredo
{
    static String text = "";
    static String undoStack = "";
    static String redoStack = "";

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // exactly 8 command alıyoruz
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
        processCommand(sc.nextLine());
    }
     public static void processCommand(String cmd)
    {
        // UNDO
        if (cmd.equals("U"))
        {
            if (undoStack.length() == 0)
            {
                System.out.print("Nothing to undo. ");
            }
            else
            {
                // current text redo stacke gidiyor
                redoStack = text + "#" + redoStack;

                // undo stackin en üstünü alıyorum
                int i = undoStack.indexOf("#");
                text = undoStack.substring(0, i);
                undoStack = undoStack.substring(i + 1);
            }
        }
        // REDO
        else if (cmd.equals("R"))
        {
            if (redoStack.length() == 0)
            {
                System.out.print("Nothing to redo. ");
            }
            else
            {
                // current text undo stacke gidiyor
                undoStack = text + "#" + undoStack;

                // bonus: sadece 3 version tutuyor
                limitUndoStack();

                int i = redoStack.indexOf("#");
                text = redoStack.substring(0, i);
                redoStack = redoStack.substring(i + 1);
            }
        }
         else
        {
            if (cmd.length() >= 2)
            {
                if (cmd.substring(0, 2).equals("W "))
                {
                    String word = cmd.substring(2);

                    // # kullanılamaz
                    if (word.indexOf("#") != -1)
                    {
                        System.out.print("Word cannot contain #. ");
                    }
                    else
                    {
                        if (text.length() == 0)
                        {
                            // eski texti save ediyorum
                            undoStack = text + "#" + undoStack;
                            limitUndoStack();

                            text = word;

                            // yeni word gelince redo silinir
                            redoStack = "";
                        }
                        else
                        {
                            // son kelimeyi buluyorum
                            String lastWord =
                                text.substring(text.lastIndexOf(" ") + 1);

                            if (lastWord.equals(word))
                            {
                                System.out.print("Repeated word not added. ");
                            }
                            else
                            {
                                // current text undo stacke
                                undoStack = text + "#" + undoStack;
                                limitUndoStack();

                                text = text + " " + word;

                                // new action redo historyyi temizler
                                redoStack = "";
                            }
                        }
                    }
                }
                else
                {
                    System.out.print("Invalid command. ");
                }
            }
            else
            {
                System.out.print("Invalid command. ");
            }
        }

        // her command sonrası text göster
        System.out.println("Text: [" + text + "]");
    }


    // BONUS: undoStack max 3 version
    public static void limitUndoStack()
    {
        int first = undoStack.indexOf("#");

        if (first != -1)
        {
            String part2 = undoStack.substring(first + 1);
            int secondSmall = part2.indexOf("#");

            if (secondSmall != -1)
            {
                int second = first + 1 + secondSmall;

                String part3 = undoStack.substring(second + 1);
                int thirdSmall = part3.indexOf("#");

                if (thirdSmall != -1)
                {
                    int third = second + 1 + thirdSmall;

                    // 3 versiondan sonrasını siliyoruz
                    undoStack = undoStack.substring(0, third + 1);
                }
            }
        }
    }
}
