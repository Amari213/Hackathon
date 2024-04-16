package Book;
import Hackathon.Patron;

import java.util.ArrayList;
import java.util.List;
public class Librarian {

    private String name;
    private String employeeID;
    private List<Book> books;

    public Librarian(String name, String id) {
        this.name = name;
        this.employeeID = id;
        //create an ArrayList Book type  -Flag8
        books = new ArrayList<Book>();
    }

    //Flag9
    public void addBook(Book book) {
        //complete this method
        books.add(book);
    }

    //Flag10
    public void removeBook(Book book) {
        books.remove(books);
    }

    //Flag 11 (Q & A)
    //discussion to explain about this method
    //students who ask questions and answer to their peers' questions actively will get the flag.
    //highly recommend to participate actively.
    public void checkoutBook(Book book, Patron patron) {
        if (books.contains(book) && book.isAvailable()) {
            patron.borrowBook(book);
        }
    }

    //complete this method with a case if the book is not available
    //last flag
    else

    {
        System.out.println("This book is not available. ");
    }
}
    //Flag 12
    //create chekinBook method.
    public void checkinBook(Book book, Patron patron) {
    if(books.contains(book)){
        patron.returnBook(book);
    }

}



