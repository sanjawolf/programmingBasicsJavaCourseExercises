import java.util.Scanner;

public class Zadatak_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day0fWeek= sc.nextLine();

        if(day0fWeek.equals("Monday") || day0fWeek.equals("Tuesday") || day0fWeek.equals("Wednesday") || day0fWeek.equals("Thursday") || day0fWeek.equals("Friday")){

            System.out.println("Working day");
        }
        else if(day0fWeek.equals("Saturday") || day0fWeek.equals("Sunday")){

            System.out.println("Weekend");

        }

        else{

            System.out.println("Error");
        }
    }


}
