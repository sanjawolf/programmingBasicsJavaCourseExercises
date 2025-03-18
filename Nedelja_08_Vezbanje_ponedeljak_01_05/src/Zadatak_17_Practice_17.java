import java.util.Scanner;

public class Zadatak_17_Practice_17 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        int sum=0;

        while(true){

            int numbers=Integer.parseInt(sc.nextLine());

            sum+=numbers;

            if(sum>=number){

                break;
            }
        }

        System.out.println(sum);
    }
}
