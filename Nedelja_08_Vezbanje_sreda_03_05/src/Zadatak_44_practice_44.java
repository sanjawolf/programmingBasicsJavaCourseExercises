import java.util.Scanner;

public class Zadatak_44_practice_44 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int athleteOne=Integer.parseInt(sc.nextLine());
        int athleteTwo=Integer.parseInt(sc.nextLine());
        int athleteThree=Integer.parseInt(sc.nextLine());

        int timeTotal=athleteOne+athleteTwo+athleteThree;

        int minutes=timeTotal/60;
        int seconds=timeTotal%60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
