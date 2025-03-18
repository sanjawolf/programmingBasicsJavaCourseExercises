import java.util.Scanner;

public class Zadatak_14_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());
            sum=sum+number;

            if(number>max){

                max=number;
        }

        }

        if(max*2==sum){

            System.out.println("Yes");
            System.out.println("Sum = "+max);

        }

        else{

            int difference=Math.abs(max-(sum-max));
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
