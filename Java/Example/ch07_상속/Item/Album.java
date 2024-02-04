package ch07_상속.Item;

public class Album extends Item {
    private String artist;

    Album() {
    }

    Album(int id, String name, int price) {
        super(id, name, price);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void print() {
        System.out.println("-------------------");
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice() + "원");
        System.out.println("artist: " + getArtist());
        System.out.println("-------------------\n");
    }
}
