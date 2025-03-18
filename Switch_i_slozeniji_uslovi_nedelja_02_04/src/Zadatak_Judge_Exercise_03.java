import java.util.Scanner;

public class Zadatak_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String typeOfFlowers=sc.nextLine();
        int numberOfFlowers=Integer.parseInt(sc.nextLine());
        double budget=Double.parseDouble(sc.nextLine());
        double pricePerRose=5;
        double pricePerDahlia=3.80;
        double pricePerTulip=2.80;
        double pricePerNarcissus=3;
        double pricePerGladiolus=2.50;
        double priceWithDiscount=-1;

        switch(typeOfFlowers){

            case "Roses":
                if(numberOfFlowers>80){

                    priceWithDiscount=0.9*numberOfFlowers*pricePerRose;

                }

                else{

                    priceWithDiscount=numberOfFlowers*pricePerRose;

                }
                break;

            case "Dahlias":
                if(numberOfFlowers>90){

                    priceWithDiscount=0.85*numberOfFlowers*pricePerDahlia;
                }

                else{

                    priceWithDiscount=numberOfFlowers*pricePerDahlia;

                }
                break;

            case "Tulips":
                if(numberOfFlowers>80){

                    priceWithDiscount=0.85*numberOfFlowers*pricePerTulip;
                }

                else{

                    priceWithDiscount=numberOfFlowers*pricePerTulip;

                }
                break;

            case "Narcissus":

                if(numberOfFlowers<120){

                    priceWithDiscount=1.15*numberOfFlowers*pricePerNarcissus;
                }

                else{

                    priceWithDiscount=numberOfFlowers*pricePerNarcissus;

                }
                break;

            case "Gladiolus":

                if(numberOfFlowers<80){

                    priceWithDiscount=1.2*numberOfFlowers*pricePerGladiolus;
                }

                else{

                    priceWithDiscount=numberOfFlowers*pricePerGladiolus;

                }
                break;

            default:


        }

        double remainingAmount=-1;

        if(priceWithDiscount<=budget){

            remainingAmount=budget-priceWithDiscount;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.", numberOfFlowers, typeOfFlowers, remainingAmount);

        }

        else {

            remainingAmount=priceWithDiscount-budget;
            System.out.printf("Not enough money, you need %.2f USD more.", remainingAmount);

        }
    }
}
