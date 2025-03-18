import java.util.Scanner;

public class Zadatak_02_Judge_Exam_Preparation_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double budget=Double.parseDouble(sc.nextLine());
        int numberOfNights=Integer.parseInt(sc.nextLine());
        double pricePerNight=Double.parseDouble(sc.nextLine());
        int percentageForAdditionalCosts=Integer.parseInt(sc.nextLine());

        if(numberOfNights>7){

            pricePerNight=0.95*pricePerNight;

        }

        double additionalCosts=percentageForAdditionalCosts*budget/100;
        double price=numberOfNights*pricePerNight+additionalCosts;

        if(budget>=price){

            double remainingMoney=budget-price;
            System.out.printf("Smiths will be left with %.2f USD after vacation.", remainingMoney);
        }

        else{

            double remainingMoney=price-budget;
            System.out.printf("%.2f USD needed.", remainingMoney);
        }



    }
}
