import java.util.Scanner;

public class Zadatak_22_Practice_22 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i;

        for(i=0; i<=n; i+=2){

            double degree=Math.pow(2, i);
            System.out.printf("%.0f\n", degree);
        }
    }
}
