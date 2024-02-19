package ch12_람다식.utilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class UtilFunctionTest {
    public static void main(String[] args) {
        // Runnable - 매개변수 : X, 리턴 : X
        Runnable r = () -> System.out.println("1. Runnable");
        r.run();


        // Supplier - 매개변수 : X, 리턴 : O
        System.out.println("2. Supplier -> r");

        Supplier<String> s = () -> "\t2-1. Supplier";
        System.out.println(s.get());

        LongSupplier ls = () -> Long.MAX_VALUE;
        System.out.println("\t2-2. LongSupplier - return : " + ls.getAsLong());


        // Consumer - 매개변수 : O, 리턴 : X
        System.out.println("3. x -> Consumer");

        Consumer<String> c = x -> System.out.println("\t3-1. Consumer - x : " + x);
        c.accept("ㅇ)-(");

        DoubleConsumer dc = x -> System.out.println("\t3-2. DoubleConsumer - x : " + x);
        dc.accept(4.5);


        // Function - 매개변수 : O, 리턴 : O
        System.out.println("4. x -> Function -> r");

        Function<Integer, String> f = x -> "\t4-1. Function - x : " + x;
        System.out.println(f.apply(12));

        BiFunction<Integer, Integer, String> bf = (x, y) -> "\t4-2. BiFunction - x : " + x + ", y : " + y;
        System.out.println(bf.apply(8, 14));


        // Predicate - 매개변수 : O, 리턴 : O
        System.out.println("5. x -> Predicate -> (boolean) r");
        Predicate<Integer> p = x -> x % 2 == 1;
        System.out.println("\t5-1. Predicate - return : " + p.test(5));
    }
}
