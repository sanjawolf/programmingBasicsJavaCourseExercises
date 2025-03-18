import java.util.Scanner;

public class Zadatak_01_For_Petlja_Opadajuca {

    public static void main(String[] args) {

//        int i;
//
//        for(i=10; i>=0; i--){
//
//            System.out.println(i);
//
//        }
//
//        System.out.println("Srecna Nova godina :)");

        Scanner sc=new Scanner(System.in);

        int numOne=Integer.parseInt(sc.nextLine());
        int numTwo=Integer.parseInt(sc.nextLine());

        int i;

        for(i=numOne; i<=numTwo; i++){

            if(i%2==0){

                System.out.println(i);
            }

        }

    }
}
