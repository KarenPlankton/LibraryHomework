import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;

    private Library library;


    private Borrower borrower;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("The Necronomicon", "Abdul Alhazred", "Occult");
        book2 = new Book("Dracula", "Bram Stoker", "Horror");
        book3 = new Book("The Highest Altar: Story of Human Sacrifice", "Patrick Tierney", "Anthropology");

        borrower = new Borrower("John");

        library = new Library("Miskatonic University Library",1000);

    }

    @Test
    public void canGetCapacity() {
        assertEquals(1000, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkBookAvailable() {
        assertEquals(false, library.checkInStock(book1));
    }

    @Test
    public void checkBookInStock() {
        library.addBook(book1);
        assertEquals(true, library.checkInStock(book1));
    }

    @Test
    public void testCanLendBook() {
        library.addBook(book1);

        library.loanBook(book1, borrower);

        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.getBookCount());
        assertEquals(false, library.checkInStock(book1));
    }

    @Test
    public void returnGenreFrequency(){


        assertEquals(300, library.checkGenreFrequency("Horror"));


    }

}
