import java.util.Scanner;

public class Zadatak_49_Practice_49 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double squareMetersOfLandscaped=Double.parseDouble(sc.nextLine());
        double PRICE_PER_SQUARE_METER=7.61;

        double priceWithoutDiscount=squareMetersOfLandscaped*PRICE_PER_SQUARE_METER;
        double discount=0.18*priceWithoutDiscount;
        double priceWithDiscount=priceWithoutDiscount-discount;

        System.out.printf("The final price is: %.2f USD.\n", priceWithDiscount);
        System.out.printf("The discount is: %.2f USD.", discount);


    }
}
