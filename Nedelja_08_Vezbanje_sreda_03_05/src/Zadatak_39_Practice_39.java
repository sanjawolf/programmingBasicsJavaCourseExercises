import java.util.Scanner;

public class Zadatak_39_Practice_39 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hourOfDay=Integer.parseInt(sc.nextLine());
        String dayОfWeek=sc.nextLine();

        switch(dayОfWeek){

            case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday": case "Saturday":

                if(hourOfDay>=10 && hourOfDay<=18){

                    System.out.println("open");

                }

                else{

                    System.out.println("closed");

                }
                break;

            case "Sunday":
                System.out.println("closed");
                break;

            default:
        }
    }
}
