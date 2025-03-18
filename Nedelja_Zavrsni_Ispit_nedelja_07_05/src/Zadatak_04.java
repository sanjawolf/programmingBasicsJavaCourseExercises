import java.util.Scanner;

public class Zadatak_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfDays=Integer.parseInt(sc.nextLine());
        double totalAmountOfFood=Double.parseDouble(sc.nextLine());

        int foodEatenDog=0;
        int foodEatenCat=0;
        double biscuitsCounter=0;

        for(int i=1; i<=numberOfDays; i++){

            int amountOfFoodDog=Integer.parseInt(sc.nextLine());
            int amountOfFoodCat=Integer.parseInt(sc.nextLine());

            foodEatenDog+=amountOfFoodDog;
            foodEatenCat+=amountOfFoodCat;


            if(i%3==0){

                double biscuitForDay=0.1*(amountOfFoodCat+amountOfFoodDog);
                biscuitsCounter+=biscuitForDay;

            }
        }

        System.out.printf("Total eaten biscuits: %dgr.\n", Math.round(biscuitsCounter));
        int foodEaten=foodEatenDog+foodEatenCat;
        double percentageOfFoodEaten=100*foodEaten/totalAmountOfFood;
        System.out.printf("%.2f%% of the food has been eaten.\n", percentageOfFoodEaten);
        double percentageOfFoodEatenDog=100.0*foodEatenDog/foodEaten;
        System.out.printf("%.2f%% eaten by the dog.\n", percentageOfFoodEatenDog);
        double percentageOfFoodEatenCat=100.0*foodEatenCat/foodEaten;
        System.out.printf("%.2f%% eaten by the cat.", percentageOfFoodEatenCat);


    }
}
