import java.util.Scanner;

public class Zadatak_78_Practice_78 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int packageOfPens=Integer.parseInt(sc.nextLine());
        int packageOfMarkers=Integer.parseInt(sc.nextLine());
        int litersOfDetergent=Integer.parseInt(sc.nextLine());
        int percentageReduction=Integer.parseInt(sc.nextLine());

        double PACKAGE_OF_PENS=5.80;
        double PACKAGE_OF_MARKERS=7.20;
        double DETERGENT=1.20;

        double total=packageOfPens*PACKAGE_OF_PENS+packageOfMarkers*PACKAGE_OF_MARKERS+litersOfDetergent*DETERGENT;
        double totalReduced=(1-(double)percentageReduction/100)*total;
        System.out.println(totalReduced);

    }
}
