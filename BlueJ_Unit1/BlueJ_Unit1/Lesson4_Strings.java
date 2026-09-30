/**
 * AP CSA Unit 1 - Lesson 4: String Manipulation
 * Topic 1.15
 *
 * String methods in the AP Java Quick Reference:
 *   length(), substring(from, to), substring(from), indexOf(str),
 *   equals(other), compareTo(other), split(del)
 *
 * Remember: indexes start at 0, and substring(from, to) does NOT include `to`.
 */
public class Lesson4_Strings
{
    /**
     * Returns the initials of a person.
     * Example: initials("Ada", "Lovelace") returns "AL"
     */
    public static String initials(String first, String last)
    {
        return first.substring(0, 1) + last.substring(0, 1);  // TODO: replace this line
    }

    /**
     * Returns the last character of s as a String. Assume s is not empty.
     * Example: lastChar("Java") returns "a"
     */
    public static String lastChar(String s)
    {
        return s.substring(s.length() - 1);  // TODO: replace this line
    }

    /**
     * Returns the first half of s. If the length is odd, the middle
     * character belongs to the second half.
     * Example: firstHalf("abcdef") returns "abc", firstHalf("abcde") returns "ab"
     */
    public static String firstHalf(String s)
    {
        return s.substring(0, s.length() / 2);  // TODO: replace this line
    }

    /**
     * Returns s with its first and last characters swapped.
     * Assume s.length() >= 2.
     * Example: swapEnds("coding") returns "godinc"
     */
    public static String swapEnds(String s)
    {
        return s.substring(s.length() - 1) +
               s.substring(1, s.length() - 1) +
               s.substring(0, 1);  // TODO: replace this line
    }

    /**
     * Returns the part of an email address before the "@".
     * Example: userName("ada@school.org") returns "ada"
     */
    public static String userName(String email)
    {
        return email.substring(0, email.indexOf("@"));  // TODO: replace this line
    }

    /**
     * Returns the domain of an email address (the part after the "@").
     * Example: domain("ada@school.org") returns "school.org"
     */
    public static String domain(String email)
    {
        return email.substring(email.indexOf("@") + 1);  // TODO: replace this line
    }

    /**
     * Returns s with the FIRST occurrence of `target` removed.
     * Assume target appears in s.
     * Example: removeFirst("banana", "an") returns "bana"
     */
    public static String removeFirst(String s, String target)
    {
        int index = s.indexOf(target);

        return s.substring(0, index) +
               s.substring(index + target.length());  // TODO: replace this line
    }

    /**
     * Returns true if a and b contain exactly the same characters.
     * Do NOT use == to compare Strings!
     */
    public static boolean sameText(String a, String b)
    {
        return a.equals(b);  // TODO: replace this line
    }

    public static void main(String[] args)
    {
        String word = "COMPUTER";
        System.out.println(word.length());           // prediction: 8
        System.out.println(word.substring(3));       // prediction: PUTER
        System.out.println(word.substring(2, 5));    // prediction: MPU
        System.out.println(word.indexOf("PUT"));     // prediction: 3
        System.out.println(word.indexOf("Z"));       // prediction: -1
        System.out.println("apple".compareTo("banana") < 0);   // prediction: true

        // What happens here? Uncomment, run, and read the error message.
        // System.out.println(word.substring(9));
    }
}
