package ch08_인터페이스.WeeklyQuiz;

public class ProductDeliveryCharge {
    public double productDeliveryCharge(DeliveryChargeCalculator product, double weight, double price) {
        return product.getDeliveryCharge(weight, price);
    }
}
