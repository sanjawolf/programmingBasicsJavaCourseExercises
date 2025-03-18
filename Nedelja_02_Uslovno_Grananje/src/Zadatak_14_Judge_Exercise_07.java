import java.util.Scanner;

public class Zadatak_14_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double budget=Double.parseDouble(sc.nextLine());
        int numberVideoCards=Integer.parseInt(sc.next());
        int numberCPUs=Integer.parseInt(sc.next());
        int numberRAM=Integer.parseInt(sc.next());

        double videoCard=250;
        double priceVideoCards=numberVideoCards*videoCard;
        double CPU=0.35*priceVideoCards;
        double RAM=0.1*priceVideoCards;

        double finalBill=priceVideoCards+numberCPUs*CPU+numberRAM*RAM;

        if(numberVideoCards>numberCPUs){

            double fBWithDiscount=0.85*finalBill;

            if(budget>=fBWithDiscount){

                double substraction=budget-fBWithDiscount;
                System.out.printf("You have %.2f USD left!", substraction);
            }

            else{
                double substraction=fBWithDiscount-budget;
                System.out.printf("Not enough money! You need %.2f USD more!", substraction);
            }
        }

        else{

            if(budget>=finalBill){

                double substraction=budget-finalBill;
                System.out.printf("You have %.2f USD left!", substraction);
            }

            else{
                double substraction=finalBill-budget;
                System.out.printf("Not enough money! You need %.2f USD more!", substraction);
            }
        }



        }

    }

