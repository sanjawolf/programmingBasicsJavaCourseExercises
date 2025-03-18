import java.util.Scanner;

public class Zadatak_09_Practice_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String dayOfWeek=sc.nextLine();

        switch(dayOfWeek){

            case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday":
                System.out.println("Working day");
                break;

            case "Saturday": case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Error");

        }


    }
}
