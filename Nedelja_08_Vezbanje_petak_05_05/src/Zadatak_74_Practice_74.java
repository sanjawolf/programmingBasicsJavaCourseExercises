import java.util.Scanner;

public class Zadatak_74_Practice_74 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double recordsInSeconds =Double.parseDouble(sc.nextLine());
        double distanceInMeters=Double.parseDouble(sc.nextLine());
        double timeInSecondsSwimsOneMeter=Double.parseDouble(sc.nextLine());

        double timeInSecondsSwimsDistance=distanceInMeters*timeInSecondsSwimsOneMeter;
        double slow=Math.floor(distanceInMeters/15)*12.5;
        double timeInSecondsSwimsDistanceWithSLow=timeInSecondsSwimsDistance+slow;

        if(recordsInSeconds>timeInSecondsSwimsDistanceWithSLow){

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeInSecondsSwimsDistanceWithSLow);
        }

        else{

            double difference=timeInSecondsSwimsDistanceWithSLow-recordsInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }

    }
}
