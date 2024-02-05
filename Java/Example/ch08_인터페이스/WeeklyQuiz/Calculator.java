package ch08_인터페이스.WeeklyQuiz;

import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal getDeliveryCharge(double weight, BigDecimal price) {
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
