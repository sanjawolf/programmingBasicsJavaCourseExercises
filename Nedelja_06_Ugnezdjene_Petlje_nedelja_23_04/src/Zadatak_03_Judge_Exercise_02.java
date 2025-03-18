import java.util.Scanner;

public class Zadatak_03_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int manji=Integer.parseInt(sc.nextLine());
        int veci=Integer.parseInt(sc.nextLine());

        int i;

        for(i=manji; i<=veci; i++){

            if(i%10+i/100%10+i/10000%10==i/10%10+i/1000%10+i/100000){

                System.out.print(i+" ");

            }


        }
    }
}
