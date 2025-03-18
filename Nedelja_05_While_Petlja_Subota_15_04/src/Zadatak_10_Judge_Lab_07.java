import java.util.Scanner;

public class Zadatak_10_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int min=Integer.MAX_VALUE;

        while(true){

            String numberText=sc.nextLine();

            if(numberText.equals("Stop")){

                break;
            }

            int number=Integer.parseInt(numberText);

            if(number<min){

                min=number;
            }
        }

        System.out.println(min);
    }
}
