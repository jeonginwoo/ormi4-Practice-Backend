package ex3;

public class Calculator {
    int result;

    int add(int x, int y) {
        return x + y;
    }

    double divide(double x, double y) {
        return x / y;
    }

    double multiply(int x, int y) {
        return x * y;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    int prefixOperator() {    // call by value
        return ++this.result;
    }

    void changeArrayValue(int[] array) {
        array[0] = 10;
    }

    public static void main(String[] args) {
        int a = 1;
        int[] array = {1, 2, 3};
        Calculator calculator = new Calculator();

        double result = calculator.add(1, 6);
        System.out.println(result);

        result = calculator.divide(100, 3);
        System.out.println(result);

        result = calculator.multiply(3, 5);
        System.out.println(result);

        a = calculator.postfixOperator(a);
        System.out.println(a);

        System.out.println(array[0]);
        calculator.changeArrayValue(array);
        System.out.println(array[0]);

        calculator.result = calculator.add(1, 5);
        System.out.println(calculator.result);

        calculator.prefixOperator();
        System.out.println(calculator.result);
    }
}
