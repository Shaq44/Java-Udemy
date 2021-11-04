public class Contacts {

    private String Contact_Name;
    private String Phone_Number;

    public Contacts(String contact_Name, String phone_Number) {
        this.Contact_Name = contact_Name;
        this.Phone_Number = phone_Number;
    }

    public String getContact_Name() {
        return Contact_Name;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public static Contacts Create_Contacts(String Name, String Number){
        return  new Contacts(Name,Number);
    }
}