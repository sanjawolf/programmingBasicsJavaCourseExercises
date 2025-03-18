import java.util.Scanner;

public class Zadatak_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int examTime = Integer.parseInt(sc.nextLine());
        int minuteExam = Integer.parseInt(sc.nextLine());
        int timeArrival = Integer.parseInt(sc.nextLine());
        int minuteArrival = Integer.parseInt(sc.nextLine());

        int examTimeMinutes = examTime * 60 + minuteExam;
        int examTimeArrival = timeArrival * 60 + minuteArrival;
        int hours = -1;
        int minutes = -1;
        int difference = -1;

        if (examTimeMinutes > examTimeArrival && examTimeMinutes - examTimeArrival > 30) {

            System.out.println("early");

            if (examTimeMinutes - examTimeArrival >= 1) {

                difference = examTimeMinutes - examTimeArrival;

                if (examTimeMinutes - examTimeArrival < 60) {
                    System.out.printf("%2d minutes before the start", difference);

                }

                    else{
                        hours = difference / 60;
                        minutes = difference % 60;
                        System.out.printf("%d:%02d hours before the start", hours, minutes);


                    }
                }
            }

            else if (examTimeMinutes < examTimeArrival) {

                System.out.println("late");

                if (examTimeArrival - examTimeMinutes >= 1) {

                    difference = examTimeArrival - examTimeMinutes;

                    if (examTimeArrival - examTimeMinutes >= 60) {

                        hours = difference / 60;
                        minutes = difference % 60;
                        System.out.printf("%d:%02d hours after the start", hours, minutes);

                    } else {

                        System.out.printf("%2d minutes after the start", difference);

                    }

                }
            }

        else {

            difference = examTimeMinutes-examTimeArrival;

            if (difference >= 1) {

                System.out.println("on time");
                System.out.printf("%2d minutes before the start", difference);
            }

           else{

                System.out.println("on time");
            }

        }


        }
    }

