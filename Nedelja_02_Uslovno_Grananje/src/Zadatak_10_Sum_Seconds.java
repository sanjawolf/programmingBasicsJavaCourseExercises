import java.util.Scanner;

public class Zadatak_10_Sum_Seconds {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int timeOne=Integer.parseInt(sc.nextLine());
        int timeTwo=Integer.parseInt(sc.nextLine());
        int timeThree=Integer.parseInt(sc.nextLine());

        int time=timeOne+timeTwo+timeThree;
        int minutes=time/60;
        int seconds=time%60;

        if(seconds<10){

            System.out.printf("%d:0%d", minutes, seconds);
        }

        else{

            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
