import java.util.Scanner;

public class Zadatak_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String product=sc.nextLine();
        String city=sc.nextLine();
        double quantity=Double.parseDouble(sc.nextLine());
        double price=0;

        if(city.equals("London")){

            if(product.equals("coffee")){

                double price1=0.50;
                price=quantity*price1;
                System.out.println(price);
            }

            else if(product.equals("water")){

                double price2=0.80;
                price=quantity*price2;
                System.out.println(price);
            }

            else if(product.equals("beer")){

                double price3=1.20;
                price=quantity*price3;
                System.out.println(price);
            }

            else if(product.equals("sweets")){

                double price4=1.45;
                price=quantity*price4;
                System.out.println(price);

            }

            else {

                double price5=1.60;
                price=quantity*price5;
                System.out.println(price);

            }
        }

        if(city.equals("Rome")){

            if(product.equals("coffee")){

                double price1=0.40;
                price=quantity*price1;
                System.out.println(price);
            }

            else if(product.equals("water")){

                double price2=0.70;
                price=quantity*price2;
                System.out.println(price);
            }

            else if(product.equals("beer")){

                double price3=1.15;
                price=quantity*price3;
                System.out.println(price);
            }

            else if(product.equals("sweets")){

                double price4=1.30;
                price=quantity*price4;
                System.out.println(price);

            }

            else {

                double price5=1.50;
                price=quantity*price5;
                System.out.println(price);

            }
        }

        if(city.equals("Paris")){

            if(product.equals("coffee")){

                double price1=0.45;
                price=quantity*price1;
                System.out.println(price);
            }

            else if(product.equals("water")){

                double price2=0.70;
                price=quantity*price2;
                System.out.println(price);
            }

            else if(product.equals("beer")){

                double price3=1.10;
                price=quantity*price3;
                System.out.println(price);
            }

            else if(product.equals("sweets")){

                double price4=1.35;
                price=quantity*price4;
                System.out.println(price);

            }

            else {

                double price5=1.55;
                price=quantity*price5;
                System.out.println(price);

            }
        }
    }
}
