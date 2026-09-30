/**
 * AP CSA Unit 1 - Lesson 5: Objects, Constructors, Instance Methods
 * Topics 1.12 - 1.14
 *
 * Use the provided BankAccount class. Open it and read its constructors
 * and method signatures first. (In BlueJ: right-click BankAccount ->
 * new BankAccount(...) to create objects interactively on the Object Bench!)
 */
public class Lesson5_Objects
{
    /**
     * Creates and returns a new BankAccount for the given owner,
     * with the given starting balance.
     */
    public static BankAccount openAccount(String owner, double startingBalance)
    {
        return new BankAccount(owner, startingBalance);  // TODO: replace this line
    }

    /**
     * Creates an account for "Ali" with NO starting balance (use the
     * one-parameter constructor), deposits 200, withdraws 75,
     * and returns the account.
     * The returned account should have a balance of 125.0
     */
    public static BankAccount aliAccount()
    {
        BankAccount account = new BankAccount("Ali");
        account.deposit(200);
        account.withdraw(75);

        return account;  // TODO: replace this line
    }

    /**
     * Moves `amount` from account `from` to account `to`.
     * Assume `from` has enough money.
     */
    public static void transfer(BankAccount from, BankAccount to, double amount)
    {
        from.withdraw(amount);
        to.deposit(amount);
        // TODO
    }

    /**
     * Returns the total money in two accounts.
     */
    public static double totalBalance(BankAccount a, BankAccount b)
    {
        return a.getBalance() + b.getBalance();  // TODO: replace this line
    }

    /**
     * Returns the number of characters in the account owner's name.
     * (Calling a method on the result of another method!)
     */
    public static int ownerNameLength(BankAccount acc)
    {
        return acc.getOwner().length();  // TODO: replace this line
    }

    /**
     * PREDICT FIRST: aliasing and null references.
     */
    public static void main(String[] args)
    {
        BankAccount a = new BankAccount("Ece", 100);
        BankAccount b = a;          // b refers to the SAME object as a
        b.deposit(50);
        System.out.println(a.getBalance());   // prediction: 150.0

        BankAccount c = new BankAccount("Ece", 150);
        System.out.println(a == b);           // prediction: true
        System.out.println(a == c);           // prediction: false

        BankAccount d = null;
        System.out.println(d);                // prediction: null
        // What happens if you uncomment the next line? Why?
        // d.deposit(10);
    }
}
