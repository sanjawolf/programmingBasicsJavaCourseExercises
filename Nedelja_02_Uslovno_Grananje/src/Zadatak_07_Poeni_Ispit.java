import java.util.Scanner;

public interface Zadatak_07_Poeni_Ispit {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int points=Integer.parseInt(sc.nextLine());

        if(points<0){

            System.out.println("Greska, los unos");

        }
        else if(points<=50){

            System.out.println("5");

        }

        else if(points<=60){

            System.out.println("6");

        }

        else if(points<=70){

            System.out.println("7");

        }

        else if(points<=80){

            System.out.println("8");

        }

        else if(points<=90){

            System.out.println("9");

        }

        else if(points<=100){

            System.out.println("10");


        }

        else{

            System.out.println("Greska, los unos");

        }

    }
}
