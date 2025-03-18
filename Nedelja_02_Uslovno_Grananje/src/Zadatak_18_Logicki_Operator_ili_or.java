import java.util.Scanner;

public class Zadatak_18_Logicki_Operator_ili_or {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int brojPoena=Integer.parseInt(sc.nextLine());

        if(brojPoena<0 || brojPoena>100){

            System.out.println("Uneti broj poena je neispravan.");
        }

        else{

            System.out.println("Uneti broj poena je ispravan.");
        }
    }
}
