import java.util.Scanner;

public class Zadatak_71_Practice_71 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sum=0;
        int GOAL_STEPS=10000;

        while(true){

            String numberOfStepsText=sc.nextLine();

            if(numberOfStepsText.equals("Going home")){

                int numberOfSteps=Integer.parseInt(sc.nextLine());
                sum+=numberOfSteps;
                break;
            }

            int numberOfSteps=Integer.parseInt(numberOfStepsText);

            sum+=numberOfSteps;

            if(sum>=GOAL_STEPS){

                break;
            }







        }

        if(sum>=GOAL_STEPS){

            int difference=sum-GOAL_STEPS;
            System.out.println("Goal reached! Good job!" );
            System.out.printf("%d steps over the goal!", difference);
        }

        else{

            int difference=GOAL_STEPS-sum;
            System.out.printf("%d more steps to reach goal.", difference);
        }
    }
}
