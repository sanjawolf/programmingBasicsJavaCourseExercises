import java.util.Scanner;

public class Zadatak_81_Practice_81 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int lilysAge=Integer.parseInt(sc.nextLine());
        double priceOfWashingMachine=Double.parseDouble(sc.nextLine());
        double singlePriceOfToy=Integer.parseInt(sc.nextLine());
        double money=0;
        double moneyFromToys=0;

        for(int i=1; i<=lilysAge; i++){

            if(i%2==0){

                money+=10*i/2-1;

            }

            else{

                moneyFromToys+=singlePriceOfToy;
            }


        }

        double moneyTotal=money+moneyFromToys;

        if(moneyTotal>=priceOfWashingMachine) {

            double difference = moneyTotal - priceOfWashingMachine;

            System.out.printf("Yes! %.2f", difference);

        }

        else{

            double difference = priceOfWashingMachine-moneyTotal;

            System.out.printf("No! %.2f", difference);
        }

    }
}
