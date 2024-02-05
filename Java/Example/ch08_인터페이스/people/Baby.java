package ch08_인터페이스.people;

public class Baby implements Crawl {
    @Override
    public void crawl() {
        System.out.println("아기가 기어갑니다.");
    }
}
