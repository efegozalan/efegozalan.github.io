public class Unit2P2Example
{
    public static void main(String[] args)
    {
        int score = 85;
        boolean homeworkDone = true;
        String name = new String("Efe");

        if (score >= 60 && homeworkDone)
        {
            System.out.println("You passed and finished your homework.");
        }

        if (score < 0 || score > 100)
        {
            System.out.println("Invalid score.");
        }

        if (!homeworkDone)
        {
            System.out.println("Homework is not done.");
        }

        String otherName = new String("Efe");

        if (name.equals(otherName))
        {
            System.out.println("The names are equal.");
        }

        int count = 1;

        while (count <= 5)
        {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
