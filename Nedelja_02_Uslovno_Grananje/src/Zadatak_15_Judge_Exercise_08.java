import java.util.Scanner;

public class Zadatak_15_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nameSeries=sc.nextLine();
        int episodeDuration=Integer.parseInt(sc.nextLine());
        int durationBreak=Integer.parseInt(sc.nextLine());

        double lunchTime=durationBreak/8.0;
        double restTime=durationBreak/4.0;
        double freeTime=durationBreak-lunchTime-restTime;

        if(episodeDuration<=freeTime){

            double left=Math.ceil(freeTime-episodeDuration);

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSeries, left);
        }

        else
        {
            double left=Math.ceil(episodeDuration-freeTime);

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSeries, left);
        }



    }
}
