import java.util.Scanner;

public class Zadatak_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hoursOfDay=Integer.parseInt(sc.nextLine());

        String dayOfWeek=sc.nextLine();

        if(hoursOfDay>=10 && hoursOfDay<=18){

            switch(dayOfWeek){

                case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday": case "Saturday":
                    System.out.println("open");
                    break;

                default:
                    System.out.println("closed");
            }
        }

        else{

            System.out.println("closed");

        }


    }
}
