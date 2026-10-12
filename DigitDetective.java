// üç tane sayı gir, min 4 max 8 hane
// sayıları alıp kaç tane tek kaç tane çift olduğunu bulmak
// tek + çift
// teklerin toplamı > 10 ise jackpot print et.

import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        int original = num;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;
        int maxDigit = 0;
        int reverse = 0;

        int previousDigit = 10;
        boolean increasing = true;
        int digitSum = 0;
        int onlyOdd = 0;
        int place = 1;
        int armstrongSum = 0;
        int digitCount = 0;

        int temp = num;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            }
            else {
                oddSum += digit;
                oddCount++;
                onlyOdd = onlyOdd + digit * place;
                place *= 10;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            if (digit >= previousDigit) {
                increasing = false;
            }
            previousDigit = digit;

            digitSum += digit;

            reverse = reverse * 10;
            reverse = reverse + digit;

            num /= 10;
        }

        int temp2 = onlyOdd;
        onlyOdd = 0;

        while (temp2 > 0) {
            onlyOdd = onlyOdd * 10 + temp2 % 10;
            temp2 /= 10;
        }

        temp = original;

        while (temp > 0) {
            int digit = temp % 10;
            armstrongSum += (int)Math.pow(digit, digitCount);
            temp /= 10;
        }

        if (oddSum > 10 && evenCount >= 2) {
            System.out.println("Jackpot!");
        }
        else {
            System.out.println("No luck");
        }

// next:  en büyük raakmı bulma, max digit olucak içnde
// verdiğin sayıdaki odd ve enevda tek mi ağır çift mi ağır onu bulucak; eşitse de balance.COUnT
//sayıyı ters çeviricez ex: 4264 , 4624. 
// palindrom 12321 mesela tersten de aynı.
        System.out.println("Max digit: " + maxDigit);

        if (evenCount > oddCount) {
            System.out.println("More even digits");
        }
        else if (oddCount > evenCount) {
            System.out.println("More odd digits");
        }
        else {
            System.out.println("Equal odd and even digits");
        }

        System.out.println("Reverse: " + reverse);

        if (original == reverse) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
// rakamlar soldan sağa artıyosa increasing yoksa hayır.
// rakamların hepsini topla tek haneye düşene kadar
//çift olanları sayıdan çıkarmak.
// sayı armstrong sayısı mı.

        if (increasing) {
            System.out.println("Increasing");
        }
        else {
            System.out.println("Not increasing");
        }

        while (digitSum >= 10) {
            int sum = 0;

            while (digitSum > 0) {
                sum += digitSum % 10;
                digitSum /= 10;
            }

            digitSum = sum;
        }

        System.out.println("Single digit sum: " + digitSum);
        System.out.println("Without even digits: " + onlyOdd);

        if (original == armstrongSum) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
