import java.util.Scanner;
public class Project2TriageQueue
{
    // queue için 3 slot
    static String name1 = "";
    static String name2 = "";
    static String name3 = "";

    static int priority1 = 0;
    static int priority2 = 0;
    static int priority3 = 0;
    static int size = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // exactly 7 commands
        processCommand(sc);
        processCommand(sc);
        processCommand(sc);
        processCommand(sc);
        processCommand(sc);
        processCommand(sc);
        processCommand(sc);
    }

    public static void processCommand(Scanner sc)
    {
        String cmd = sc.next();

        // add patient
        if (cmd.equals("A"))
        {
            String name = sc.next();
            int priority = sc.nextInt();

            if (priority < 1)
            {
                System.out.println("Invalid priority.");
            }
            else if (priority > 5)
            {
                System.out.println("Invalid priority.");
            }
            else
            {
                addPatient(name, priority);
            }
        }

        // call first patient
        else if (cmd.equals("C"))
        {
            callPatient();
        }

        // show queue
        else if (cmd.equals("S"))
        {
            showQueue();
        }

        else
        {
            System.out.println("Invalid command.");
        }
    }
    // bu patient öbüründen daha önde mi diye bakıyor
    public static boolean ranksHigher(String name, int priority,
                                      String otherName, int otherPriority)
    {
        if (priority > otherPriority)
        {
            return true;
        }
        else if (priority == otherPriority)
        {
            if (name.compareTo(otherName) < 0)
            {
                return true;
            }
        }

        return false;
    }
    public static void addPatient(String name, int priority)
    {
        // BONUS: same name varsa priority update ediyoruz
        if (name.equals(name1))
        {
            removeSlot1();
            insertPatient(name, priority);
            System.out.println(name + " updated.");
        }
        else if (name.equals(name2))
        {
            removeSlot2();
            insertPatient(name, priority);
            System.out.println(name + " updated.");
        }
        else if (name.equals(name3))
        {
            removeSlot3();
            insertPatient(name, priority);
            System.out.println(name + " updated.");
        }
        else
        {
            insertPatient(name, priority);
        }
    }
    public static void insertPatient(String name, int priority)
    {
        // queue boşsa
        if (size == 0)
        {
            name1 = name;
            priority1 = priority;
            size = 1;

            System.out.println(name + " added.");
        }
        // 1 kişi varsa
        else if (size == 1)
        {
            if (ranksHigher(name, priority, name1, priority1))
            {
                name2 = name1;
                priority2 = priority1;

                name1 = name;
                priority1 = priority;
            }
            else
            {
                name2 = name;
                priority2 = priority;
            }

            size = 2;
            System.out.println(name + " added.");
        }

        // 2 kişi varsa
        else if (size == 2)
        {
            if (ranksHigher(name, priority, name1, priority1))
            {
                name3 = name2;
                priority3 = priority2;

                name2 = name1;
                priority2 = priority1;

                name1 = name;
                priority1 = priority;
            }
            else if (ranksHigher(name, priority, name2, priority2))
            {
                name3 = name2;
                priority3 = priority2;

                name2 = name;
                priority2 = priority;
            }
            else
            {
                name3 = name;
                priority3 = priority;
            }

            size = 3;
            System.out.println(name + " added.");
        }

        // queue full
        else
        {
            // new patient slot 3ten daha önemliyse transfer
            if (ranksHigher(name, priority, name3, priority3))
            {
                String transferred = name3;

                if (ranksHigher(name, priority, name1, priority1))
                {
                    name3 = name2;
                    priority3 = priority2;

                    name2 = name1;
                    priority2 = priority1;

                    name1 = name;
                    priority1 = priority;
                }
                else if (ranksHigher(name, priority, name2, priority2))
                {
                    name3 = name2;
                    priority3 = priority2;

                    name2 = name;
                    priority2 = priority;
                }
                else
                {
                    name3 = name;
                    priority3 = priority;
                }

                System.out.println(transferred +
                    " transferred to another hospital. " +
                    name + " added.");
            }
            else
            {
                System.out.println("Queue is full.");
            }
        }
    }
    public static void callPatient()
    {
        if (size == 0)
        {
            System.out.println("No patients waiting.");
        }
        else
        {
            System.out.println(name1 + " called in.");

            // herkesi bir slot yukarı al
            name1 = name2;
            priority1 = priority2;

            name2 = name3;
            priority2 = priority3;

            name3 = "";
            priority3 = 0;

            size = size - 1;
        }
    }
    public static void showQueue()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty.");
        }
        else if (size == 1)
        {
            System.out.println("1. " + name1 + " (" + priority1 + ")");
        }
        else if (size == 2)
        {
            System.out.println("1. " + name1 + " (" + priority1 + ") "
                + "2. " + name2 + " (" + priority2 + ")");
        }
        else
        {
            System.out.println("1. " + name1 + " (" + priority1 + ") "
                + "2. " + name2 + " (" + priority2 + ") "
                + "3. " + name3 + " (" + priority3 + ")");
        }
    }
    // bonus update için slot silme methodları

    public static void removeSlot1()
    {
        name1 = name2;
        priority1 = priority2;

        name2 = name3;
        priority2 = priority3;

        name3 = "";
        priority3 = 0;

        size = size - 1;
    }
    public static void removeSlot2()
    {
        name2 = name3;
        priority2 = priority3;

        name3 = "";
        priority3 = 0;

        size = size - 1;
    }


    public static void removeSlot3()
    {
        name3 = "";
        priority3 = 0;

        size = size - 1;
    }
}
