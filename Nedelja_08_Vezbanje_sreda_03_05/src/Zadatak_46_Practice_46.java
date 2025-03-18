import java.util.Scanner;

public class Zadatak_46_Practice_46 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if (number>max){

                max=number;
            }

            if (number<min){

                min=number;
            }

        }

        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d", min);
    }
}
