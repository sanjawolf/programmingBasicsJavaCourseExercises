import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double priceForOneTennisRacket=Double.parseDouble(sc.nextLine());
        int numberOfTennisRackets=Integer.parseInt(sc.nextLine());
        int pairsOfSneakers=Integer.parseInt(sc.nextLine());

        double priceForPairOfSneakers=priceForOneTennisRacket/6;
        double priceForRacketsAndSneakers=numberOfTennisRackets*priceForOneTennisRacket+pairsOfSneakers*priceForPairOfSneakers;
        double otherEquipment=20*priceForRacketsAndSneakers/100;
        double finalPrice=priceForRacketsAndSneakers+otherEquipment;

        double priceHasToPayNovak=Math.floor(finalPrice/8);
        double priceHasToPaySponsors=Math.ceil(7*finalPrice/8);
        System.out.printf("Price to be paid by Djokovic %.0f\n", priceHasToPayNovak);
        System.out.printf("Price to be paid by sponsors %.0f", priceHasToPaySponsors);

    }



}
