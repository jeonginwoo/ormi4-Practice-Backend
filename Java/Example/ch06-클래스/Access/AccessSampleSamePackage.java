package Access;

import PublicAccess.PublicAccess;

public class AccessSampleSamePackage {
    void test() {
        PublicAccess publicAccess = new PublicAccess();
        System.out.println(publicAccess.test);
    }
}
