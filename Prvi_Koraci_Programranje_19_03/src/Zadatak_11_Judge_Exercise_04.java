import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPages=Integer.parseInt(sc.nextLine());
        int pagesReadInOneHour=Integer.parseInt(sc.nextLine());
        int theNumberOfDaysYouMustReadTheBook=Integer.parseInt(sc.nextLine());

        int pagesReadInOneDay=numberOfPages/theNumberOfDaysYouMustReadTheBook;
        int numberOfHoursReadingEachDay=pagesReadInOneDay/pagesReadInOneHour;

        System.out.println(numberOfHoursReadingEachDay);
    }
}
