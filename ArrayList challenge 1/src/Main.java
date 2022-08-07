import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    private static  Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("\n Enter action : (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0 :
                    System.out.println(" \n Shutting down ...");
                    break;
                case 1 :
                    mobilePhone.printContacts();
                    break;
                case 2 :
                    addContact();
                    break;
                case 3 :
                   updateContact();
                    break;
                case 4 :
                    removeContact();
                    break;
                case 5 :
                    queryContact();
                    break;
                case 6 :
                    printAction();
                    break;
            }

        }




    }

    private static void queryContact() {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        Contacts contact = mobilePhone.queryContact(name);
        if(contact==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println(" name : "+contact.getName()+ " phno - " + contact.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        Contacts contact = mobilePhone.queryContact(name);
        if(contact==null){
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(contact)){
            System.out.println("success in deletion");
        }
        else{
            System.out.println("cant remove");
        }
    }

    private static void updateContact() {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        Contacts contact = mobilePhone.queryContact(name);
        if(contact==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new name : ");
        String newName = sc.nextLine();
        System.out.println("Enter new number : ");
        String newNumber = sc.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(contact,newContact)) {
            System.out.println(" contact updated ");
        }
        else{
            System.out.println("error uploading");
        }
    }

    private static void addContact() {
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter number : ");
        String  phone = sc.nextLine();
        Contacts newContact = Contacts.createContact(name,phone);
        if(mobilePhone.addNewNumber(newContact)){
            System.out.println("New contact added " + name + ", phone number = "+phone);
        }
        else{
            System.out.println("already exits");
        }
    }


    private static void printAction() {
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print list of actions");
        System.out.println("Choose your action : ");
    }

    private static void startPhone() {
        System.out.println(" MOBILE STARTED");
    }

}
