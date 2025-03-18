import java.util.Scanner;

public class Zadatak_10_Judge_Lab_09 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int leftSum=0;
        int rightSum=0;

        for(i=1; i<=n;i++){

            int numbersLeft=Integer.parseInt(sc.nextLine());
            leftSum=leftSum+numbersLeft;

        }

        for(i=1; i<=n;i++){

            int numbersRight=Integer.parseInt(sc.nextLine());
            rightSum=rightSum+numbersRight;

        }

        if(leftSum==rightSum){

            System.out.println("Yes, sum = " + rightSum);
        }

        else{

            int difference=Math.abs(leftSum-rightSum);
            System.out.println("No, diff = " + difference);
        }


    }
}
