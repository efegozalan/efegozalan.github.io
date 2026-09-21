import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double burgerPrice = 8.50;
        double friesPrice = 4.00;
        double drinkPrice = 2.50;

        System.out.println("Welcome to Digital Diner!");
        System.out.println("Burger: $8.50");
        System.out.println("Fries: $4.00");
        System.out.println("Drink: $2.50");

        System.out.print("How many burgers do you want? ");
        int burgers = input.nextInt();

        System.out.print("How many fries do you want? ");
        int fries = input.nextInt();

        System.out.print("How many drinks do you want? ");
        int drinks = input.nextInt();

        double total = burgers * burgerPrice
                     + fries * friesPrice
                     + drinks * drinkPrice;

        int totalItems = burgers + fries + drinks;

        System.out.println();
        System.out.println("Your Order");
        System.out.println("Burgers: " + burgers);
        System.out.println("Fries: " + fries);
        System.out.println("Drinks: " + drinks);
        System.out.println("Total items: " + totalItems);
        System.out.println("Total price: $" + total);

    }
}
