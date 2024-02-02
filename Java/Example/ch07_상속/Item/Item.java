package ch07_상속.Item;

public class Item {
    private int id;
    private String name;
    private int price;

    Item() {
    }

    Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("-------------------");
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice() + "원");
        System.out.println("-------------------\n");
    }
}
