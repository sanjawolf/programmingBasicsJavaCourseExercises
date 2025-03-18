import java.util.Scanner;

public class Zadatak_12_Judge_Lab_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
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

        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);


    }
}
