import java.util.Scanner;

public class Zadatak_01_Algoritmi_Sa_N_Brojeva {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
//        int counterForNumbersGreaterThan10=0;
//
//        for(i=1; i<=n; i++){
//
//            int number=Integer.parseInt(sc.nextLine());
//
//            if(number>10){
//
//                counterForNumbersGreaterThan10=counterForNumbersGreaterThan10+1;
//            }
//        }
//
//        System.out.printf("From %d entered numbers there is %d numbers greater than 10!", n, counterForNumbersGreaterThan10);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if(number>max){

                max=number;
            }

            if(number<min){

                min=number;
            }

        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
