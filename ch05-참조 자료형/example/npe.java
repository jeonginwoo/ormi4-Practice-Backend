public class npe {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = new String();

        // System.out.println(str1.length()); // NPE 오류
        System.out.println(str2.length());
        System.out.println(str3.length());
    }
}
