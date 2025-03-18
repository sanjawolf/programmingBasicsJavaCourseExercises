import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double movieBudget=Double.parseDouble(sc.nextLine());
        int numberExtras=Integer.parseInt(sc.nextLine());
        double priceForClothing=Double.parseDouble(sc.next());

        double clothing=numberExtras*priceForClothing;
        double setFilm=0.1*movieBudget;

        double money = setFilm + clothing;

        if(numberExtras>150) {

            double clothingWithDiscount = 0.9 * clothing;
            money = setFilm + clothingWithDiscount;
        }


           if (money > movieBudget) {

                double substraction = money - movieBudget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", substraction);
            } else {

                double substraction = movieBudget - money;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.", substraction);
            }

            }
        }
