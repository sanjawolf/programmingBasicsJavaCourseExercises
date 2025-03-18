import java.util.Scanner;

public class Zadatak_10_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double depositAmount=Double.parseDouble(sc.nextLine());
        int termOfTheDeposit=Integer.parseInt(sc.nextLine());
        double annualInterestRate=Double.parseDouble(sc.nextLine());

        double accruedInterest=depositAmount * (annualInterestRate/100);
        double amount = depositAmount + termOfTheDeposit*(accruedInterest / 12);

        System.out.println(amount);


    }
}
