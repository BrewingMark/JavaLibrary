import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings",
                "J.R.R Tolkien",
                "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Lord of the Rings", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("J.R.R Tolkien", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
