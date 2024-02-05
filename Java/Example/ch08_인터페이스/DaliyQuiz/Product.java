package ch08_인터페이스.DaliyQuiz;

import java.math.BigDecimal;

public class Product implements Promotion {
    private String name;
    BigDecimal price;
    double weight;

    Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public BigDecimal getDiscountAmount(){
        return BigDecimal.ZERO;
    }
}
