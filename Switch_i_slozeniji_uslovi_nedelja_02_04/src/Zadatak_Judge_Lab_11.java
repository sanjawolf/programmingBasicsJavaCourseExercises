import java.util.Scanner;

public class Zadatak_Judge_Lab_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String fruit=sc.nextLine();

        String dayOfWeek=sc.nextLine();

        double quantity=Double.parseDouble(sc.nextLine());

        double price=-1;

        double wholePrice=-1;

        if(dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday")) {

            switch (fruit) {

                case "banana":
                    price = 2.50;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "apple":
                    price = 1.20;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "orange":
                    price = 0.85;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "grapefruit":
                    price = 1.45;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "kiwi":
                    price = 2.70;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "pineapple":
                    price = 5.50;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "grapes":
                    price = 3.85;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                default:
                    System.out.println("error");

            }

        }

            else if(dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday")){

            switch (fruit) {

                case "banana":
                    price = 2.70;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "apple":
                    price = 1.25;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "orange":
                    price = 0.90;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "grapefruit":
                    price = 1.60;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "kiwi":
                    price = 3.00;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "pineapple":
                    price = 5.60;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                case "grapes":
                    price = 4.20;
                    wholePrice=quantity*price;
                    System.out.printf("%.2f", wholePrice);
                    break;

                default:
                    System.out.println("error");

            }
            }

            else{

            System.out.println("error");
        }
    }
}
