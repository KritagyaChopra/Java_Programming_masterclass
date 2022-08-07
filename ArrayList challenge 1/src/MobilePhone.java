import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> arrayList = new ArrayList<Contacts>();

    //    public void getOption(){
//        System.out.println("Choose option : ");
////        int option = sc.nextInt();
////        sc.nextLine();
//    }
    public boolean addNewNumber(Contacts contacts) {
        if (arrayList.contains(contacts.getName())) {
            System.out.println("Contact is present");
            return false;
        }
        arrayList.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts) {
        return arrayList.indexOf(contacts);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.arrayList.size(); i++) {
            Contacts contact = this.arrayList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public boolean updateContact(Contacts old, Contacts newContact) {
        if (!(arrayList.contains(old))) {
            System.out.println("contact not  found :" + old.getName());
            return false;
        }
        if(arrayList.contains(newContact)){
            System.out.println("contact already there " + newContact.getName());
            return false;

        }
        arrayList.add(arrayList.indexOf(old), newContact);
        return true;
    }

    public boolean removeContact(Contacts newContact) {
        if (!(arrayList.contains(newContact))) {
            System.out.println("contact not found :" + newContact);
        }
        arrayList.remove(newContact);
        System.out.println("Contact deleted : " + newContact.getName());
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + " . "
                    + this.arrayList.get(i).getName() + " -> " +
                    this.arrayList.get(i).getPhoneNumber());
        }
    }

    public Contacts queryContact(String name) {
        System.out.println(findContact(name));
        if (findContact(name) >= 0) {
            return arrayList.get(findContact(name));
        }
        return null;
    }
}
