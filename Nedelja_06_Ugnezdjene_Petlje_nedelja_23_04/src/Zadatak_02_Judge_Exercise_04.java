import java.util.Scanner;

public class Zadatak_02_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        double avg=0;

        int counter=0;

        while(true){

            String presentationName= sc.nextLine();

            if(presentationName.equals("Finish")){

                System.out.printf("Student's final assessment is %.2f.", avg/counter);
                return;
            }

            counter++;

            int i;

            double sum=0;

            for (i=1;i<=n; i++){

                double numberOfGrades=Double.parseDouble(sc.nextLine());

                sum=sum+numberOfGrades;

            }

            double avgEachPresentation=sum/n;
            System.out.printf("%s - %.2f.\n", presentationName, avgEachPresentation);
            avg=avg+avgEachPresentation;

                        }
    }
}
