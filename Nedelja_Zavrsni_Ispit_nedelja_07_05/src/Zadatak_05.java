import java.util.Scanner;

public class Zadatak_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int amountOfFoodForPuppyInKilograms=Integer.parseInt(sc.nextLine());

        int amountOfFoodForPuppyInGrams=amountOfFoodForPuppyInKilograms*1000;

        int sum=0;

        while(true){

            String gramsPuppyEatsEachFeedingText= sc.nextLine();

            if(gramsPuppyEatsEachFeedingText.equals("Adopted")){

                break;
            }

            int gramsPuppyEatsEachFeeding=Integer.parseInt(gramsPuppyEatsEachFeedingText);

            sum+=gramsPuppyEatsEachFeeding;

        }

        if(sum<=amountOfFoodForPuppyInGrams){

            int difference=amountOfFoodForPuppyInGrams-sum;
            System.out.printf("Food is enough! Leftovers: %d grams.", difference);
        }

        else{
            int difference=sum-amountOfFoodForPuppyInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", difference);
        }
    }
}
