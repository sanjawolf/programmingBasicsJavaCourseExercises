import java.util.Scanner;

public class Zadatak_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String stageOfChampionship = sc.nextLine();
//        “Quarterfinal ”, “Semi-final” or “Final”
        String ticketType = sc.nextLine();
//        “Standard”, “Premium” or “VIP”
        int numberOfTickets = Integer.parseInt(sc.nextLine());
        String photoWithTrophy = sc.nextLine();
//        'Y' (yes) or 'N' (no)

        double pricePerPerson = -1;
        double discount = -1;
        int PRICE_PHOTO_WITH_TROPHY = 40;
        int photoFee = -1;

        switch (ticketType) {

            case "Standard":

                switch (stageOfChampionship) {

                    case "Quarter final":
                        pricePerPerson = 55.50;
                        break;

                    case "Semi final":
                        pricePerPerson = 75.88;
                        break;

                    case "Final":
                        pricePerPerson = 110.10;
                        break;

                    default:
                }
                break;

            case "Premium":

                switch (stageOfChampionship) {

                    case "Quarter final":
                        pricePerPerson = 105.20;
                        break;

                    case "Semi final":
                        pricePerPerson = 125.22;
                        break;

                    case "Final":
                        pricePerPerson = 160.66;
                        break;

                    default:
                }
                break;

            case "VIP":

                switch (stageOfChampionship) {

                    case "Quarter final":
                        pricePerPerson = 118.90;
                        break;

                    case "Semi final":
                        pricePerPerson = 300.40;
                        break;

                    case "Final":
                        pricePerPerson = 400;
                        break;

                    default:
                }
                break;

            default:
        }

        double amountWithoutDiscount = numberOfTickets * pricePerPerson;

        if (amountWithoutDiscount > 4000) {

            discount = 0.25 * amountWithoutDiscount;
            double amount = amountWithoutDiscount - discount;

            if (photoWithTrophy.equals("N")) {

                photoFee = PRICE_PHOTO_WITH_TROPHY * numberOfTickets;
                amount += photoFee;

            }

            System.out.printf("%.2f", amount);



        } else if (amountWithoutDiscount > 2500) {

            discount = 0.1 * amountWithoutDiscount;
            double amount = amountWithoutDiscount - discount;

            if (photoWithTrophy.equals("Y")) {

                photoFee = PRICE_PHOTO_WITH_TROPHY * numberOfTickets;
                amount += photoFee;

            }
            System.out.printf("%.2f", amount);
        } else {

            if (photoWithTrophy.equals("Y")) {

                photoFee = PRICE_PHOTO_WITH_TROPHY * numberOfTickets;
                amountWithoutDiscount += photoFee;

            }

            System.out.printf("%.2f", amountWithoutDiscount);

        }
    }
}
