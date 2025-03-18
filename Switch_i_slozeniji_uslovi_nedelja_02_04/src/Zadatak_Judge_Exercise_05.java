import java.util.Scanner;

public class Zadatak_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String holiday = " ";
        String destination = " ";
        double price = -1;

        switch (season) {

            case "summer":

                if (budget <= 1000) {

                    price = 0.4 * budget;
                    destination = "Europe";
                    holiday = "Hotel";

                }

                if (budget <= 100) {

                    price = 0.3 * budget;
                    destination = "Serbia";
                    holiday = "Camp";

                }

                if (budget > 1000) {

                    price = 0.9 * budget;
                    destination = "USA";
                    holiday = "Camp";

                }

        break;

        case "winter":

        if (budget <= 1000) {

            price = 0.8 * budget;
            destination = "Europe";
            holiday = "Hotel";

        }

        if (budget <= 100) {

            price = 0.7 * budget;
            destination = "Serbia";
            holiday = "Hotel";
        }

        if (budget > 1000) {

            price = 0.9 * budget;
            destination = "USA";
            holiday = "Hotel";

        }

        break;

        default:

            holiday = "Hotel";
            destination = "Europe";

    }


        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", holiday, price);

    }

    }
