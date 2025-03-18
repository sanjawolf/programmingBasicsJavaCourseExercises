import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int controlMinutes=Integer.parseInt(sc.nextLine());
        int secondsFoControl=Integer.parseInt(sc.nextLine());
        double lengthOfChuteInMeters=Double.parseDouble(sc.nextLine());
        int secondsFor100Meters=Integer.parseInt(sc.nextLine());

        int controlTime=controlMinutes*60+secondsFoControl;
        double needTimeForWholePathWithoutSlope=lengthOfChuteInMeters*secondsFor100Meters/100;
        double slope=lengthOfChuteInMeters/120*2.5;
        double needTimeForWholePath=needTimeForWholePathWithoutSlope-slope;

        if(needTimeForWholePath<=controlTime){

            System.out.println("Malcolm Davidson won an Olympic quota!");
            System.out.printf("His time is %.3f.", needTimeForWholePath);
        }

        else{

            double difference=needTimeForWholePath-controlTime;
            System.out.printf("No, Malcolm failed! He was %.3f second slower.", difference);
        }



    }
}
