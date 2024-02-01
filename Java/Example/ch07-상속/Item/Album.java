package Item;

public class Album extends Item {
    private String artist;

    Album(){}

    Album(int id, String name, double price){
        super(id, name, price);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}
