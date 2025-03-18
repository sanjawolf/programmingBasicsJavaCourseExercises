import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hours=Integer.parseInt(sc.nextLine());
        int minutes=Integer.parseInt(sc.nextLine());

        int hInMin=hours*60;
        int time=hInMin+minutes+15;

        int hTime=time/60;
        int mTime=time%60;

        if(minutes>=45 && hours<23 && minutes<55) {
            System.out.printf("%d:0%d", hTime, mTime);
        }
        else if(hours==23 && minutes>=55){
            System.out.printf("0:%d", mTime);
        }

        else if(hours==23 && minutes>=45){

            System.out.printf("0:0%d", mTime);
        }
        else{
            System.out.printf("%d:%d", hTime, mTime);
        }
    }
}
