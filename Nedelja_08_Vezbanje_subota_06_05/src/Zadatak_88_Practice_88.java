import java.util.Scanner;

public class Zadatak_88_Practice_88 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double CHICKEN_MENU=10.35;
        double FISH_MENU=12.40;
        double VEGETARIAN_MENU=8.15;
        double DELIVERY=2.50;

        int numberOfChickenMenus=Integer.parseInt(sc.nextLine());
        int numberOfFishMenus=Integer.parseInt(sc.nextLine());
        int numberOfVegetarianMenus=Integer.parseInt(sc.nextLine());

        double bill=numberOfChickenMenus*CHICKEN_MENU+numberOfFishMenus*FISH_MENU+numberOfVegetarianMenus*VEGETARIAN_MENU;
        double desert=0.2*bill;
        double totalBill=bill+desert+DELIVERY;
        System.out.println(totalBill);


    }
}
