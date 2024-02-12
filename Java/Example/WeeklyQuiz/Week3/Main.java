package WeeklyQuiz.Week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("메뉴를 선택해주세요: ");
                    option = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (true);

            Scanner sc = new Scanner(System.in);
            BusinessContact bc = new BusinessContact();
            PersonalContact pc = new PersonalContact();
            AddressBook ab = new AddressBook();
            if (option == 1) {
                System.out.print("이름을 입력하세요: ");
                bc.setName(sc.next());
                System.out.print("전화번호를 입력하세요: ");
                bc.setPhoneNumber(sc.next());
                System.out.print("회사명을 입력하세요: ");
                bc.setCompany(sc.next());
            } else if (option == 2) {
                System.out.print("이름을 입력하세요: ");
                pc.setName(sc.next());
                System.out.print("전화번호를 입력하세요: ");
                pc.setPhoneNumber(sc.next());
                System.out.print("관계을 입력하세요: ");
                pc.setRelationship(sc.next());
            } else if (option == 3) {
                ab.displayContacts();
            } else if (option == 4) {
                System.out.print("검색할 이름을 입력하세요: ");
                ab.searchContact(sc.next());
            } else if (option == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        } while (true);
    }
}
