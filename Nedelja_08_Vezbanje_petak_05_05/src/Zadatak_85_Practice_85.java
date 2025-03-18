import java.util.Scanner;

public class Zadatak_85_Practice_85 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String typeOfFlowers=sc.nextLine();
//        "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int numberOfFlowers=Integer.parseInt(sc.nextLine());
        int budget=Integer.parseInt(sc.nextLine());

        double ROSES=5;
        double DAHLIAS=3.80;
        double TULIPS=2.80;
        double NARCISSUS=3;
        double GLADIOLUS=2.5;

        int percent=-1;
        double price=-1;
        double costs=-1;

        switch(typeOfFlowers){

            case "Roses":

                if(numberOfFlowers>80){

                    percent=10;
                    price=ROSES*numberOfFlowers;
                    double discount=percent*price/100;
                    costs=price-discount;

                }

                else{

                    costs=ROSES*numberOfFlowers;

                }
                break;

            case "Dahlias":

                if(numberOfFlowers>90){

                    percent=15;
                    price=DAHLIAS*numberOfFlowers;
                    double discount=percent*price/100;
                    costs=price-discount;

                }

                else{

                    costs=DAHLIAS*numberOfFlowers;
                }
                break;

            case "Tulips":

                if(numberOfFlowers>80){

                    percent=15;
                    price=TULIPS*numberOfFlowers;
                    double discount=percent*price/100;
                    costs=price-discount;

                }

                else{

                    costs=TULIPS*numberOfFlowers;
                }
                break;

            case  "Narcissus":

                if(numberOfFlowers<120){

                    percent=15;
                    price=NARCISSUS*numberOfFlowers;
                    double increase=percent*price/100;
                    costs=price+increase;

                }

                else{

                    costs=NARCISSUS*numberOfFlowers;
                }

            break;

            case "Gladiolus":

                if(numberOfFlowers<80){

                    percent=20;
                    price=GLADIOLUS*numberOfFlowers;
                    double increase=percent*price/100;
                    costs=price+increase;

                }

                else{

                    costs=GLADIOLUS*numberOfFlowers;

                }
                break;

            default:



        }







        if(budget>=costs){

            double difference=budget-costs;

            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.", numberOfFlowers, typeOfFlowers, difference);

        }

        else{

            double difference=costs-budget;
            System.out.printf("Not enough money, you need %.2f USD more.", difference);
        }


    }
}
