import java.util.Scanner;

public class Zadatak_97_Practice_97 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hoursExam=Integer.parseInt(sc.nextLine());
        int minutesExam=Integer.parseInt(sc.nextLine());
        int hoursArrival=Integer.parseInt(sc.nextLine());
        int minutesArrival=Integer.parseInt(sc.nextLine());

        int minutesExamTotal=hoursExam*60+minutesExam;
        int minutesArrivalTotal=hoursArrival*60+minutesArrival;

        if(minutesArrivalTotal-minutesExamTotal>0){

            System.out.println("Late");
        }

        if(minutesExamTotal-minutesArrivalTotal<=30 && minutesExamTotal-minutesArrivalTotal>=0){

            System.out.println("On time");
        }

        if(minutesExamTotal-minutesArrivalTotal>30){

            System.out.println("Early");
        }

        if(Math.abs(minutesExamTotal-minutesArrivalTotal)>=1){

            if(minutesExamTotal-minutesArrivalTotal<60 && minutesExamTotal-minutesArrivalTotal>0){

                System.out.printf("%2d minutes before the start", minutesExamTotal-minutesArrivalTotal);
            }

            if(minutesExamTotal-minutesArrivalTotal>=60){

                int hoursDiff=(minutesExamTotal-minutesArrivalTotal)/60;
                int minutesDiff=(minutesExamTotal-minutesArrivalTotal)%60;
                System.out.printf("%2d:%02d hours before the start", hoursDiff, minutesDiff);
            }

            if(minutesArrivalTotal-minutesExamTotal<60 && minutesArrivalTotal-minutesExamTotal>0){

                System.out.printf("%2d minutes after the start", minutesArrivalTotal-minutesExamTotal);
            }

            if(minutesArrivalTotal-minutesExamTotal>=60){

                int hoursDiff=(minutesArrivalTotal-minutesExamTotal)/60;
                int minutesDiff=(minutesArrivalTotal-minutesExamTotal)%60;
                System.out.printf("%2d:%02d hours after the start", hoursDiff, minutesDiff);
            }


        }



    }
}
