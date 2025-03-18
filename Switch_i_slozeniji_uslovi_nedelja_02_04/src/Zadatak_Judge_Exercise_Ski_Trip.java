import java.util.Scanner;

public class Zadatak_Judge_Exercise_Ski_Trip {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            int daysOfStay=Integer.parseInt(sc.nextLine());
            String roomType=sc.nextLine();
            String grade=sc.nextLine();
            double price=-1;

            switch(roomType){

                case "room for one person":

                    price=(daysOfStay-1)*18.00;

                    break;

                case "apartment":

                    if(daysOfStay<10){

                        price=0.7*(daysOfStay-1)*25.00;
                    }

                    else if(daysOfStay<=15){

                        price=0.65*(daysOfStay-1)*25.00;
                    }

                    else{

                        price=0.5*(daysOfStay-1)*25.00;

                    }

                    break;

                case "president apartment":

                    if(daysOfStay<10){

                        price=0.9*(daysOfStay-1)*35.00;
                    }

                    else if(daysOfStay<=15){

                        price=0.85*(daysOfStay-1)*35.00;
                    }

                    else{

                        price=0.8*(daysOfStay-1)*35.00;

                    }

                    break;

                default:

            }


            if(grade.equals("positive")){

                price=1.25*price;
            }

            if(grade.equals("negative")){

                price=0.9*price;
            }

            System.out.printf("%.2f", price);

        }
    }


