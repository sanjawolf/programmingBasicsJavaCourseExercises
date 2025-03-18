import java.util.Scanner;

public class Zadatak_75_Practice_75 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String typeOfProjection=sc.nextLine();
        int numberOfRows=Integer.parseInt(sc.nextLine());
        int numberOfColumns=Integer.parseInt(sc.nextLine());
        double price=-1;

        switch(typeOfProjection){

            case "Premiere":
                price=12.00;
                break;

            case "Normal":
                price=7.50;
                break;

            case "Discount":
                price=5.00;
                break;

            default:

        }

        double totalTicketRevenue=numberOfColumns*numberOfRows*price;
        System.out.printf("%.2f", totalTicketRevenue);
    }
}
