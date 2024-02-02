package ch06_클래스.Access;

import ch06_클래스.PublicAccess.PublicAccess;

public class AccessSampleSamePackage {
    void test() {
        PublicAccess publicAccess = new PublicAccess();
        System.out.println(publicAccess.test);
    }
}
