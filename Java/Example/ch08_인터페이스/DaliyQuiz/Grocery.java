package ch08_인터페이스.DaliyQuiz;

import java.math.BigDecimal;

public class Grocery extends Product {
    Grocery(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount(){
        return BigDecimal.valueOf(2000);
    }
}
