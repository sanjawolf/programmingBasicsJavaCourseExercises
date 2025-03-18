import java.util.Scanner;

public class Zadatak_08_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double sum=0;

        while(true){

           String amountText=sc.nextLine();

            if(amountText.equals("NoMoreMoney")){

                break;
            }

            double amount=Double.parseDouble(amountText);

            if(amount<0){

                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n", amount);
            sum=sum+amount;

        }

        System.out.printf("Total: %.2f", sum);


    }
}
