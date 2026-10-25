public class ReverseString
{
    public static void main(String[] args)
    {
        String s = "Hello";
        String reversed = "";

        for (int i = 0; i < s.length(); i++)
        {
            String letter = s.substring(i, i + 1);
            reversed = letter + reversed;
        }

        System.out.println(s + " reversed is " + reversed);
    }
}
