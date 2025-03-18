import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadatak_11_Judge_Lab_10 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int sumEven=0;
        int sumOdd=0;


        for(i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if(i%2==0){

                sumEven=sumEven+number;
            }

            else{

                sumOdd=sumOdd+number;
            }

        }

        if(sumEven==sumOdd){

            System.out.println("Yes");
            System.out.println("Sum = " + sumOdd);
        }

        else{

            int difference=Math.abs(sumOdd-sumEven);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }

        }
    }

