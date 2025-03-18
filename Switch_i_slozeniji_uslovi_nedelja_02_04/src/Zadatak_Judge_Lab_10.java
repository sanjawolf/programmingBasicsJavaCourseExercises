import java.util.Scanner;

public class Zadatak_Judge_Lab_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        if((number>=100 && number<=200) || number==0){

        }

        else{

            System.out.println("invalid");
        }
    }
}
