import java.util.Scanner;

public class Zadatak_73_Practice_73 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPagesCurrentBook=Integer.parseInt(sc.nextLine());
        int pagesReadInOneHour=Integer.parseInt(sc.nextLine());
        int numberOfDaysForWhichReadBook=Integer.parseInt(sc.nextLine());

        int numberOfPagesForOneDay=numberOfPagesCurrentBook/numberOfDaysForWhichReadBook;
        int numberOfHoursJohnReadEachDay=numberOfPagesForOneDay/pagesReadInOneHour;

        System.out.println(numberOfHoursJohnReadEachDay);
    }
}
