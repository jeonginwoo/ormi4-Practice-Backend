package WeeklyQuiz.Week2;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(double weight, BigDecimal price);
}
