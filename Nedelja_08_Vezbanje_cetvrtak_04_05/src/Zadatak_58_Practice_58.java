import java.util.Scanner;

public class Zadatak_58_Practice_58 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int sumNumEvenPos=0;
        int sumNumOddPos=0;

        for(int i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());

            if(i%2==0){

                sumNumEvenPos+=number;
            }

            else{

                sumNumOddPos+=number;
            }
        }

        if(sumNumOddPos==sumNumEvenPos){

            System.out.println("Yes");
            System.out.printf("Sum = %d", sumNumEvenPos);
        }

        else{

            int difference=Math.abs(sumNumEvenPos-sumNumOddPos);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}
