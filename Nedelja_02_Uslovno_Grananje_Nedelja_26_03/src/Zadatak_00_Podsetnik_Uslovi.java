import java.util.Scanner;

public class Zadatak_00_Podsetnik_Uslovi {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        if(number>50){

            System.out.println("Uneti broj je veći od 50.");
        }

        else if(number==50){

            System.out.println("Uneti broj je jednak 50.");
        }

        else
        {
            System.out.println("Uneti broj je manji od 50.");
        }
    }
}
