import java.util.Scanner;

public class Zadatak_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        if(number>=-100 && number<=100 && number!=0){

            System.out.println("Yes");
        }

        else{

            System.out.println("No");

        }


    }
}
