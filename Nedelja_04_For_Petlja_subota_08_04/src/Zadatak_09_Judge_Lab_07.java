import java.util.Scanner;

public class Zadatak_09_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int sum=0;

        for(i=1; i<=n; i++){

            int nNumbers=Integer.parseInt(sc.nextLine());
            sum=sum+nNumbers;
        }

        System.out.println(sum);

    }
}
