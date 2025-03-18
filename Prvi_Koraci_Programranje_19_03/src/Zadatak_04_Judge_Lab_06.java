import java.util.Scanner;

public class Zadatak_04_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        String surname=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());
        String city=sc.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, surname, age, city);
    }
}
