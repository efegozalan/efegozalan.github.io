import java.util.Scanner;

public class FabLabFilament {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner açtım
        Scanner input = new Scanner(System.in);
        // Girilen bilgiyi String olarak aldım
        String record = input.nextLine();
        // Malzeme kodunu aldım
        String material = record.substring(0, 3);
        // Her spool değerini String'den int'e çevirdim
        int spool1 = Integer.parseInt(record.substring(4, 7));
        int spool2 = Integer.parseInt(record.substring(8, 11));
        int spool3 = Integer.parseInt(record.substring(12, 15));
        int spool4 = Integer.parseInt(record.substring(16, 19));
        int spool5 = Integer.parseInt(record.substring(20, 23));
        int spool6 = Integer.parseInt(record.substring(24, 27));
        // Bütün spool değerlerini topladım
        int total = spool1 + spool2 + spool3 + spool4 + spool5 + spool6;
        // Ortalamayı hesapladım
        double average = (double) total / 6;
        // Sonuçları yazdırdım
        System.out.println("Material: " + material);
        System.out.println("Total filament: " + total + " grams");
        System.out.println("Average per spool: " + average + " grams");
    }
}


