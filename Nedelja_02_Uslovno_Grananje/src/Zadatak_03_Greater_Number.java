import java.util.Scanner;

public class Zadatak_03_Greater_Number {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num_1=Integer.parseInt(sc.nextLine());
        int num_2=Integer.parseInt(sc.nextLine());

        if(num_1>num_2){

            System.out.println(num_1);

        }

        else{

            System.out.println(num_2);

        }
    }

}
