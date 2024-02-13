package WeeklyQuiz.Week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        System.out.println("연락처 출력");
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다");
        } else {
            for (Contact contact : contacts) {
                if (contact instanceof BusinessContact) {
                    System.out.printf("이름: %s, 전화번호: %s, 회사명: %s\n", contact.getName(), contact.getPhoneNumber(), ((BusinessContact) contact).getCompany());
                } else if (contact instanceof PersonalContact) {
                    System.out.printf("이름: %s, 전화번호: %s, 회사명: %s\n", contact.getName(), contact.getPhoneNumber(), ((PersonalContact) contact).getRelationship());
                } else {
                    System.out.println("오류");
                }
            }
        }
    }

    public void searchContact(String name) {
        int count = 0;

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                if (contact instanceof BusinessContact) {
                    System.out.printf("이름: %s, 전화번호: %s, 회사명: %s\n", contact.getName(), contact.getPhoneNumber(), ((BusinessContact) contact).getCompany());
                } else if (contact instanceof PersonalContact) {
                    System.out.printf("이름: %s, 전화번호: %s, 회사명: %s\n", contact.getName(), contact.getPhoneNumber(), ((PersonalContact) contact).getRelationship());
                } else {
                    System.out.println("오류");
                }
                count++;
            }
        }
        if (count == 0) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
