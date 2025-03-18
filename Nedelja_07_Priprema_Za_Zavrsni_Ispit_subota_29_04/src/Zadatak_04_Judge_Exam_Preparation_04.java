import java.util.Scanner;

public class Zadatak_04_Judge_Exam_Preparation_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfDays=Integer.parseInt(sc.nextLine());
        double totalAmountOfFood=Double.parseDouble(sc.nextLine());
        int i;
        int eatenFoodDogCounter=0;
        int eatenFoodCatCounter=0;
        int eatenFoodTotalForDay=0;
        int cookiesCounter=0;


        for(i=1; i<=numberOfDays; i++){

            int amountOfEatenFoodDog=Integer.parseInt(sc.nextLine());
            int amountOfEatenFoodCat=Integer.parseInt(sc.nextLine());

            eatenFoodCatCounter=eatenFoodCatCounter+amountOfEatenFoodCat;
            eatenFoodDogCounter=eatenFoodDogCounter+amountOfEatenFoodDog;


            if(i%3==0){

                eatenFoodTotalForDay=eatenFoodTotalForDay+amountOfEatenFoodDog+amountOfEatenFoodCat;
            }

        }

        double cookies=0.1*eatenFoodTotalForDay;
        int eatenFoodTotal=eatenFoodCatCounter+eatenFoodDogCounter;
        double percentageOfEatenFood=100.00*eatenFoodTotal/totalAmountOfFood;
        double percentageOfEatenFoodDog=100.00*eatenFoodDogCounter/eatenFoodTotal;
        double percentageOfEatenFoodCat=100.00*eatenFoodCatCounter/eatenFoodTotal;
        System.out.printf("Total eaten biscuits: %.0fgr.\n", cookies);
        System.out.printf("%.2f%% of the food has been eaten.\n", percentageOfEatenFood);
        System.out.printf("%.2f%% eaten from the dog.\n", percentageOfEatenFoodDog);
        System.out.printf("%.2f%% eaten from the cat.", percentageOfEatenFoodCat);


    }
}
