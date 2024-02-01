package Item;

public class Book extends Item {
    private String author;
    private String isbn;

    Book(){}

    Book(int id, String name, double price){
        super(id, name, price);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
