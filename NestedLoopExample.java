public class NestedLoopExample
{
    public static void main(String[] args)
    {
        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
