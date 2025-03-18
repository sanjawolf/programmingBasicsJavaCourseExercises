import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(sc.nextLine());
        int initialNumberOfPoints = Integer.parseInt(sc.nextLine());

        int i;
        int winnerPoints = 0;
        int finalistPoints = 0;
        int semifinalistPoints = 0;
        int numberOfWinnerTournaments=0;

        for (i = 1; i <= numberOfTournaments; i++) {

            String reachedTournamentStage = sc.nextLine();

            switch (reachedTournamentStage) {

                case "W":
                    winnerPoints = winnerPoints + 2000;
                    numberOfWinnerTournaments=numberOfWinnerTournaments+1;
                    break;

                case "F":
                    finalistPoints = finalistPoints + 1200;
                    break;

                case "SF":
                    semifinalistPoints = semifinalistPoints + 720;
                    break;

                default:

            }
        }


         int allTheTournamentsPoints=winnerPoints+finalistPoints+semifinalistPoints+initialNumberOfPoints;

        System.out.printf("Final points: %d\n", allTheTournamentsPoints);

        double average=Math.floor((winnerPoints+finalistPoints+semifinalistPoints)/(double)numberOfTournaments);
        System.out.printf("Average points: %.0f\n", average);

        double percentage=(double)numberOfWinnerTournaments/numberOfTournaments*100;
       System.out.printf("%.2f%%", percentage);


    }
}
