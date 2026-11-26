public class Book
{
    private String title;
    private String author;
    private boolean borrowed;
    private int timesBorrowed;
    private static int bookCount = 0;

    // Kitabi verilen baslik ve yazar ile olusturur
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        borrowed = false;
        timesBorrowed = 0;
        bookCount++;
    }

    // Sadece baslik verilirse yazari Unknown yapar
    public Book(String title)
    {
        this(title, "Unknown");
    }

    // Hicbir sey verilmezse varsayilan kitap olusturur
    public Book()
    {
        this("Untitled", "Unknown");
    }

    // Kitabin basligini verir
    public String getTitle()
    {
        return title;
    }

    // Kitabin yazarini verir
    public String getAuthor()
    {
        return author;
    }

    // Kitabin odunc alinip alinmadigini verir
    public boolean isBorrowed()
    {
        return borrowed;
    }

    // Kac kere odunc alindigini verir
    public int getTimesBorrowed()
    {
        return timesBorrowed;
    }

    // Yazari degistirir, bos yaziyi kabul etmez
    public void setAuthor(String author)
    {
        if (author != null && !author.trim().equals(""))
        {
            this.author = author;
        }
    }

    // Kitabi odunc almaya calisir
    public boolean borrow()
    {
        if (borrowed)
        {
            return false;
        }

        borrowed = true;
        timesBorrowed++;
        return true;
    }

    // Kitabi geri verir
    public void giveBack()
    {
        borrowed = false;
    }

    // Iki kitabin yazari ayni mi diye bakar
    public boolean sameAuthor(Book other)
    {
        return author.equals(other.getAuthor());
    }

    // Daha cok odunc alinan kitabi verir
    public Book morePopular(Book other)
    {
        if (other.getTimesBorrowed() > timesBorrowed)
        {
            return other;
        }

        return this;
    }

    // Toplam olusturulan kitap sayisini verir
    public static int getBookCount()
    {
        return bookCount;
    }

    // Kitabin bilgilerini yazi olarak verir
    public String toString()
    {
        if (borrowed)
        {
            return title + " by " + author + " [Borrowed]";
        }

        return title + " by " + author + " [Available]";
    }
}
