package ch01_기초.ex01;

public class Sample {
    public static void main(String[] args) {
        // 상품 주문 서비스

        Item item = new Item();

        // 장바구니
        Cart cart = new Cart();
        cart.put(item);

        // 장바구니에 넣는다

        // 결제
        Payment payment = new Payment();
    }
}
