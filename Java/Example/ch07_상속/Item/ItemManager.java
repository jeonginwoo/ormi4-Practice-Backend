package ch07_상속.Item;

public class ItemManager {
    public static void main(String[] args) {
        Album album = new Album(1, "시간과 낙엽", 300);
        Movie movie = new Movie(2, "바람", 8000);
        Book book = new Book(3, "윈터러", 20000);

        album.setArtist("악동 뮤지션");

        String[] actors = {"정우", "황정음", "손호준", "권재현", "양기원", "이유준", "조영진", "지승현"};
        movie.setDirector("이성한");
        movie.setActor(actors);

        book.setAuthor("전민희");
        book.setIsbn("");

        album.print();
        movie.print();
        book.print();
    }
}
