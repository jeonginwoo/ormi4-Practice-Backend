package WeeklyQuiz.Week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        do {
            // 메뉴 선택
            int option;
            do {
                System.out.println("1. 비즈니스 연락처 추가");
                System.out.println("2. 개인 연락처 추가");
                System.out.println("3. 연락처 출력");
                System.out.println("4. 연락처 검색");
                System.out.println("5. 종료");
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("메뉴를 선택해주세요: ");
                    option = sc.nextInt();
                    if (option < 1 || option > 5) {
                        throw new OutOfNumberException();
                    }
                    break;
                } catch (OutOfNumberException e) {
                    System.out.println("\n입력 가능한 번호가 아닙니다. (1~5 입력)\n");
                } catch (Exception e) {
                    System.out.println("\n잘못된 입력입니다.\n");
                }
            } while (true);

            Scanner sc = new Scanner(System.in);

            // 비즈니스 연락처 추가
            if (option == 1) {
                BusinessContact bc = new BusinessContact();
                System.out.print("이름을 입력하세요: ");
                bc.setName(sc.next());
                System.out.print("전화번호를 입력하세요: ");
                bc.setPhoneNumber(sc.next());
                System.out.print("회사명을 입력하세요: ");
                bc.setCompany(sc.next());
                addressBook.addContact(bc);
            }

            // 개인 연락처 추가
            else if (option == 2) {
                PersonalContact pc = new PersonalContact();
                System.out.print("이름을 입력하세요: ");
                pc.setName(sc.next());
                System.out.print("전화번호를 입력하세요: ");
                pc.setPhoneNumber(sc.next());
                System.out.print("관계을 입력하세요: ");
                pc.setRelationship(sc.next());
                addressBook.addContact(pc);
            }

            // 연락처 출력
            else if (option == 3) {
                addressBook.displayContacts();
            }

            // 연락처 검색
            else if (option == 4) {
                System.out.print("검색할 이름을 입력하세요: ");
                addressBook.searchContact(sc.next());
            }

            // 종료
            else if (option == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println();
        } while (true);
    }
}
