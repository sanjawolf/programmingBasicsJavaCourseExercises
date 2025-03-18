import java.util.Scanner;

public class Zadatak_47_Practice_47 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int i;
        double sum=0;
        int counterNextGrade=0;
        int counterFailed=0;

        for(i=1; i<=12; i++){

            double annualGrade=Double.parseDouble(sc.nextLine());

            if(annualGrade>=4.00){

                sum+=annualGrade;
            }

            else{

                counterFailed++;

                if(counterFailed>=1){

                    System.out.printf("%s has been excluded at %d grade", name, i);
                    return;
                }
            }
        }

        double avg=sum/12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avg);
    }
}
