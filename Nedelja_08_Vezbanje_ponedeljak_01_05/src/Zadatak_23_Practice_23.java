import java.util.Scanner;

public class Zadatak_23_Practice_23 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int number=0;

        while(true){

            number=2*number+1;

            if(number>n){

                break;
            }

            System.out.println(number);

        }


    }
}
