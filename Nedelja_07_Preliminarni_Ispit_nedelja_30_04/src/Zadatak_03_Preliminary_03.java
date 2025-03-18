import java.util.Scanner;

public class Zadatak_03_Preliminary_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPeople=Integer.parseInt(sc.nextLine());
        String season=sc.nextLine();

        double pricePerPerson=-1;


        if(numberOfPeople<=5) {

            switch (season) {

                case "spring":
                    pricePerPerson = 50.00;
                    break;

                case "summer":
                    pricePerPerson = 48.50;
                    double discountSummer = 0.15 * pricePerPerson;
                    pricePerPerson = pricePerPerson - discountSummer;
                    break;

                case "autumn":
                    pricePerPerson = 60.00;
                    break;

                case "winter":
                    pricePerPerson = 86.00;
                    double increaseWinter = 0.08 * pricePerPerson;
                    pricePerPerson = pricePerPerson + increaseWinter;
                    break;

                default:

            }

        }

        else{

            switch(season){

                case "spring":
                    pricePerPerson=48.00;
                    break;

                case "summer":
                    pricePerPerson=45.00;
                    double discountSummer=0.15*pricePerPerson;
                    pricePerPerson=pricePerPerson-discountSummer;
                    break;

                case "autumn":
                    pricePerPerson=49.50;
                    break;

                case "winter":
                    pricePerPerson=85.00;
                    double increaseWinter=0.08*pricePerPerson;
                    pricePerPerson=pricePerPerson+increaseWinter;
                    break;

                default:
                }
        }

        double price=numberOfPeople*pricePerPerson;
        System.out.printf("%.2f USD.", price);

    }
}
