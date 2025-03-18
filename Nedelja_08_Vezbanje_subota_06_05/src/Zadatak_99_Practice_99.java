import java.util.Scanner;

public class Zadatak_99_Practice_99 {

    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);


        int gamesWon = 0;
        int gamesLost = 0;
        int totalGamesPlayed = 0;
        int gamesCounter = 0;

        while (true) {
            String tournamentName = scr.nextLine();
            if (tournamentName.equals("End of tournaments")) {
                break;
            }
            int numberOfGames = Integer.parseInt(scr.nextLine());
            totalGamesPlayed += numberOfGames;
            for (int i = 1; i <= numberOfGames; i++) {
                int darcyPoints = Integer.parseInt(scr.nextLine());
                int opposingPoints = Integer.parseInt(scr.nextLine());

                int pointsDiffDarcyWin = darcyPoints - opposingPoints;
                if (darcyPoints > opposingPoints) {
                    gamesWon++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournamentName, pointsDiffDarcyWin);
                } else {
                    int pointsDiffDarcyLose = opposingPoints - darcyPoints;
                    gamesLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournamentName, pointsDiffDarcyLose);
                }
            }
        }

        double winPercentage = (double) gamesWon / totalGamesPlayed * 100;
        double lossPercentage = (double) gamesLost / totalGamesPlayed * 100;
        System.out.printf("%.2f%% matches win\n", winPercentage);
        System.out.printf("%.2f%% matches lost", lossPercentage);

//        int gamesWon=0;
//        int gamesLost=0;
//        int totalGamesPlayed=0;
//
//        while(true){
//
//            String tournamentName=sc.nextLine();
//
//            if(tournamentName.equals("End of tournaments")) break;
//
//                int numberOfGames=Integer.parseInt(sc.nextLine());
//                totalGamesPlayed += numberOfGames;
//
//                for(int i=1; i<=numberOfGames; i++){
//
//                    int pointsDarcysTeam=Integer.parseInt(sc.nextLine());
//                    int pointsOpposingTeam=Integer.parseInt(sc.nextLine());
//                    if(pointsDarcysTeam>pointsOpposingTeam){
//
//                        gamesWon++;
//                        System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournamentName, pointsDarcysTeam-pointsOpposingTeam);
//                    }
//
//                    if(pointsDarcysTeam<pointsOpposingTeam){
//
//                        gamesLost++;
//                        System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournamentName, pointsOpposingTeam-pointsDarcysTeam);
//                    }
//
//                }
//
//            }
//        double percentageGamesWon=100.00*gamesWon/totalGamesPlayed;
//        System.out.printf("%.2f%% matches win\n", percentageGamesWon);
//        double percentageGamesLost=100.00*gamesLost/totalGamesPlayed;
//        System.out.printf("%.2f%% matches win", percentageGamesLost);
        }
    }

