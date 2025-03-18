import java.util.Scanner;

public class Zadatak_56_Practice_56 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hours=Integer.parseInt(sc.nextLine());
        int minutes=Integer.parseInt(sc.nextLine());

        int minutesTotal=hours*60+minutes;
        int minutesTotalLater=minutesTotal+15;
        int hoursLater=minutesTotalLater/60;
        int minutesLater=minutesTotalLater%60;

        if(hours==23 && minutes>=45){

            System.out.printf("0:%02d", minutesLater);
        }

        else{

            System.out.printf("%2d:%02d", hoursLater, minutesLater);
        }
    }
}
