import java.util.Scanner;

public class Zadatak_02_Preliminary_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double recordInSeconds=Double.parseDouble(sc.nextLine());
        double distanceInMeters=Double.parseDouble(sc.nextLine());
        double timeForClimbingMeterSeconds=Double.parseDouble(sc.nextLine());

        int slope=(int)distanceInMeters/50*30;
        double timeInSeconds=distanceInMeters*timeForClimbingMeterSeconds+slope;

        if(recordInSeconds>timeInSeconds){

            System.out.printf("Yes! The new record is %.2f seconds.", timeInSeconds);
        }

        else{

            double difference=timeInSeconds-recordInSeconds;
            System.out.printf("No! He was %.2f seconds slower.", difference);
        }

    }
}
