import java.util.Scanner;

public class Zadatak_Judge_Lab_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String dayOfWeek=sc.nextLine();

        if(dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")){

            System.out.println("12");
        }

        else if(dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")){

            System.out.println("14");
        }

        else{

            System.out.println("16");
        }
    }
}
