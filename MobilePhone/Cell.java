import java.util.ArrayList;

public class Cell {

    private String My_Number;
    private ArrayList<Contacts> My_Contacts;

//    You need the contact arraylist apart of the constructor but it shouldn't be a part of the arguement

    public Cell(String my_Number) {
        My_Number = my_Number;
        this.My_Contacts = new ArrayList<Contacts>();
    }

    public void Show_Contacts(){
        System.out.println(" Contact List:" );
        for(int i=0;i<My_Contacts.size();i++){
            System.out.println((i+1)+ " . " + this.My_Contacts.get(i).getContact_Name() +
                  " " + this.My_Contacts.get(i).getPhone_Number());
        }

    }

    public void Show_Contact(Contacts contacts){
        if(contacts != null){
            System.out.println("Contact: " + contacts.getContact_Name() +" " +
                    contacts.getPhone_Number() );
        } else System.out.println("Contact Not Found");
    }

    private int Search_Contact(Contacts contact) {
        return this.My_Contacts.indexOf(contact);
    }

    private int Search_Contact(String Contact_Name){
        for(int i = 0;i<this.My_Contacts.size();i++){
            Contacts contact = this.My_Contacts.get(i);
            if(contact.getContact_Name().equals(Contact_Name)){
                return i;
            }
        }
        return -1;
    }

    public boolean Enter_New_Contact(Contacts contact){
        if(Search_Contact(contact.getContact_Name()) < 0){
            System.out.println(" Contact Not Found in Phone ");
        }  My_Contacts.add(contact);
        return true;
    }

    public boolean Remove_Contact(Contacts Contact){
        int position = Search_Contact(Contact);
        if(position >= 0){
            My_Contacts.remove(Contact);
        } else System.out.println("Contact Not Found");
        return false;
    }

    public boolean Edit_Contact(Contacts Old_contact, Contacts New_Contact){
        int Position = Search_Contact(Old_contact);
        if(Position >= 0 ){
         this.My_Contacts.set(Position,New_Contact);
         System.out.println(Old_contact.getContact_Name() + " replaced with " + New_Contact.getContact_Name());
        } else if (Search_Contact(New_Contact.getContact_Name()) != -1){
            System.out.println("Contact with name " +New_Contact.getContact_Name() +
                    "Already Exists. Update did not work");
            return false;
        }
        return true;

    }



    public String SearchNumber (Contacts contact){
       if(Search_Contact(contact) >= 0){
           return contact.getContact_Name();
       } return null;
    }

    public Contacts SearchContacts(String Name){
        int position = Search_Contact(Name);
        if(position >= 0){
            return this.My_Contacts.get(position);
        }
        return null;
    }

}