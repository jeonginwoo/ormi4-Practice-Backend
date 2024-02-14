package WeeklyQuiz.Week3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static boolean isPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("^010-\\d{4}-\\d{4}");
        boolean isMatch = pattern.matcher(number).find();
        return isMatch;
    }

    private static String inputNumber(Scanner sc) {
        String number = sc.next();
        while (!isPhoneNumber(number)) {
            System.out.println("\n잘못된 형식입니다. (예시: 010-xxxx-xxxx)\n");
            System.out.print("전화번호를 입력하세요: ");
            number = sc.next();
        }
        return number;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true) {
            // 메뉴 선택
            int option;
            while (true) {
                System.out.println("""
                        1. 비즈니스 연락처 추가
                        2. 개인 연락처 추가
                        3. 연락처 출력
                        4. 연락처 검색
                        5. 종료
                        """);
                System.out.print("메뉴를 선택해주세요: ");
                try {
                    Scanner sc = new Scanner(System.in);
                    option = sc.nextInt();
                    if (option < 1 || option > 5) {
                        throw new OutOfNumberException("입력 가능한 번호가 아닙니다. (1~5 입력)");
                    }
                    break;
                } catch (OutOfNumberException e) {
                    System.out.println("\n"+e.getMessage()+"\n");
                } catch (Exception e) {
                    System.out.println("\n잘못된 입력입니다.\n");
                }
            }

            Scanner sc = new Scanner(System.in);

            switch(option) {
                // 비즈니스 연락처 추가
                case 1:
                    BusinessContact bc = new BusinessContact();
                    System.out.print("이름을 입력하세요: ");
                    bc.setName(sc.next());
                    System.out.print("전화번호를 입력하세요: ");
                    bc.setPhoneNumber(inputNumber(sc));
                    System.out.print("회사명을 입력하세요: ");
                    bc.setCompany(sc.next());
                    addressBook.addContact(bc);
                    break;

                // 개인 연락처 추가
                case 2:
                    PersonalContact pc = new PersonalContact();
                    System.out.print("이름을 입력하세요: ");
                    pc.setName(sc.next());
                    System.out.print("전화번호를 입력하세요: ");
                    pc.setPhoneNumber(inputNumber(sc));
                    System.out.print("관계을 입력하세요: ");
                    pc.setRelationship(sc.next());
                    addressBook.addContact(pc);
                    break;

                // 연락처 출력
                case 3:
                    addressBook.displayContacts();
                    break;

                // 연락처 검색
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    addressBook.searchContact(sc.next());
                    break;

                // 종료
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }

            System.out.println();
        }
    }
}
