package ch08_인터페이스.WeeklyQuiz;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(double weight, BigDecimal price);
}
