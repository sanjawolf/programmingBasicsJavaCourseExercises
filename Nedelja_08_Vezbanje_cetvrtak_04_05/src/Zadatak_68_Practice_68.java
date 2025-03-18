import java.util.Scanner;

public class Zadatak_68_Practice_68 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double movieBudget=Double.parseDouble(sc.nextLine());
        int numberOfExtras=Integer.parseInt(sc.nextLine());
        double priceForClothingOfOneExtra=Double.parseDouble(sc.nextLine());

        double setForFilm=0.1*movieBudget;

        if(numberOfExtras>150){

            double priceForClothingWithoutDis=numberOfExtras*priceForClothingOfOneExtra;
            double discount=0.1*priceForClothingWithoutDis;
            double priceForClothing=priceForClothingWithoutDis-discount;

            double priceTotal=setForFilm+priceForClothing;

            if(priceTotal>movieBudget){

                double difference=priceTotal-movieBudget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", difference);

            }

            else{

                double difference=movieBudget-priceTotal;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.", difference);
            }
        }

        else{

            double priceForClothingWithoutDis=numberOfExtras*priceForClothingOfOneExtra;

            double priceTotal=setForFilm+priceForClothingWithoutDis;

            if(priceTotal>movieBudget){

                double difference=priceTotal-movieBudget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", difference);

            }

            else{

                double difference=movieBudget-priceTotal;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.", difference);
            }
        }



    }
}
