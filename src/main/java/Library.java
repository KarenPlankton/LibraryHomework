import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookTitles;
    private int capacity;
    private HashMap<String, Integer> genreHash;
    private  String name;

    public Library(String name,int capacity) {

        this.bookTitles = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreHash = new HashMap<String, Integer>();
        this.name = name;

        genreHash.put("Horror", 300);
        genreHash.put("Science", 550);
        genreHash.put("Literature", 700);

    }

    public int getCapacity() {
        return capacity;
    }

    public void addBook(Book book) {
        if (this.capacity > this.bookTitles.size())
            this.bookTitles.add(book);
    }

    public int getBookCount() {
        return this.bookTitles.size();
    }

    public Book removeBook() {
        return this.bookTitles.remove(0);
    }


    public void loanBook(Book book, Borrower borrower) {
        if (this.bookTitles.contains(book)) {
            this.bookTitles.remove(book);
            borrower.addBook(book);
        }
    }

    public int checkGenreFrequency(String genre) {
        return this.genreHash.get(genre);
    }

    public boolean checkInStock(Book book) {
        for (Book book1 : this.bookTitles) {
            if (book1 == book) {
                return true;
            }
        }

        return false;

    }

}


