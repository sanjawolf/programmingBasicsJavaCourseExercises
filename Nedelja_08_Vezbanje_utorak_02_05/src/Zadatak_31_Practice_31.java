import java.util.Scanner;

public class Zadatak_31_Practice_31 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        String surname=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());
        String city=sc.nextLine();

        System.out.println("You are "+ name+ " "+surname+ ", a "+ age+"-years old person from "+city+".");
    }
}
