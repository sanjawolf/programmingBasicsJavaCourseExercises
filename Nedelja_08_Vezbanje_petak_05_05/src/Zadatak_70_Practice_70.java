import java.util.Scanner;

public class Zadatak_70_Practice_70 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if(number>max){

                max=number;
            }

            sum+=number;
        }

        if(max==sum-max){

            System.out.println("Yes");
            System.out.printf("Sum = %d", max);

        }

        else{

            int difference= Math.abs(max-(sum-max));
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}
