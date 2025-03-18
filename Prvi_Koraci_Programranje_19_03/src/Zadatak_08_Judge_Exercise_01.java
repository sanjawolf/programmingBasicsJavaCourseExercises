import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double USDollars=Double.parseDouble(sc.nextLine());
        double FIXED_EXCHANGE_RATE= 1.79549;
        double bulgarianLevs=USDollars*FIXED_EXCHANGE_RATE;
        System.out.printf("%f", bulgarianLevs);
    }
}
