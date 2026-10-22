public class FullDiamond
{
    public static void main(String[] args)
    {
        int count = 5;
        int n = 1;

        // Top half
        while (n <= count)
        {
            int i = 0;

            while (i < count - n)
            {
                System.out.print(" ");
                i++;
            }

            int m = 1;

            while (m <= n)
            {
                System.out.print(m);
                m++;
            }

            int k = n - 1;

            while (k >= 1)
            {
                System.out.print(k);
                k--;
            }

            System.out.println();
            n++;
        }
        //bottom halfd
        n = count - 1;

        while (n >= 1)
        {
            int i = 0;

            while (i < count - n)
            {
                System.out.print(" ");
                i++;
            }

            int m = 1;

            while (m <= n)
            {
                System.out.print(m);
                m++;
            }

            int k = n - 1;

            while (k >= 1)
            {
                System.out.print(k);
                k--;
            }

            System.out.println();
            n--;
        }
    }
}
