import java.util.Scanner;

public class Zadatak_60_Practice_60 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int numberOfPresentations=0;
        double sumOfGrades=0;
        double sumAvg=0;

        while(true){

            String nameOfPresentation=sc.nextLine();

            if(nameOfPresentation.equals("Finish")){

                double avgAllPresentations=sumAvg/numberOfPresentations;
                System.out.printf("Student's final assessment is %.2f.", avgAllPresentations);
                return;
            }

            for(int i=1; i<=n; i++){

                double grade=Double.parseDouble(sc.nextLine());
                sumOfGrades+=grade;
            }

            double avg=sumOfGrades/n;
            System.out.printf("%s - %.2f.\n", nameOfPresentation, avg);
            sumAvg+=avg;
            sumOfGrades=0;
            numberOfPresentations++;
        }


    }
}
