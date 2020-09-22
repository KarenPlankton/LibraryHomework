import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;


    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int bookCount() {
        return this.collection.size();
    }



    public void addBook(Book book) {
        this.collection.add(book);
    }


}
