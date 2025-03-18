import java.util.Scanner;

public class Zadatak_29_Practice_29 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double total=0;

        while(true){

            String depositText=sc.nextLine();

            if(depositText.equals("NoMoreMoney")){

                break;
            }

            double deposit=Double.parseDouble(depositText);

            if(deposit<0){

                System.out.println("Invalid operation!" );
                break;
            }

            System.out.printf("Increase: %.2f\n", deposit);
            total=total+deposit;


        }

        System.out.printf("Total: %.2f", total);
    }
}
