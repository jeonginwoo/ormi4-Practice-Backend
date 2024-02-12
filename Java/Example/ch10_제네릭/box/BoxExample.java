package ch10_제네릭.box;

public class BoxExample {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.set("string");
//        String str = (String) box.get();
        Box<String> box = new Box<>();
        box.setObject("dkdkdkdk");
        String str = box.getObject();
        System.out.println(str);
    }
}
