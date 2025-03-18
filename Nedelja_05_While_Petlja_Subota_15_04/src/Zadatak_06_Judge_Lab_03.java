import java.util.Scanner;

public class Zadatak_06_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int originNumber=Integer.parseInt(sc.nextLine());

        int sum=0;

        while (true){

            int number=Integer.parseInt(sc.nextLine());
            sum=sum+number;

            if(sum>=originNumber){

                break;
            }
        }

        System.out.println(sum);
    }
}
