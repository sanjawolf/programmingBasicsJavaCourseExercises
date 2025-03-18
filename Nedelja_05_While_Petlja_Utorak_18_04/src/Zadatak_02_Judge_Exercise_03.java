import java.util.Scanner;

public class Zadatak_02_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double moneyNeededForTrip = Double.parseDouble(sc.nextLine());
        double cash = Double.parseDouble(sc.nextLine());

        int counterOfDays = 0;
        int counterOfConsecutiveDays=0;

        while (true) {

            String action = sc.nextLine();
            double amountSaveSpend = Double.parseDouble(sc.nextLine());

            counterOfDays++;

            if (action.equals("spend")) {

                counterOfConsecutiveDays++;

                moneyNeededForTrip = moneyNeededForTrip - amountSaveSpend;

                if (moneyNeededForTrip < 0) {

                    moneyNeededForTrip = 0;
                }

            } else {

                moneyNeededForTrip = moneyNeededForTrip + amountSaveSpend;
                counterOfConsecutiveDays=0;

            }

            if (counterOfConsecutiveDays == 5) {

                System.out.println("You can't save the money.");
                System.out.printf("%d\n", counterOfDays);
                return;

            }

            if (moneyNeededForTrip <= cash){

                break;

            }

                }

            System.out.printf("You saved the money for %d days.", counterOfDays);

        }

    }


