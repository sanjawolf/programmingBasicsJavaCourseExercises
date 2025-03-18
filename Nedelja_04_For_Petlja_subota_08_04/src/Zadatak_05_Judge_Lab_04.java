import java.util.Scanner;

public class Zadatak_05_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int i;

//        for(i=0; i<=n; i++){
//
//            if(i%2==0){
//
//                double power=Math.pow(2, i);
//                System.out.printf("%.0f\n", power);
//            }
//        }

        for(i=0; i<=n; i+=2){

            double power=Math.pow(2, i);
            System.out.printf("%.0f\n", power);
        }


    }
}
