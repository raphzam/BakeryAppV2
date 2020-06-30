//<<<<<<< HEAD
import java.util.ArrayList;

public class BakeryDatabase{
    ArrayList<Bakery> bakeryDatabase;

    //peanut soy
    //split()



    public void preloadDB(){
        Bakery itemOne =  new Bakery("Reece's Peanut Cookie", 9.99, "Jan 23", "peanut soy", 10);
        Bakery itemTwo =  new Bakery("Vegan Vanilla Pudding", 4.99, "Jan 23", "soy peanut", 5);
        Bakery itemThree =  new Bakery("Chocolate Cake", 4.99, "Jan 23", "gluten dairy peanut", 7);
        Bakery itemFour =  new Bakery("Peanut Brittle", 7.99, "Jan 23", "peanut soy dairy", 8);
        Bakery itemFive =  new Bakery("Banana Pudding", 8.99, "Jan 23", "dairy gluten", 7);
        Bakery itemSix =  new Bakery("Cookies & Cream Ice Cream", 4, "Jan 23", "dairy", 5);
        Bakery itemSeven =  new Bakery("Tofu Donut", 5, "Jan 23", "soy", 5);
        Bakery itemEight =  new Bakery("Mango Pudding", 10.99, "Jan 23", "soy", 6);
        Bakery itemNine =  new Bakery("Peanutbutter Cake", 7.99, "Jan 23", "peanut", 3);
        Bakery itemTen =  new Bakery("Apple Pie", 12.99, "Jan 23", "gluten", 10);
        Bakery itemEleven =  new Bakery("Vegan Pumpkin Pie", 8.99, "Jan 23", "soy", 4);
        Bakery itemTwelve =  new Bakery("Blueberry Muffin", 2.99, "Jan 23", "gluten", 12);
        Bakery itemThirteen =  new Bakery("Strawberry Cheesecake", 4.99, "Jan 23", "dairy", 3);
        Bakery itemFourteen =  new Bakery("Vanilla Blast", 8.99, "Jan 23", "dairy", 10);
        Bakery itemFifteen =  new Bakery("Glazed Donut", 1.99, "Jan 23", "gluten", 12);

        //peanut

        //adding to array
        addToDatabase(itemOne);
        addToDatabase(itemTwo);
        addToDatabase(itemThree);
        addToDatabase(itemFour);
        addToDatabase(itemFive);
        addToDatabase(itemSix);
        addToDatabase(itemSeven);
        addToDatabase(itemEight);
        addToDatabase(itemNine);
        addToDatabase(itemTen);
        addToDatabase(itemEleven);
        addToDatabase(itemTwelve);
        addToDatabase(itemThirteen);
        addToDatabase(itemFourteen);
        addToDatabase(itemFifteen);


//            PRINT ALL
//            for (Bakery i : bakeryDatabase){
//
//                if(i.getAllergy().equalsIgnoreCase("peanuts")){
//                    System.out.println("Peanuts " + i.getProductName());
//                } else if (i.getAllergy().equalsIgnoreCase("soy")) {
//                    System.out.println("Soy " + i.getProductName());
//                } else if (i.getAllergy().equalsIgnoreCase("gluten")) {
//                    System.out.println("Gluten " + i.getProductName());
//                } else if (i.getAllergy().equalsIgnoreCase("dairy")){
//                    System.out.println("Dairy " + i.getProductName());
//                }
//            }

    }


    public BakeryDatabase(){//constructor
        this.bakeryDatabase = new ArrayList<Bakery>();
    }


    public  String searchByAllergy(String userAllergy) {
        //
        String retval = "";
        if (userAllergy.equalsIgnoreCase("all")) {
            for (Bakery item : this.bakeryDatabase) {
                retval += item.getProductName() + ", ";
            }
        } else {
            for (Bakery item : this.bakeryDatabase) {
                // compare userAllegy with each item's allegy
                // if found
                //then add productname to retval
                //get the allergyString
                //split allergy string in an array
                //search array for user Allergy

                String itemAllergy = item.getAllergy();
                String[] allergy = itemAllergy.split(" ");

                for (String allergen : allergy) {
                    if (allergen.equalsIgnoreCase(userAllergy)) {
                        retval += item.getProductName() + ", ";
                    }
                }

            }
        }
        return retval;
    }





    //public void printAll()





    public void addToDatabase(Bakery object){
        String productName = object.getProductName();//get String value from bakery Object
        this.bakeryDatabase.add(object);//add String value to bakeryDatabase
    }



}




