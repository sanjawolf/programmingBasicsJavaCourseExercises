import java.util.Scanner;

public class Zadatak_07_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i, j, k;
        int brojResenja=0;

        for(i=0; i<=n; i++){

            for(j=0; j<=n; j++){

                for(k=0; k<=n; k++){

                    if(i+j+k==n){

                        brojResenja++;

                    }
                }
            }
        }

        System.out.println(brojResenja);
    }
}
