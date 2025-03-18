import java.util.Scanner;

public class Zadatak_06_Preliminary_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int gamesWon=0;
        int gamesLost=0;
        int totalGamesPlayed=0;

        while(true){

            String tournamentName=sc.nextLine();

            if(tournamentName.equals("End of tournaments")){


                break;
            }

            int numberOfGamesForEachTournament=Integer.parseInt(sc.nextLine());
            int i;
            totalGamesPlayed += numberOfGamesForEachTournament;

            for(i=1; i<=numberOfGamesForEachTournament; i++){

                int darcysTeamPoints=Integer.parseInt(sc.nextLine());
                int oppositeTeamPoints=Integer.parseInt(sc.nextLine());

                if(darcysTeamPoints>oppositeTeamPoints){

                    gamesWon++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournamentName, darcysTeamPoints-oppositeTeamPoints);
                }

                else{

                    gamesLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournamentName, oppositeTeamPoints-darcysTeamPoints);
                }

            }

            

                    }

        double percentageGamesWon=100.00*gamesWon/totalGamesPlayed;
        System.out.printf("%.2f%% matches win", percentageGamesWon);
        double percentageGamesLost=100.00*gamesLost/totalGamesPlayed;
        System.out.printf("%.2f%% matches win", percentageGamesLost);

    }
}
