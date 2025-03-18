import java.util.Scanner;

public class Zadatak_01_Judge_Exam_Preparation_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double priceOfStrawberries=Double.parseDouble(sc.nextLine());
        double numberOfBananasKilos=Double.parseDouble(sc.nextLine());
        double numberOfOrangesKilos=Double.parseDouble(sc.nextLine());
        double numberOfRaspberriesKilos=Double.parseDouble(sc.nextLine());
        double numberOfStrawberriesKilos=Double.parseDouble(sc.nextLine());

        double priceOfRaspberries=priceOfStrawberries/2;
        double priceOfOranges=priceOfRaspberries*0.6;
        double priceOfBananas=priceOfRaspberries*0.2;

        double price=priceOfStrawberries*numberOfStrawberriesKilos+priceOfRaspberries*numberOfRaspberriesKilos+priceOfOranges*numberOfOrangesKilos+priceOfBananas*numberOfBananasKilos;
        System.out.printf("%.2f", price);
    }
}
