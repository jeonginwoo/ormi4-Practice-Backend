package ch08_인터페이스.WeeklyQuiz;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Double weight;

    Product(String name, BigDecimal price, Double weight) {
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

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }
}
