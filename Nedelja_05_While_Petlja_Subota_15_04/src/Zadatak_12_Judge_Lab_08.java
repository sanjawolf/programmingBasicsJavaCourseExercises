import java.util.Scanner;

public class Zadatak_12_Judge_Lab_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nameOfStudent=sc.nextLine();

        int counter=1;
        double sum=0;
        int counterFailed=0;

        while(true){

            double annualGrade=Double.parseDouble(sc.nextLine());

            if(annualGrade>=4.00){

                counter++;
                sum=sum+annualGrade;

                if(counter==13){

                    break;
                }

            }

            else{

                counterFailed++;

                if(counterFailed==2){

                    System.out.printf("%s has been excluded at %d grade", nameOfStudent, counter);
                    return;
                }

            }
        }

        double avg=sum/12;
        System.out.printf("%s graduated. Average grade: %.2f", nameOfStudent, avg);

    }
}
