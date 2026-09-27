public class ObjectExample
{
    private String name;
    private int age;

    public ObjectExample(String n, int a)
    {
        name = n;
        age = a;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        ObjectExample student = new ObjectExample("Alex", 16);

        student.printInfo();
    }
}
