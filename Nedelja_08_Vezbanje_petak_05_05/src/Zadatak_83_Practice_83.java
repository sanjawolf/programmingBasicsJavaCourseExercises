import java.util.Scanner;

public class Zadatak_83_Practice_83 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double PROTECTIVE_NYLON_PER_SQUARE_METER=1.50;
        double PAINT_FOR_LITER=14.50;
        double PAINT_THINNER_FOR_LITER=5.00;

        int requiredAmountOfNylon=Integer.parseInt(sc.nextLine());
        int requiredAmountOfPaint=Integer.parseInt(sc.nextLine());
        int quantityOfDetergent=Integer.parseInt(sc.nextLine());
        int hoursWorkersDoWork=Integer.parseInt(sc.nextLine());

        double costsForMaterial=requiredAmountOfNylon*PROTECTIVE_NYLON_PER_SQUARE_METER+requiredAmountOfPaint*PAINT_FOR_LITER+quantityOfDetergent*PAINT_THINNER_FOR_LITER;
        double additionalCostsForMaterial=PAINT_FOR_LITER*requiredAmountOfPaint*0.1+2*PROTECTIVE_NYLON_PER_SQUARE_METER+0.40;
        double costsForDoingWork=0.3*(costsForMaterial+additionalCostsForMaterial)*hoursWorkersDoWork;
        double total=costsForDoingWork+costsForMaterial+additionalCostsForMaterial;
        System.out.println(total);

    }
}
