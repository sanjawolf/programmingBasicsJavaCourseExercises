import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double priceTrip= Double.parseDouble(sc.nextLine());
        int numberPuzzles=Integer.parseInt(sc.nextLine());
        int numberTalkingDolls=Integer.parseInt(sc.nextLine());
        int numberTeddyBears=Integer.parseInt(sc.nextLine());
        int numberMinions=Integer.parseInt(sc.nextLine());
        int numberTrucks=Integer.parseInt(sc.nextLine());

        double puzzle=2.60;
        double talkingDoll=3;
        double teddyBear=4.10;
        double minion=8.20;
        double truck=2;

        double earn=numberPuzzles*puzzle+numberTalkingDolls*talkingDoll+numberTeddyBears*teddyBear+numberMinions*minion+numberTrucks*truck;
        int numberOfToys=numberPuzzles+numberTalkingDolls+numberTeddyBears+numberMinions+numberTrucks;
        if(numberOfToys>=50){

            double earnDiscountSubstracted=0.75*earn;
            double earnWithoutDiscountRent=0.9*earnDiscountSubstracted;

            if(earnWithoutDiscountRent>=priceTrip){

                double remainingMoney=earnWithoutDiscountRent-priceTrip;
                System.out.printf("Yes! %.2f USD left.", remainingMoney);
            }

            else{
                double remainingMoney=priceTrip-earnWithoutDiscountRent;
                System.out.printf("Not enough money! %.2f USD needed.", remainingMoney);
            }
        }

        else{
            double earnWithoutRent=0.9*earn;

            if(earnWithoutRent>=priceTrip){

                double remainingMoney=earnWithoutRent-priceTrip;
                System.out.printf("Yes! %.2f USD left.", remainingMoney);
            }

            else{
                double remainingMoney=priceTrip-earnWithoutRent;
                System.out.printf("Not enough money! %.2f USD needed.", remainingMoney);
            }

        }




    }
}
