import java.util.Scanner;

public class Zadatak_16_Practice_16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i;

        for(i=1; i<=n; i+=3){

            System.out.println(i);
        }
    }
}
