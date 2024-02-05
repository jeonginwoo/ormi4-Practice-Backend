package ch08_인터페이스.DaliyQuiz;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : this.products) {
            totalPrice = totalPrice.add(product.getPrice());
            totalPrice = totalPrice.subtract(product.getDiscountAmount());
        }
        return totalPrice;
    }

    public double getTotalWeight() {
        double totalWeight = 0;

        for (Product product : this.products) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    public BigDecimal calculateDeliveryCharge() {
        BigDecimal price = getTotalPrice();
        double weight = getTotalWeight();
        BigDecimal deliveryCharge;

        // 무게 조건
        if (weight < 3) {
            deliveryCharge = BigDecimal.valueOf(1000);
        } else if (weight < 10) {
            deliveryCharge = BigDecimal.valueOf(5000);
        } else {
            deliveryCharge = BigDecimal.valueOf(10000);
        }

        // 가격 조건
        if (price.compareTo(BigDecimal.valueOf(30000)) < 0) {
            // 무게단위 배송비 적용
        } else if (price.compareTo(BigDecimal.valueOf(30000)) >= 0 && price.compareTo(BigDecimal.valueOf(100000)) < 0) {
            // 1000원 할인
            deliveryCharge = deliveryCharge.subtract(BigDecimal.valueOf(1000));
        } else {
            deliveryCharge = BigDecimal.ZERO;
        }

        return deliveryCharge;
    }
}
