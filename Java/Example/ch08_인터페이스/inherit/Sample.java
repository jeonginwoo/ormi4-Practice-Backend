package ch08_인터페이스.inherit;

public class Sample {
    public static void main(String[] args) {
        InterfaceCImpl interfaceC = new InterfaceCImpl();
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();

        InterfaceA interfaceA = new InterfaceCImpl();
        interfaceA.methodA();
        // interfaceA.methodB();
        // interfaceA.methodC();
    }
}
