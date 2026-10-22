public class HalfDiamond
{
    public static void main(String[] args)
    {
        int count = 5;
        for (int n= 1; n<= count;n++) {
            for(int i = 0; i < count - n; i++) {
                System.out.print(" ");
            }
            for (int m = 1; m<= n;m++){
             System.out.print(m);   
            }
        for (int m = n - 1; m >= 1; m--)
            {
                System.out.print(m);
            }

           System.out.println();
       }
    }
}
