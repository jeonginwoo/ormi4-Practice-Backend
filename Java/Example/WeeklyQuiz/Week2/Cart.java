package WeeklyQuiz.Week2;

import java.math.BigDecimal;

public class Cart {
    public static BigDecimal getTotalPrice(Product[] products) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : products) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    public static double getTotalWeight(Product[] products) {
        double totalWeight = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }
}
