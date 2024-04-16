package Hackathon;
import java.util.*;


public class Patron {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;

        this.borrowedBooks = new ArrayList<Book>();

    }

    public void borrowBook(Book book){
        if(book.isAvailable()){
            borrowedBooks.add(book);
            book.setAvailable(true);

        }
    }
//
    //Flag 7
    //hint - think about how you will call this method -setAvailable method is from Book class
    /**
     * public void setAvailable(boolean available) {
     *         isAvailable = available;
     *     }
     * @param book
     */
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        //complete this returnBook method.
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
