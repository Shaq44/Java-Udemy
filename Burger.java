public class Burger {

    private int Patties;
    private boolean Cheese;
    private boolean lettuce;
    private boolean SpecialSauce;
    private boolean Tomato;
    private double Price ;
    private String rollType;
    private String CheeseType;

    private String additionname;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;



// The point of this project is to get use to some basic OOP
// The Constructors will allow you to put in some basic ingredients that go on a burger
//


    public Burger(int patties, boolean cheese, boolean lettuce, boolean specialSauce, boolean tomato, double price, String rollType, String cheeseType) {
        Patties = patties;
        Cheese = cheese;
        this.lettuce = lettuce;
        SpecialSauce = specialSauce;
        Tomato = tomato;
        this.Price = price;
        this.rollType = rollType;
        CheeseType = cheeseType;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isCheese() {
        return Cheese;

    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isSpecialSauce() {
        return SpecialSauce;
    }

    public boolean isTomato() {
        return Tomato;
    }

    public int getPatties() {
        return Patties;
    }

    public String getRollType() {
        return rollType;
    }

    public String getCheeseType() {
        return CheeseType;
    }

//    The next few methods were made to type the add on and price for each add on
//    The total amount of add ons is 4
    public void addburgerCustomization( String name,double price){
        this.additionname = name;
        this.addition1price= price;
    }

    public void addburgerCustomization_2( String name,double price){
        this.addition2name = name;
        this.addition2price = price;

    }

    public void addburgerCustomization_3( String name,double price){
        this.addition3name = name;
        this.addition3price = price;
    }

    public void addburgerCustomization_4( String name,double price){
        this.addition4name = name;
        this.addition4price = price;
    }


//    This Method is created to calculate burger price after add ons were made.
    public double Calculate_Burger(){
        double Burger_Price = this.Price;

        if(this.rollType != null){
            System.out.println("Rolltype: " + this.rollType);
        } else System.out.println("No Bread");

        if(this.Patties > 0){
            System.out.println("Number of patties on burger: " + this.Patties);
        } else System.out.println("No Patties on burger just bread");

        if(this.Tomato){
            System.out.println("Add Tomatoes");
        } else System.out.println("No Tomatoes");
        if(this.lettuce == true){
            System.out.println("Add Lettuce ");
        } else System.out.println("No Lettuce");

        if(this.isCheese() == true){
            System.out.println("Add Cheese: " + this.CheeseType);
        } else System.out.println("No Cheese ");

        if(this.SpecialSauce == true){
            System.out.println("Add SpecialSauce");
        } else System.out.println("No SpecialSauce");

        if(additionname!= null){
            Burger_Price += addition1price;
            System.out.println("add " +  additionname + " for the price of: " + addition1price);
        }

        if(addition2name!= null){
            Burger_Price += addition2price;
            System.out.println("add " + addition2name + " for the price of: " + addition2price);
        }

        if(addition3name!= null){
            Burger_Price += addition3price;
            System.out.println( "add " + addition3name + " for the price of: " + addition3price);
        }

        if(addition4name!= null){
            Burger_Price += addition4price;
            System.out.println("add " +  addition4name + " for the price of: e" + addition4price);
        }

        return Burger_Price;


    }

}
