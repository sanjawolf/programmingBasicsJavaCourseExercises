import java.util.Scanner;

public class Zadatak_18_Practice_18 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int x1, x2, x3;
        int counter=0;

        for(x1=0; x1<=n; x1++){

            for(x2=0; x2<=n; x2++){

                for(x3=0; x3<=n; x3++){

                    if(x1+x2+x3==n){

                        counter++;
                    }
                }
            }

        }

        System.out.println(counter);
    }
}
