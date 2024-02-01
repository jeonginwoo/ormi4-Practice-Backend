package Item;

public class Movie extends Item {
    private String director;
    private String[] actor;

    Movie(){}

    Movie(int id, String name, double price){
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
}
