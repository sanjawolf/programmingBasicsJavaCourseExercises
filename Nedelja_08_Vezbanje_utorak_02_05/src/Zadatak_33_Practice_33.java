import java.util.Scanner;

public class Zadatak_33_Practice_33 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        if(-100<=number && number<=100 && number!=0){

            System.out.println("Yes");
        }

        else{

            System.out.println("No");
        }
    }
}
