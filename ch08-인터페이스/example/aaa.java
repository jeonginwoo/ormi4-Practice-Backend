public class aaa {

}
//인터페이스를 사용하지 않는 직접적인 관계의 클래스
class A {
    public void methodA(B b) {
        b.methodB();
    }
}
class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}
class InterfaceTest {
    public static void main(String args[]) {
        A a = new A();
        a.methodA (new B());
    }
}