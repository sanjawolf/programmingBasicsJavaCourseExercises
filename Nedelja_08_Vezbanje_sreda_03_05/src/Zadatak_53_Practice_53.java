import java.util.Scanner;

public class Zadatak_53_Practice_53 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int counter=0;
        int sumLeft=0;
        int sumRight=0;

        for(i=1; i<=2*n; i++){

            int number=Integer.parseInt(sc.nextLine());

            counter++;

            if(counter>n){

                sumRight+=number;
            }

            else{

                sumLeft+=number;
            }

        }

        if(sumRight==sumLeft){

            System.out.printf("Yes, sum = %d", sumRight);
        }

        else{

            int difference=Math.abs(sumLeft-sumRight);
            System.out.printf("No, diff = %d", difference);
        }
    }
}
