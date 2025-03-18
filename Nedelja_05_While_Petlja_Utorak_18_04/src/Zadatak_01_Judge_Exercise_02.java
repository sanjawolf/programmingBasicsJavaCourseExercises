import java.util.Scanner;

public class Zadatak_01_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int numberUnsatisfactoryGrades=Integer.parseInt(sc.nextLine());

        int numberOfUnsatisfactoryGrades=0;
        int numberOfProblems=0;
        double sum=0;
        String followingTask="";

        while(true){

            String taskName=sc.nextLine();

            if(taskName.equals("Enough")){

                break;
            }

            int grade=Integer.parseInt(sc.nextLine());

            if(grade<=4){

                numberOfUnsatisfactoryGrades++;

                if(numberUnsatisfactoryGrades==numberOfUnsatisfactoryGrades){

                    System.out.printf("You need a break, %d poor grades.", numberOfUnsatisfactoryGrades);
                    return;
                }

            }

            sum=sum+grade;
            numberOfProblems++;
            followingTask=taskName;

        }

        double avg=sum/numberOfProblems;
        System.out.printf("Average score: %.2f\n", avg);
        System.out.printf("Number of problems: %d\n", numberOfProblems);
        System.out.printf("Last problem: %s", followingTask);

    }
}
