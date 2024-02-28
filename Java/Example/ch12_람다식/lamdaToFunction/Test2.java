package ch12_람다식.lamdaToFunction;

import java.util.function.LongSupplier;

public class Test2 {
    public static void main(String[] args) {
        LongSupplier ls = () -> Long.MAX_VALUE;
        System.out.println(ls.getAsLong());
    }
}
