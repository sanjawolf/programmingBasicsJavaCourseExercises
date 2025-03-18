import java.util.Scanner;

public class Zadatak_52_Practice_52 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String productName=sc.nextLine();

        switch(productName){

            case "banana": case "apple": case "kiwi": case "cherry": case "lemon": case "grapes":
                System.out.println("fruit");
                break;

            case "tomato": case "cucumber": case "pepper": case "carrot":
                System.out.println("vegetable");
                break;

            default:
                System.out.println("unknown");
        }
    }
}
