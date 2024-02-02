package ch07_상속.Item;

import java.util.Arrays;

public class Movie extends Item {
    private String director;
    private String[] actor;

    Movie() {
    }

    Movie(int id, String name, int price) {
        super(id, name, price);
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void print() {
        System.out.println("-------------------");
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice() + "원");
        System.out.println("director: " + getDirector());
        System.out.println("actor: " + Arrays.toString(getActor()));
        System.out.println("-------------------\n");
    }
}
