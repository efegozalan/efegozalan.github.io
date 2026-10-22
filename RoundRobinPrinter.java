import java.util.Scanner;

public class RoundRobinPrinter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int k = input.nextInt();

        int n = s.length();

        int[] pages = new int[n];
        int[] order = new int[100];

        // Starting documents
        for (int i = 0; i < n; i++)
        {
            pages[i] = s.charAt(i) - '0';
            order[i] = i;
        }

        int front = 0;
        int back = n;
        int turns = 0;
        String finished = "";

        // Keep printing until the line is empty
        while (front < back)
        {
            int doc = order[front];
            front++;
            turns++;

            pages[doc] -= k;

            // Document finished
            if (pages[doc] <= 0)
            {
                finished += (doc + 1);
            }
            // Put document back in line
            else
            {
                order[back] = doc;
                back++;
            }
        }

        System.out.println(finished);
        System.out.println(turns);

        input.close();
    }
}
