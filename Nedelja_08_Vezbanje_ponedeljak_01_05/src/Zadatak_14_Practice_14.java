import java.util.Scanner;

public class Zadatak_14_Practice_14 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        if(number%2==0){

            System.out.println("even");
        }

        else{

            System.out.println("odd");
        }
    }
}
