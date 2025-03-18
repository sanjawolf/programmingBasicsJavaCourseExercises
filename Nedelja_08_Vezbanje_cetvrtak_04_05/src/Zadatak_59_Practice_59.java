import java.util.Scanner;

public class Zadatak_59_Practice_59 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int specifiedNumberOfUnsatisfactoryGrades=Integer.parseInt(sc.nextLine());
        int numberOfUnsatisfactoryGrades=0;
        int numberOfSatisfactoryGrades=0;
        int numberOfGrades=0;
        int sumOfGrades=0;
        String followingTask="";

        while(true){

            String taskName=sc.nextLine();

            if(taskName.equals("Enough")){

                double avg=(double)sumOfGrades/numberOfGrades;
                System.out.printf("Average score: %.2f\n", avg);
                System.out.printf("Number of problems: %d\n", numberOfGrades);
                System.out.printf("Last problem: %s", followingTask);
                return;
            }

           int grade=Integer.parseInt(sc.nextLine());

            if(grade<=4){

                numberOfUnsatisfactoryGrades++;

                if(numberOfUnsatisfactoryGrades==specifiedNumberOfUnsatisfactoryGrades){

                    break;
                }
            }

            else{

                numberOfSatisfactoryGrades++;
            }

            numberOfGrades++;
            sumOfGrades+=grade;
            followingTask=taskName;

        }

        System.out.printf("You need a break, %d poor grades.", numberOfUnsatisfactoryGrades);
    }
}
