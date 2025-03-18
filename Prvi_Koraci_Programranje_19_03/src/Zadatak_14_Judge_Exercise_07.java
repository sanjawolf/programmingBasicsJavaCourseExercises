import java.util.Scanner;

public class Zadatak_14_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int numberOfChickenMenus=Integer.parseInt(sc.nextLine());
        int numberOfFishMenus=Integer.parseInt(sc.nextLine());
        int numberOfVegetarianMenus=Integer.parseInt(sc.nextLine());

        double chickenMenu=10.35;
        double fishMenu=12.40;
        double vegetarianMenu=8.15;
        double deliveryPrice=2.50;

        double totalBillExcludingDelivery=numberOfChickenMenus*chickenMenu+numberOfFishMenus*fishMenu+numberOfVegetarianMenus*vegetarianMenu;
        double dessert=20*totalBillExcludingDelivery/100;
        double orderPrice=totalBillExcludingDelivery+deliveryPrice+dessert;

        System.out.printf("%.1f", orderPrice);

    }
}
