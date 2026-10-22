import java.util.Scanner;

public class LazySusan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String dishes = input.nextLine();
        int n = dishes.length();
        int pos = 0;

        // Two rotations
        for (int i = 0; i < 2; i++)
        {
            String direction = input.next();
            long k = input.nextLong();

            k = k % n;

            if (direction.equals("C"))
            {
                pos = (int)((pos + k) % n);
            }
            else
            {
                pos = (int)((pos - k + n) % n);
            }
        }

        System.out.println(dishes.substring(pos, pos + 1));

        input.close();
    }
}
