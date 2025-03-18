import java.util.Scanner;

public class Zadatak_16_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double recordsInSeconds = Double.parseDouble(sc.nextLine());
        double distanceInMeters = Double.parseDouble(sc.nextLine());
        double timeInSecondsOneMeter = Double.parseDouble(sc.nextLine());

        double timeSwimWithoutResistence = distanceInMeters * timeInSecondsOneMeter;

//        System.out.println(timeSwimWithoutResistence);


        double resistence = Math.floor(distanceInMeters / 15);

//        System.out.println(resistence);
        double resistenceTime=resistence * 12.5;
        double timeSwimWithResistence = timeSwimWithoutResistence+resistenceTime;

//        System.out.println(timeSwimWithResistence);

        if(timeSwimWithResistence<recordsInSeconds){

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeSwimWithResistence);
        }

        else{

            double difference=timeSwimWithResistence-recordsInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }

    }
}