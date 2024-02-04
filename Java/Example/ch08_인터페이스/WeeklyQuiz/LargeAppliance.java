package ch08_인터페이스.WeeklyQuiz;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator {
    LargeAppliance(String name, BigDecimal price, Double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDeliveryCharge(double weight, BigDecimal price) {
        BigDecimal deliveryCharge;

        // 무게 조건
        if (weight < 3) {
            deliveryCharge = new BigDecimal("1000");
        } else if (weight < 10) {
            deliveryCharge = new BigDecimal("5000");
        } else {
            deliveryCharge = new BigDecimal("10000");
        }

        // 가격 조건
        if (price.compareTo(new BigDecimal(30000)) < 0) {
            // 무게단위 배송비 적용
        } else if (price.compareTo(new BigDecimal(30000)) >= 0 && price.compareTo(new BigDecimal(100000)) < 0) {
            deliveryCharge.subtract(new BigDecimal("1000"));
        } else {
            deliveryCharge = new BigDecimal("0");
        }

        return deliveryCharge;
    }
}
