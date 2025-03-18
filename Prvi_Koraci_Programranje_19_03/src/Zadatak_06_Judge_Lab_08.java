import java.util.Scanner;

public class Zadatak_06_Judge_Lab_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPackagesDog=Integer.parseInt(sc.nextLine());
        int numberOfPackagesCat=Integer.parseInt(sc.nextLine());

        double onePackageDog=2.50;
        int onePackageCat=4;

        double totalSum=numberOfPackagesDog*onePackageDog+numberOfPackagesCat*onePackageCat;

        System.out.printf("%.1f USD", totalSum);
    }
}
