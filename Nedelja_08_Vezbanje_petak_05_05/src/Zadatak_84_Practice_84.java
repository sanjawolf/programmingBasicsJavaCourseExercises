import java.util.Scanner;

public class Zadatak_84_Practice_84 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nameOfSeries=sc.nextLine();
        int episodeDuration=Integer.parseInt(sc.nextLine());
        int durationOfBreak=Integer.parseInt(sc.nextLine());

        double lunchtime=durationOfBreak/8.00;
        double restTime=durationOfBreak/4.00;

        double timeForEpisode=durationOfBreak-lunchtime-restTime;

        if(timeForEpisode>=episodeDuration){

            double difference=Math.ceil(timeForEpisode-episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSeries, difference);
        }

        else{

            double difference=Math.ceil(episodeDuration-timeForEpisode);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfSeries, difference);
        }

    }
}
