import java.util.Scanner;

public class Zadatak_01_sabloni_sa_zvezdicama {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i, j, p, q;

//        for(i=1; i<=n; i++){
//
//            for(j=1; j<=n; j++){
//
//                System.out.printf("* ");
//            }
//
//            System.out.println();
//        }

        int brojac=1;

        for(p=1; p<=n; p++){

            for(q=1; q<=p; q++){

                    System.out.printf("%d ", brojac);

                    if(brojac==n){

                        return;
                    }

                    brojac++;

            }

            System.out.println();
        }
}
}
