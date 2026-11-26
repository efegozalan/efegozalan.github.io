public class BookTester
{
    public static void main(String[] args)
    {
        // 3 farkli constructor ile kitaplari olusturuyorum
        Book book1 = new Book("Holes", "Louis Sachar");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book();

        // Ilk kitap bilgisi
        System.out.println(book1); // Expected: Holes by Louis Sachar [Available]

        // Ilk kez odunc aliyorum
        System.out.println(book1.borrow()); // Expected: true

        // Tekrar odunc almaya calisiyorum
        System.out.println(book1.borrow()); // Expected: false

        // Kac kere basarili odunc alindi
        System.out.println(book1.getTimesBorrowed()); // Expected: 1

        // Kitabi geri veriyorum
        book1.giveBack();
        System.out.println(book1.isBorrowed()); // Expected: false

        // Tekrar odunc aliyorum
        System.out.println(book1.borrow()); // Expected: true
        System.out.println(book1.getTimesBorrowed()); // Expected: 2

        // Ikinci kitabin yazarini degistiriyorum
        book2.setAuthor("J.K. Rowling");
        System.out.println(book2.getAuthor()); // Expected: J.K. Rowling

        // Bos yazar vermeyi deniyorum
        book2.setAuthor("   ");
        System.out.println(book2.getAuthor()); // Expected: J.K. Rowling

        // Ayni yazara sahipler mi
        System.out.println(book1.sameAuthor(book2)); // Expected: false

        // Daha populer kitabi buluyorum
        System.out.println(book1.morePopular(book2).getTitle()); // Expected: Holes

        // Toplam kitap sayisi
        System.out.println(Book.getBookCount()); // Expected: 3

        // Diger kitaplari yazdiriyorum
        System.out.println(book2); // Expected: Harry Potter by J.K. Rowling [Available]
        System.out.println(book3); // Expected: Untitled by Unknown [Available]
    }
}
