import java.util.Scanner;

public class Zadatak_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int groupBudget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int numberOfFishermen = Integer.parseInt(sc.nextLine());

        double rentingSpring = 3000;
        double rentingSummerAutumn = 4200;
        double rentingWinter = 2600;
        double price = -1;
        double wholePrice = -1;
        double additionalPercent = 0.05;


        if (season.equals("Spring")) {

            price = rentingSpring;

            if (numberOfFishermen <= 6) {

                double percent = 0.1;
                double discount = price * percent;
                wholePrice = price - discount;
            } else if (numberOfFishermen <= 11 && numberOfFishermen > 7) {

                double percent = 0.15;
                double discount = price * percent;
                wholePrice = price - discount;
            } else {

                double percent = 0.25;
                double discount = price * percent;
                wholePrice = price - discount;
            }

        }

        if (season.equals("Summer")) {

            price = rentingSummerAutumn;

            if (numberOfFishermen <= 6) {

                double percent = 0.1;
                double discount = price * percent;
                wholePrice = price - discount;
            } else if (numberOfFishermen <= 11 && numberOfFishermen > 7) {

                double percent = 0.15;
                double discount = price * percent;
                wholePrice = price - discount;
            } else {

                double percent = 0.25;
                double discount = price * percent;
                wholePrice = price - discount;
            }

        }

        if (season.equals("Autumn")) {

            price = rentingSummerAutumn;

            if (numberOfFishermen <= 6) {

                double percent = 0.1;
                double discount = price * percent;
                wholePrice = price - discount;
            } else if (numberOfFishermen <= 11 && numberOfFishermen > 7) {

                double percent = 0.15;
                double discount = price * percent;
                wholePrice = price - discount;
            } else {

                double percent = 0.25;
                double discount = price * percent;
                wholePrice = price - discount;
            }

        }

        if (season.equals("Winter")) {

            price = rentingWinter;

            if (numberOfFishermen <= 6) {

                double percent = 0.1;
                double discount = price * percent;
                wholePrice = price - discount;
            } else if (numberOfFishermen <= 11 && numberOfFishermen > 7) {

                double percent = 0.15;
                double discount = price * percent;
                wholePrice = price - discount;
            } else {

                double percent = 0.25;
                double discount = price * percent;
                wholePrice = price - discount;
            }

        }

        if(numberOfFishermen % 2 == 0 && !(season.equals("Autumn"))){

            wholePrice=(1-additionalPercent)*wholePrice;

        }

        if (groupBudget >= wholePrice) {

            double moneyLeft = groupBudget - wholePrice;
            System.out.printf("Yes! You have %.2f USD left.", moneyLeft);
        } else {

            double moneyLeft = wholePrice - groupBudget;
            System.out.printf("Not enough money! You need %.2f USD.", moneyLeft);


        }
    }
}
