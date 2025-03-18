import java.util.Scanner;

public class Zadatak_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String typeOfProjection=sc.nextLine();
        int numberOfRows=Integer.parseInt((sc.nextLine()));
        int numberOfColumns=Integer.parseInt((sc.nextLine()));

        int numberOfChairs=numberOfRows*numberOfColumns;

        double totalTicketRevenue=-1;

        if(typeOfProjection.equals("Premiere")){

            totalTicketRevenue=numberOfChairs*12.00;
            System.out.printf("%.2f", totalTicketRevenue);
        }

        else if(typeOfProjection.equals("Normal")){

            totalTicketRevenue=numberOfChairs*7.50;
            System.out.printf("%.2f", totalTicketRevenue);
        }

        else if(typeOfProjection.equals("Discount")){

            totalTicketRevenue=numberOfChairs*5.00;
            System.out.printf("%.2f", totalTicketRevenue);
        }

        else{


        }
    }
}
