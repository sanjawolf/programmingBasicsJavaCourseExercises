import java.util.Scanner;

public class Zadatak_Judge_Lab_05_Switch_If {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String product=sc.nextLine();
        String city=sc.nextLine();
        double quantity=Double.parseDouble(sc.nextLine());
        double price=-1;

        switch(city){

            case "London":

            if(product.equals("coffee")){

                price=0.50;

            }

            else if(product.equals("water")){

                price=0.80;
            }

            else if(product.equals("beer")){

                price=1.20;
            }

            else if(product.equals("sweets")){

                price=1.45;
            }

            else{

                price=1.60;
            }

            break;

            case "Rome":

                if(product.equals("coffee")){

                    price=0.40;

                }

                else if(product.equals("water")){

                    price=0.70;
                }

                else if(product.equals("beer")){

                    price=1.15;
                }

                else if(product.equals("sweets")){

                    price=1.30;
                }

                else{

                    price=1.50;
                }

                break;

            case "Paris":

                if(product.equals("coffee")){

                    price=0.45;

                }

                else if(product.equals("water")){

                    price=0.70;
                }

                else if(product.equals("beer")){

                    price=1.10;
                }

                else if(product.equals("sweets")){

                    price=1.35;
                }

                else{

                    price=1.55;
                }

                break;

        }

        double priceUkupno=price*quantity;
        System.out.println(priceUkupno);
    }
}
