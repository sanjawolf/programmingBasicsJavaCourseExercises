import java.util.Scanner;

public class Zadatak_63_Practice_63 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String fruit=sc.nextLine();
//        (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        String dayOfWeek=sc.nextLine();
//        (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
        double quantity=Double.parseDouble(sc.nextLine());
        double priceperKilo=-1;
        double price=-1;

        switch(dayOfWeek){

            case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday":

                switch(fruit){

                    case "banana":
                        priceperKilo=2.50;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "apple":
                        priceperKilo=1.20;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "orange":
                        priceperKilo=0.85;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "grapefruit":
                        priceperKilo=1.45;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "kiwi":
                        priceperKilo=2.70;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "pineapple":
                        priceperKilo=5.50;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "grapes":
                        priceperKilo=3.85;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    default:
                        System.out.println("error");
                }
                break;

            case "Saturday": case "Sunday":

                switch(fruit){

                    case "banana":
                        priceperKilo=2.70;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "apple":
                        priceperKilo=1.25;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "orange":
                        priceperKilo=0.90;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "grapefruit":
                        priceperKilo=1.60;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "kiwi":
                        priceperKilo=3.00;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "pineapple":
                        priceperKilo=5.60;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    case "grapes":
                        priceperKilo=4.20;
                        price=priceperKilo*quantity;
                        System.out.printf("%.2f", price);
                        break;

                    default:
                        System.out.println("error");
                }
                break;

            default:
                System.out.println("error");



        }



    }
}
