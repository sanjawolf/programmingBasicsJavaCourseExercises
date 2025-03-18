import java.util.Scanner;

public class Zadatak_03_Judge_Exam_Preparation_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double movieBudget=Double.parseDouble(sc.nextLine());
        String destination=sc.nextLine();
        String season=sc.nextLine();
        int numberOfDays=Integer.parseInt(sc.nextLine());

        double priceForOneDay = -1;
        double totalPrice=-1;

        if(season.equals("Winter")) {

          switch (destination) {

                case "Dubai":
                    priceForOneDay = 45000;
                    totalPrice=numberOfDays*priceForOneDay*0.7;
                    break;

                case "Washington":
                    priceForOneDay = 17000;
                    totalPrice=numberOfDays*priceForOneDay*1.25;
                    break;

                case "London":
                    priceForOneDay = 24000;
                    totalPrice=numberOfDays*priceForOneDay;
                    break;

                default:
            }

        }

            else{

                switch(destination){

                    case "Dubai":
                        priceForOneDay=40000;
                        totalPrice=numberOfDays*priceForOneDay*0.7;
                        break;

                    case "Washington":
                        priceForOneDay=12500;
                        totalPrice=numberOfDays*priceForOneDay*1.25;
                        break;

                    case "London":
                        priceForOneDay=20250;
                        totalPrice=numberOfDays*priceForOneDay;
                        break;

                    default:
                }
            }

            if(movieBudget>=totalPrice){

                double remainingBudget=movieBudget-totalPrice;
                System.out.printf("The budget for the movie is enough! We have %.2f USD left!", remainingBudget);
        }

            else{

                double remainingBudget=totalPrice-movieBudget;
                System.out.printf("The director needs %.2f USD more!", remainingBudget);
            }

    }
}
