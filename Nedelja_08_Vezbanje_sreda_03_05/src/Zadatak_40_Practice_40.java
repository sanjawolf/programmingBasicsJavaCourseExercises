import java.util.Scanner;

public class Zadatak_40_Practice_40 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int sum=0;
        int i;

        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());
            sum+=number;
        }

        System.out.println(sum);

    }
}
