public class BreakfastBurger extends Burger {

    private String EggType;
    private String TypeOfJelly;
    private String Add_Bacon;
    private double Add_Price;


    public BreakfastBurger(int patties, boolean cheese, boolean lettuce, boolean specialSauce, boolean tomato, double price, String rollType, String cheeseType, String eggType, String typeOfJelly) {
        super(patties, cheese, lettuce, specialSauce, tomato, price, rollType, cheeseType);
        EggType = eggType;
        TypeOfJelly = typeOfJelly;
    }

    public String getEggType() {
        return EggType;
    }

    public String getTypeOfJelly() {
        return TypeOfJelly;
    }

    public void Add_Bacon(String Bacon, double price){
        this.Add_Bacon = Bacon;
        this.Add_Price = price;
    }



    //     this overidden method takes from takes from the main burger class
    @Override
    public double Calculate_Burger() {
        double Breakfast_Burger_Price = super.Calculate_Burger();
        if(Add_Bacon != null){
            Breakfast_Burger_Price += Add_Price;
            System.out.println(Add_Bacon + " was added for the price of: " + Add_Price);
        }
        return Breakfast_Burger_Price;
    }
}
