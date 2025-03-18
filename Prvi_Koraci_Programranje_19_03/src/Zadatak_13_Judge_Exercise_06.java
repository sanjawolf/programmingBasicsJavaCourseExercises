import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int requiredAmountOfNylon=Integer.parseInt(sc.nextLine());
        int requiredAmountOfPaint=Integer.parseInt(sc.nextLine());
        int quantityOfDetergent=Integer.parseInt(sc.nextLine());
        int hoursWorkersDoWork=Integer.parseInt(sc.nextLine());

        double nylon=1.50;
        double paint=14.50;
        double paintThinner=5.00;
        double bags=0.40;

        double paintPrice=requiredAmountOfPaint*paint;

        double addition=10*paintPrice/100+2*nylon+bags;

        double allCostsForMaterials=requiredAmountOfNylon*nylon+requiredAmountOfPaint*paint+quantityOfDetergent*paintThinner+addition;
        double totalSumOfAllCosts=allCostsForMaterials+30*allCostsForMaterials*hoursWorkersDoWork/100;

        System.out.printf("%.2f", totalSumOfAllCosts);



    }
}
