import java.util.Scanner;

public class Zadatak_17_Logicki_Operator_i_and {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int brojPoena = Integer.parseInt(sc.nextLine());

//        if (brojPoena>=81){
//
//            if(brojPoena<=90){
//
//                System.out.println("Dobio si devetku. :)");
//            }
//
//            else{
//
//                System.out.println("Dobio si desetku. :)");
//            }
//        }
//
//        else{
//
//            System.out.println("Dobio si ocenu manju od 9. :)");
//        }
//    }

        if (brojPoena >= 81 && brojPoena <= 90) {

            System.out.println("Dobio si devetku. :)");
        } else {

            System.out.println("Dobio si desetku ili ocenu slabiju od devetke. :)");
        }
    }
}