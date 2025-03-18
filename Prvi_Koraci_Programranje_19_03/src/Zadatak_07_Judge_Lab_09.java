import java.util.Scanner;

public class Zadatak_07_Judge_Lab_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        double squareMetersOfTheLandscaped=Double.parseDouble(sc.nextLine());

        double THE_PRICE_PER_SQUARE_METER=7.61;

        double thePriceForLandscapingTheWholeYard=THE_PRICE_PER_SQUARE_METER*squareMetersOfTheLandscaped;
        double DISCOUNT_OF_THE_TOTAL=18;
        double discountOnTheFinalPrice=thePriceForLandscapingTheWholeYard*DISCOUNT_OF_THE_TOTAL/100;
        double finalPriceOfTheService=thePriceForLandscapingTheWholeYard-discountOnTheFinalPrice;

        System.out.printf("The final price is: %.2f USD.\n", finalPriceOfTheService);
        System.out.printf("The discount is: %.2f USD.", discountOnTheFinalPrice);

    }
}
