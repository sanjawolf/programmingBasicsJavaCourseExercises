import java.util.Scanner;

public class Zadatak_93_Practice_93 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfTournaments=Integer.parseInt(sc.nextLine());
        int initialNumberOfPoints=Integer.parseInt(sc.nextLine());

        int W=2000;
        int F=1200;
        int SF=720;

        int counterPoints=0;
        int counterTournaments=0;
        int counterTournamentsWon=0;
        int counterTournamentsFinal=0;
        int counterTournamentsSF=0;

        for(int i=1; i<=numberOfTournaments; i++){

            String reachedTournamentStage=sc.nextLine();

            switch(reachedTournamentStage){

                case "W":
                    counterPoints+=W;
                    counterTournaments++;
                    counterTournamentsWon++;
                    break;

                case "F":
                    counterPoints+=F;
                    counterTournaments++;
                    counterTournamentsFinal++;
                    break;

                case "SF":
                    counterPoints+=SF;
                    counterTournaments++;
                    counterTournamentsSF++;
                    break;

                default:
            }


        }

        int total=counterPoints+initialNumberOfPoints;
        System.out.printf("Final points: %d\n", total);
        double avg=Math.floor((double)counterPoints/counterTournaments);
        System.out.printf("Average points: %.0f\n", avg);
        double percentageWon=100.00*counterTournamentsWon/counterTournaments;
        System.out.printf("%.2f%%", percentageWon);

    }
}
