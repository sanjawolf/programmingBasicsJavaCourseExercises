import java.util.Scanner;

public class Zadatak_45_Practice_45 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String dayOfWeek=sc.nextLine();

        int price=-1;

        switch(dayOfWeek){

            case "Monday": case "Tuesday": case "Friday":
                price=12;
                break;

            case "Wednesday": case "Thursday":
                price=14;
                break;

            case "Saturday": case "Sunday":
                price=16;
                break;

            default:

        }

        System.out.println(price);
    }
}
