public class Magic8Ball
{
    public static void printRandomResponse()
    {
        int num = (int)(Math.random() * 8) + 1;

        if (num == 1)
        {
            System.out.println("Yes!");
        }
        else if (num == 2)
        {
            System.out.println("No!");
        }
        else if (num == 3)
        {
            System.out.println("Maybe.");
        }
        else if (num == 4)
        {
            System.out.println("Definitely!");
        }
        else if (num == 5)
        {
            System.out.println("Ask again later.");
        }
        else if (num == 6)
        {
            System.out.println("Probably not.");
        }
        else if (num == 7)
        {
            System.out.println("Of course!");
        }
        else
        {
            System.out.println("I don't think so.");
        }
    }

    public static void lucky()
    {
        int coin = (int)(Math.random() * 2);

        if (coin == 0)
        {
            System.out.println("Lucky!");
        }
        else
        {
            System.out.println("No Luck!");
        }
    }

    public static void main(String[] args)
    {
        String question = "Will it rain tomorrow?";
        System.out.println(question);

        printRandomResponse();
        lucky();
    }
}
