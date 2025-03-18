import java.util.Scanner;

public class Zadatak_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        switch(name)

        {
            case "dog":

                System.out.println("mammal");
                break;

            case "crocodile": case "tortoise": case "snake":

                System.out.println("reptile");
                break;

            default:

                System.out.println("unknown");
        }
    }
}
