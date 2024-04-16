package Hackathon;

public class Book {
    //Flag 7 question

    /**
     * create four data/fields/attributes - inst
     */

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(){
        this("HitchHikers guide to the Galaxy", "Douglas Adams","0-330-25864-8", true);
    }


    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString(){
        if(isAvailable) {
            return String.format("Title: %s\n\nAuthor: %s\nISBN: %s\n\nCheck-in: Available - You can check out the book");
        }
        else {
            return String.format("Title: %s\n\nAuthor: %s\nISBN: %s\n\nCheck-in: Out - You cannot check out the book");
        }
    }

}
