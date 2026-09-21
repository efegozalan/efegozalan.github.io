// SpaceStation.java
// WARNING: This code currently contains exactly 32 errors and will not compile!
// Task: Find the errors, fix them, and write a "// FIX:" comment above each fix.
//class name should be the same
public class SpaceStation {
    public static void main(String[] args) {
       
        System.out.println("=== SPACE STATION RECOVERY INITIATED ===\n");

        // --- MODULE 1: VARIABLES, DATA TYPES & PRINTING (Errors 1-12) ---
        System.out.println("[MODULE 1] Loading variables...");

     
      //there could be no numbers in int
        int crewMembers = 12;
        // , can not be used
        double fuelLevel = 4500.50;
        //no "" needed
        boolean enginesReady = false;
        // i should be lowercase
        int securityLevel = 5;
        //int should be used to define shieldStatus.
         int shieldStatus = 100;
       // mainPower için bir değer girili değil.
        int mainPower = 100;
        
        System.out.println("Main Power: " + mainPower);
        // ; should be used
        int backupPower = 50;
        // T should be lowercase
        boolean commsOpen = true;
        //l should be lowercase in ln
        System.out.println("System Status Report:");
        System.out.println("System message: (Critical Warning) received.");
        System.out.println("Using the /n character for a new line.");
        // system ıd ıs alrady defined
        int systemId = 101;
        systemId = systemId++;


        // --- MODULE 2: MATH, CASTING & OVERFLOW (Errors 13-24) ---
        System.out.println("\n[MODULE 2] Fuel and Cargo Math...");

        double cargoWeight = 150.75;
       
       // integer olduğunda bir değer olmalı
        int exactCargoWeight = 150;
        //()should be used
        int roundedCargo = (int) (8.9 + 0.5);
       
        double cargoDivision = 100 / 3;
       
        int leftoverCargo = 100 / 3;
        // çarpım x ile değil * ile.
        double multiplication = 5.0 * 2.0;
       
        int speed = 5000;
        speed =+ 50;
       
        ++speed;
       
        int counter = 0;
        // ++ zaten 1 artırmakdemek.
        counter = counter++;
       
        int overload = Integer.MAX_VALUE + 1;
       
        int tempDrop = Integer.MIN_VALUE - 1;
        //) should be used.
        int parenthesisError = (10 + 5 / 2);
       // bir sayı 0 a bölünemez.
        int crash = 100 / 1;


        // --- MODULE 3: THE MATH CLASS (Errors 25-32) ---
        System.out.println("\n[MODULE 3] Navigation and Radar...");
       
        int a = 15;
        int b = 2;
        double average = (a + b) / 2;
        // integer olmalı sqrt
        double routeDeviation = Math.abs(-12);
       //sqrt olarak yazılmalı
        double coordinateSqrt = Math.sqrt(144.0);
       //powerda 2 sayı olmalı
        double enginePower = Math.pow(5.0,3.0);
       // powerda 2 tane double olmalı 3 değil.
        double attackPower = Math.pow(2.0, 3.0);
        // R should be lowercase
        double randomNum = Math.random();
       
        int faultyRandom = (int) Math.random() * 50;
       // parantez içinde sayı olmalı
        int typeError = Math.abs (-10);

        System.out.println("\n=== ALL SYSTEMS REPAIRED. STATION SAVED! ===");
    }
}
