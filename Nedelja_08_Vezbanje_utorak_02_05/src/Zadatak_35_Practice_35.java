import java.util.Scanner;

public class Zadatak_35_Practice_35 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int max=Integer.MIN_VALUE;

        while(true){

            String numberText=sc.nextLine();

            if(numberText.equals("Stop")){

                break;
            }

            int number=Integer.parseInt(numberText);

            if(number>max){

                max=number;
            }

        }

        System.out.println(max);
    }
}
