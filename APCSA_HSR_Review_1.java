
public class APCSA_HSR_Review_1
{
    // QUESTION 1(a) - planTrip

    public boolean planTrip()
    {
        int rain = 0;

        for (int i = 0; i < getDays(); i++)
        {
            if (getWeather(i).equals("R"))
                rain++;
        }

        return rain < getDays() * 0.3 &&
               !getWeather(0).equals("R") &&
               !getWeather(1).equals("R") &&
               !getWeather(2).equals("R");
    }

    // QUESTION 1(b) - countSunToRain

    public static int countSunToRain(String weatherString)
    {
        int count = 0;

        for (int i = 0; i < weatherString.length() - 1; i++)
        {
            if (weatherString.substring(i, i + 2).equals("RS"))
                count++;
        }

        return count;
    }

    // QUESTION 2(a), (b), (c), (d)

    public static void necklaceReview(String necklace)
    {
        // PART (a) - longestRun

        int longestRun = 1;
        int count = 1;
        int i = 1;

        while (i < necklace.length())
        {
            if (necklace.substring(i, i + 1).equals(
                necklace.substring(i - 1, i)))
                count++;
            else
                count = 0;

            longestRun = count;
            i++;
        }

        // PART (b) - isSymmetric

        boolean isSymmetric = true;
        i = 0;

        while (i < necklace.length() / 2)
        {
            if (!necklace.substring(i, i + 1).equals(
                necklace.substring(necklace.length() - 1 - i,
                                   necklace.length() - i)))
                isSymmetric = false;
            else
                isSymmetric = true;

            i++;
        }

        // PART (c) - distinctColors

        int distinctColors = 0;

        for (i = 0; i < necklace.length(); i++)
        {
            boolean found = false;

            for (int j = 0; j < i; j++)
            {
                if (necklace.substring(i, i + 1).equals(
                    necklace.substring(j, j + 1)))
                    found = true;
            }

            distinctColors++;
        }

        // PART (d) - price and label

        double price = necklace.length() * 1.25
                     + distinctColors * 0.75;

        int rounded = (int) price;

        if (isSymmetric || longestRun <= 2)
            System.out.println(rounded + " Premium");
        else
            System.out.println(rounded + " Standard");
    }

    // Forecast methods provided by the assignment
    // Placeholder implementations for this standalone file

    public int getDays()
    {
        return 7;
    }

    public String getWeather(int day)
    {
        return "S";
    }
}
