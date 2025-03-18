import java.util.Scanner;

public class Zadatak_27_Practice_27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double costs = -1;

        switch (city) {

            case "London":

                switch (product) {

                    case "coffee":
                        costs = quantity * 0.50;
                        break;

                    case "water":
                        costs = quantity * 0.80;
                        break;

                    case "beer":
                        costs = quantity * 1.20;
                        break;

                    case "sweets":
                        costs = quantity * 1.45;
                        break;

                    case "peanuts":
                        costs = quantity * 1.60;
                        break;

                    default:
                }
                break;

            case "Rome":

                switch (product) {

                    case "coffee":
                        costs = quantity * 0.40;
                        break;

                    case "water":
                        costs = quantity * 0.70;
                        break;

                    case "beer":
                        costs = quantity * 1.15;
                        break;

                    case "sweets":
                        costs = quantity * 1.30;
                        break;

                    case "peanuts":
                        costs = quantity * 1.50;
                        break;

                    default:
                }
                break;

            case "Paris":

                switch (product) {

                    case "coffee":
                        costs = quantity * 0.45;
                        break;

                    case "water":
                        costs = quantity * 0.70;
                        break;

                    case "beer":
                        costs = quantity * 1.10;
                        break;

                    case "sweets":
                        costs = quantity * 1.35;
                        break;

                    case "peanuts":
                        costs = quantity * 1.55;
                        break;

                    default:
                }
                break;

            default:

        }

        System.out.println(costs);

    }
}
