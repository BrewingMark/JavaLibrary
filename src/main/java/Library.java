import java.util.ArrayList;

public class Library {

    private ArrayList<Book> inventory;
    private int capacity;

    public Library(){
        this.inventory = new ArrayList<Book>();
        this.capacity = 5;
    }


    public int bookCount() {
        return this.inventory.size();
    }

    public void addBook(Book book) {
        if (this.inventory.size() < this.capacity) {
            this.inventory.add(book);
        }
    }

}
