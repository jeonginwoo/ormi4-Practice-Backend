package ch08_인터페이스.WeeklyQuiz;

public class Grocery extends Product implements DeliveryChargeCalculator {
    Grocery(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double getDeliveryCharge(double weight, double price) {
        double deliveryCharge;

        if (weight < 3) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (price < 30000) {
            return deliveryCharge;
        } else if (price < 100000) {
            deliveryCharge -= 1000;
            return deliveryCharge;
        } else {
            deliveryCharge = 0;
            return deliveryCharge;
        }
    }
}
