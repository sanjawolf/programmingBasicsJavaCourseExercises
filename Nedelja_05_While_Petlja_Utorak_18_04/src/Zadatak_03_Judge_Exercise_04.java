import java.util.Scanner;

public class Zadatak_03_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int WANTED_NUMBER_OF_STEPS = 10000;
        int sum = 0;

        while (true) {

            String stepsText = sc.nextLine();

            if (stepsText.equals("Going home")) {

                int stepsGoingHome = Integer.parseInt(sc.nextLine());
                sum = sum + stepsGoingHome;

                if (sum >= WANTED_NUMBER_OF_STEPS) {

                    int difference = sum - WANTED_NUMBER_OF_STEPS;
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", difference);
                } else {

                    int difference = WANTED_NUMBER_OF_STEPS - sum;
                    System.out.printf("%d more steps to reach goal.", difference);
                }
                return;
            }

            int steps = Integer.parseInt(stepsText);

            sum = sum + steps;

            if (sum >= WANTED_NUMBER_OF_STEPS) {

                int difference = sum - WANTED_NUMBER_OF_STEPS;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", difference);
                break;
            }

        }
    }

}