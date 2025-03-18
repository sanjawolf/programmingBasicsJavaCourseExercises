import java.util.Scanner;

public class Zadatak_19_Practice_19 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double length=Double.parseDouble(sc.nextLine());

        double ONE_INCH=2.54;

        double lengthInCentimeters=length*ONE_INCH;

        System.out.println(lengthInCentimeters);
    }
}
