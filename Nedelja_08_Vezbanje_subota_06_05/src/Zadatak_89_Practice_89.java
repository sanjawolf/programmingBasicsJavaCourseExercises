import java.util.Scanner;
import java.util.Stack;

public class Zadatak_89_Practice_89 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int groupBudget=Integer.parseInt(sc.nextLine());
        String season=sc.nextLine();
        int numberOfFishermen=Integer.parseInt(sc.nextLine());

        int PRICE_SPRING=3000;
        int PRICE_SUMMER_AUTUMN=4200;
        int PRICE_WINTER=2600;

        int discount=-1;
        double price=-1;
        double discountValue=-1;

        switch(season){

            case "Spring":
                if(numberOfFishermen<=6){

                    discount=10;
                    price=PRICE_SPRING;
                    discountValue=10*price/100.00;
                    price-=discountValue;
                }

                else if(numberOfFishermen<=11){

                    discount=15;
                    price=PRICE_SPRING;
                    discountValue=15*price/100.00;
                   price-=discountValue;
                }

                else{

                    discount=25;
                    price=PRICE_SPRING;
                    discountValue=25*price/100.00;
                    price-=discountValue;
                }
                break;

            case "Summer": case "Autumn":
                if(numberOfFishermen<=6){

                    discount=10;
                    price=PRICE_SUMMER_AUTUMN;
                    discountValue=10*price/100.00;
                    price-=discountValue;
                }

                else if(numberOfFishermen<=11){

                    discount=15;
                    price=PRICE_SUMMER_AUTUMN;
                    discountValue=15*price/100.00;
                    price-=discountValue;
                }

                else{

                    discount=25;
                    price=PRICE_SUMMER_AUTUMN;
                    discountValue=25*price/100.00;
                    price-=discountValue;
                }
                break;

            case "Winter":
                if(numberOfFishermen<=6){

                    discount=10;
                    price=PRICE_WINTER;
                    discountValue=10*price/100.00;
                    price-=discountValue;
                }

                else if(numberOfFishermen<=11){

                    discount=15;
                    price=PRICE_WINTER;
                    discountValue=15*price/100.00;
                    price-=discountValue;
                }

                else{

                    discount=25;
                    price=PRICE_WINTER;
                    discountValue=25*price/100.00;
                    price-=discountValue;
                }
                break;

            default:



        }

        if(numberOfFishermen%2==0 && !(season.equals("Autumn"))){

            discount=5;
            discountValue=5*price/100;
            price-=discountValue;
        }

        if(groupBudget>=price){

            double difference=groupBudget-price;
            System.out.printf("Yes! You have %.2f USD left.", difference);
        }

        else{

            double difference=price-groupBudget;
            System.out.printf("Not enough money! You need %.2f USD.", difference);
        }

    }
}
