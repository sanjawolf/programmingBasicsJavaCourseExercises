import java.util.Scanner;

public class Zadatak_67_Practice_67 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double depositAmount=Double.parseDouble(sc.nextLine());
        int termOfDeposit=Integer.parseInt(sc.nextLine());
        double annualInterestRate=Double.parseDouble(sc.nextLine());

        double amount = depositAmount + termOfDeposit * ((depositAmount * annualInterestRate/100) / 12);
        System.out.printf("%.2f", amount);
    }
}
