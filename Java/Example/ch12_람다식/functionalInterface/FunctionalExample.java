package ch12_람다식.functionalInterface;

public class FunctionalExample {
    public static void main(String[] args) {
        MyFunctionalInterface1 f1;
        f1 = () -> {
            String str = "method call 1";
            System.out.println(str);
        };
        f1.method();

        MyFunctionalInterface2 f2;
        f2 = x -> System.out.println("x = " + x);
        f2.method(10);

        MyFunctionalInterface3 f3;
        f3 = (x, y) -> x + y;
        System.out.println("x + y = " + f3.method(3, 6));
    }
}
