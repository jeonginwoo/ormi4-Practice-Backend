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
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        int count = 0;

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
