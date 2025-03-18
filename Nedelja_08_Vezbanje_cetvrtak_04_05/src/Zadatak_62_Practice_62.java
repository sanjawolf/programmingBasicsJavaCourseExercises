import java.util.Scanner;

public class Zadatak_62_Practice_62 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double PUZZLE=2.60;
        double TALKING_DOLL=3;
        double TEDDY_BEAR=4.10;
        double MINION=8.20;
        double TRUCK=2;

        double priceOfTrip=Double.parseDouble(sc.nextLine());
        int numberOfPuzzles=Integer.parseInt(sc.nextLine());
        int numberOfTalkingDolls=Integer.parseInt(sc.nextLine());
        int numberOfTeddyBears=Integer.parseInt(sc.nextLine());
        int numberOfMinions=Integer.parseInt(sc.nextLine());
        int numberOfTrucks=Integer.parseInt(sc.nextLine());

        int numberOfOrderedToys=numberOfPuzzles+numberOfTalkingDolls+numberOfTeddyBears+numberOfMinions+numberOfTrucks;
        double totalPrice=numberOfPuzzles*PUZZLE+numberOfTalkingDolls*TALKING_DOLL+numberOfTeddyBears*TEDDY_BEAR+numberOfMinions*MINION+numberOfTrucks*TRUCK;

        if(numberOfOrderedToys>=50){

            double discount=0.25*totalPrice;
            totalPrice=totalPrice-discount;
        }

        double rent=0.1*totalPrice;
        double totalPriceWithRent=totalPrice-rent;

        if(priceOfTrip<=totalPriceWithRent){

            double difference=totalPriceWithRent-priceOfTrip;
            System.out.printf("Yes! %.2f USD left.", difference);
        }

        else{
            double difference=priceOfTrip-totalPriceWithRent;
            System.out.printf("Not enough money! %.2f USD needed.", difference);
        }


    }
}
