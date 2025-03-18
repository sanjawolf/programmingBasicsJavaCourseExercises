import java.util.Scanner;

public class Zadatak_79_Practice_79 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double petersBudget=Double.parseDouble(sc.nextLine());
        int numberOfVideoCards=Integer.parseInt(sc.nextLine());
        int numberOfCPUs=Integer.parseInt(sc.nextLine());
        int numberOfRAM=Integer.parseInt(sc.nextLine());

        double VIDEO_CARD=250;
        double videoCard=numberOfVideoCards*VIDEO_CARD;
        double CPUs=0.35*videoCard;
        double RAM=0.1*videoCard;
        double CPUsTotal=numberOfCPUs*CPUs;
        double RAMTotal=RAM*numberOfRAM;

        double totalWithoutDiscount=videoCard+CPUsTotal+RAMTotal;

        if(numberOfVideoCards>numberOfCPUs){

            double discount=0.15*totalWithoutDiscount;
            double total=totalWithoutDiscount-discount;

            if(total<=petersBudget){

                double budgetLeft=petersBudget-total;

                System.out.printf("You have %.2f USD left!", budgetLeft);
            }

            else {

                double neededSum=total-petersBudget;
                System.out.printf("Not enough money! You need %.2f USD more!", neededSum);
            }



        }

        else {

            if (totalWithoutDiscount <= petersBudget) {

                double budgetLeft = petersBudget - totalWithoutDiscount;

                System.out.printf("You have %.2f USD left!", budgetLeft);
            } else {

                double neededSum = totalWithoutDiscount - petersBudget;
                System.out.printf("Not enough money! You need %.2f USD more!", neededSum);
            }

        }






    }
}
