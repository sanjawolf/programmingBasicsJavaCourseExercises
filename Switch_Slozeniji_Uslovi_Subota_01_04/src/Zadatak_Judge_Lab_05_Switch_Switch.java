import java.util.Scanner;

public class Zadatak_Judge_Lab_05_Switch_Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price=-1;

        switch (city) {

            case "London":

                switch (product) {

                    case "coffee":
                        price = 0.50;
                        break;

                    case "water":
                        price = 0.80;
                        break;

                    case "beer":
                        price = 1.20;
                        break;

                    case "sweets":
                        price = 1.45;
                        break;

                    default:
                        price = 1.60;


                }

                break;


            case "Rome":

              switch (product) {

                  case "coffee":
                     price = 0.40;
                     break;

                   case "water":
                       price = 0.70;
                        break;

                  case "beer":
                     price = 1.15;
                     break;

                  case "sweets":
                      price = 1.30;
                      break;

                  default:
                      price = 1.50;
        }

                    break;

            case "Paris":

                    switch(product){

            case "coffee":
            price = 0.45;
            break;

        case "water":
            price = 0.70;
            break;

        case "beer":
            price = 1.10;
            break;

        case "sweets":
            price = 1.35;
            break;

        default:
            price = 1.55;
            break;
    }

    break;
}

double priceUkupno=price*quantity;
        System.out.println(priceUkupno);


                }
        }


