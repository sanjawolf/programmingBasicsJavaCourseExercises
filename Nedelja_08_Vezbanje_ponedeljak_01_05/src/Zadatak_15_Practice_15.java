import java.util.Scanner;

public class Zadatak_15_Practice_15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String animal=sc.nextLine();

        switch(animal){

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
