package ch07_상속.Item;

public class Book extends Item {
    private String author;
    private String isbn;

    Book() {
    }

    Book(int id, String name, int price) {
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

    @Override
    public void print() {
        System.out.println("-------------------");
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice() + "원");
        System.out.println("author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("-------------------\n");
    }
}
