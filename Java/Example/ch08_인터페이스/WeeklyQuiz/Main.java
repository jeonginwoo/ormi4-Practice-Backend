package ch08_인터페이스.WeeklyQuiz;

public class Main {
    static void printInform(String name, double price, double weight, DeliveryChargeCalculator product) {
        double deliveryCharge = product.getDeliveryCharge(weight, price);
        System.out.println("------------------");
        System.out.format("상품 명: %s\n", name);
        System.out.format("가격: %.0f원\n", price);
        System.out.format("배송비: %.0f원\n", deliveryCharge);
        System.out.format("총 비용: %.0f원\n", (price + deliveryCharge));
        System.out.println("------------------\n");
    }

    public static void main(String[] args) {
        ProductDeliveryCharge deliveryCharge = new ProductDeliveryCharge();

        // 식료품
        Grocery grocery = new Grocery("자연과일 프리미엄 혼합 과일선물세트 제철 과일바구니 설 명절 이바지 출산 병문안 [원산지:상세설명에 표시]", 69000, 4);
        printInform(grocery.getName(), grocery.getPrice(), grocery.getWeight(), grocery);

        // 화장품
        Beauty beauty = new Beauty("[속광장벽]온그리디언츠 스킨 베리어 카밍 로션 220ml", 35000, 0.3);
        printInform(beauty.getName(), beauty.getPrice(), beauty.getWeight(), beauty);

        // 대형가전
        LargeAppliance largeAppliance = new LargeAppliance("미니세탁기 LW60P1 6kg 속옷 양말 애기 유아 아기옷 소형 미니 자취방", 228000, 20);
        printInform(largeAppliance.getName(), largeAppliance.getPrice(), largeAppliance.getWeight(), largeAppliance);
    }
}
