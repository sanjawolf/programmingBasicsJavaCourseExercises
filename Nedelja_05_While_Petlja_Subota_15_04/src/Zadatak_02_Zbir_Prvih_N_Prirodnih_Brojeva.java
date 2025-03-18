import java.util.Scanner;

public class Zadatak_02_Zbir_Prvih_N_Prirodnih_Brojeva {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int sabirac=0;
        int i;

        for(i=1; i<=n; i++){

            sabirac=sabirac+i;
        }

        System.out.printf("Zbir prvih %d prirodnih brojeva je: %d", n, sabirac);
    }
}
