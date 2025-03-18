import java.util.Scanner;

public class Zadatak_42_Practice_42 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int broj=Integer.parseInt(sc.nextLine());

        int vrsta, kolona;
        int brojac=1;

        for(vrsta=1; vrsta<=broj; vrsta++){



            for(kolona=1; kolona<=vrsta; kolona++){

                System.out.print(brojac+ " ");
                if (brojac == broj) {
                    return;
                }
                brojac++;

            }

            System.out.println();
        }


    }
}
