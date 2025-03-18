import java.util.Scanner;

public class Zadatak_05_redovi_i_kolone_u_bioskopu {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        int red, kolona;

        for(red=1; red<=n; red++){

            for (kolona=1; kolona<=m; kolona++){

                System.out.printf("%d%d\n", red, kolona);

            }
        }
    }
}
