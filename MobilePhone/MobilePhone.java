import java.util.Scanner;

public class MobilePhone {
    private static Scanner ContactInput = new Scanner(System.in);
    private static Cell cell = new Cell("(601)998-2377");

    public static void main (String[]args){

        boolean exit = false;
        int choice = 0;
        printinstructions();
         while(!exit){
             System.out.print("Enter your choice: ");
             choice = ContactInput.nextInt();
             ContactInput.nextLine();

             switch(choice){
                 case 0:
                     printinstructions();
                     break;
                 case 1:
                     cell.Show_Contacts();
                     break;
                 case 2:
                     addContact();
                     break;
                 case 3:
                     ModifyContact();
                     break;
                 case 4:
                     Delete_Contact();
                     break;
                 case 5:
                     SearchContact();
                     break;
                 case 6:
                     exit = true;
                     break;

             }
         }


    }

    public static void printinstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - for instructions");
        System.out.println("\t 1 - Print Contact");
        System.out.println("\t 2 - add contact ");
        System.out.println("\t 3 - Edit Contact");
        System.out.println("\t 4 - remove contact");
        System.out.println("\t 5 -  Search Contact");
        System.out.println("\t 6 - Exit");
    }

    public static void addContact(){
        System.out.print("Please enter in new contact name: ");
        String Name = ContactInput.nextLine();
        System.out.print("Please enter new contact number: ");
       String Phone_Number = ContactInput.nextLine();
        Contacts New_Contact =  Contacts.Create_Contacts(Name,Phone_Number);
        if(cell.Enter_New_Contact(New_Contact)){
            System.out.println("New Contact added: " + Name + " Phone: " + Phone_Number);
        } else{
            System.out.println(Name + " Cannot be added ");
        }

    }

    public static  void ModifyContact(){
        System.out.print("Enter Contact: ");
        String Current_Contact = ContactInput.nextLine();
        Contacts Recent_Contact = cell.SearchContacts(Current_Contact);
        if(Recent_Contact != null){
            System.out.print("Enter New Contact Number: ");
            String NewNumber = ContactInput.nextLine();
            Contacts New_Contacts = Contacts.Create_Contacts(Current_Contact,NewNumber);
            if(cell.Edit_Contact(Recent_Contact,New_Contacts)){
                System.out.println("Number is Updated");
            }
        }
         else System.out.println("Contact not Found");
    }


    public static void Delete_Contact(){
        System.out.print(" Enter Contact: ");
        String Name = ContactInput.nextLine();
        Contacts contact = cell.SearchContacts(Name);
        if(contact != null){
            cell.Remove_Contact(contact);
            System.out.println("Number was Successfully deleted");
        } else System.out.println("Contact not found");

    }

    public static void SearchContact(){
        System.out.print(" Enter Contact:  ");
        String SearchNum = ContactInput.nextLine();
        Contacts Search_Num = cell.SearchContacts(SearchNum);
        if(SearchNum != null){
            cell.Show_Contact(Search_Num);
        }

    }
}