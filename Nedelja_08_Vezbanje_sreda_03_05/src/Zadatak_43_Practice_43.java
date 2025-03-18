import java.util.Scanner;

public class Zadatak_43_Practice_43 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPackagesDogFood= Integer.parseInt(sc.nextLine());
        int numberOfPackagesCatFood=Integer.parseInt(sc.nextLine());

        double ONE_DOG_PACKAGE=2.50;
        double ONE_CAT_PACKAGE=4;

        double totalSum=numberOfPackagesDogFood*ONE_DOG_PACKAGE+numberOfPackagesCatFood*ONE_CAT_PACKAGE;

        System.out.println(totalSum);

    }
}
