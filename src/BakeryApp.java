import java.util.Scanner;

public class BakeryApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BakeryDatabase sweetTreats = new BakeryDatabase();

        sweetTreats.preloadDB();

        while (true) {


            System.out.println("What are you allergic to? To see everything type all");
            String userAllergy = input.nextLine();
            System.out.println(sweetTreats.searchByAllergy(userAllergy));

            System.out.println("Search Again? no to stop");
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("no")){
                break;
            }

        }


        //sweetTreats.searchByAllergy(userAllergy);

    }

}



