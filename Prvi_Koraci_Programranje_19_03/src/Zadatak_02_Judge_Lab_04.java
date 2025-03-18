import java.util.Scanner;

public class Zadatak_02_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double inches=Double.parseDouble(sc.nextLine());

        double centimeters= inches*2.54;

        System.out.println(centimeters);
    }
}
