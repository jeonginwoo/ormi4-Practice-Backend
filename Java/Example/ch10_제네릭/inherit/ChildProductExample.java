package ch10_제네릭.inherit;

public class ChildProductExample {
    public static void main(String[] args) {
        ChildProduct<TV, String, String> product = new ChildProduct<>(new TV(), "smartTV", "samsung");
        System.out.println(product.getKind());
        System.out.println(product.getModel());
        System.out.println(product.getCompany());
    }
}
