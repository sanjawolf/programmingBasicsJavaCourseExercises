import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int packageOfPens=Integer.parseInt(sc.nextLine());
        int packageOfMarkers=Integer.parseInt(sc.nextLine());
        int litersOfDetergent=Integer.parseInt(sc.nextLine());
        int percentageReduction=Integer.parseInt(sc.nextLine());

        double packageOfPensPrice=5.80;
        double packageOfMarkersPrice=7.20;
        double DetergentPrice=1.20;

        double billDiscountFree=packageOfPens*packageOfPensPrice+packageOfMarkers*packageOfMarkersPrice+litersOfDetergent*DetergentPrice;

        double discount=billDiscountFree*percentageReduction/100;

        double total=billDiscountFree-discount;

        System.out.println(total);


    }
}
