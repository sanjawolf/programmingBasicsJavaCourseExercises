import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfGroups=Integer.parseInt(sc.nextLine());
        int i;
        int counterBelow5=0;
        int counterBetween6And12=0;
        int counterBetween13And25=0;
        int counterBetween26And40=0;
        int counterAbove40=0;

        for(i=1; i<=numberOfGroups; i++) {

            int numberOfClimbersForEachGroup = Integer.parseInt(sc.nextLine());

            if (numberOfClimbersForEachGroup <= 5) {

                counterBelow5 = counterBelow5 + numberOfClimbersForEachGroup;

            } else if (numberOfClimbersForEachGroup <= 12) {

                counterBetween6And12 = counterBetween6And12 + numberOfClimbersForEachGroup;
            } else if (numberOfClimbersForEachGroup <= 25) {

                counterBetween13And25 = counterBetween13And25 + numberOfClimbersForEachGroup;
            } else if (numberOfClimbersForEachGroup <= 40) {

                counterBetween26And40 = counterBetween26And40 + numberOfClimbersForEachGroup;

            } else {

                counterAbove40 = counterAbove40 + numberOfClimbersForEachGroup;

            }
        }

            int numberOfClimbers=counterBelow5+counterBetween6And12+counterBetween13And25+counterBetween26And40+counterAbove40;

            double percentage1=counterBelow5*100.00/numberOfClimbers;
            double percentage2=counterBetween6And12*100.00/numberOfClimbers;
            double percentage3=counterBetween13And25*100.00/numberOfClimbers;
            double percentage4=counterBetween26And40*100.00/numberOfClimbers;
            double percentage5=counterAbove40*100.00/numberOfClimbers;

            System.out.printf("%.2f%%\n", percentage1);
            System.out.printf("%.2f%%\n", percentage2);
            System.out.printf("%.2f%%\n", percentage3);
            System.out.printf("%.2f%%\n", percentage4);
            System.out.printf("%.2f%%", percentage5);
        }





    }

