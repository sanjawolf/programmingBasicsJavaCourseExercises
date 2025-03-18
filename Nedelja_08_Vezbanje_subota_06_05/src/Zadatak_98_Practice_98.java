import java.util.Scanner;

public class Zadatak_98_Practice_98 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double roomForOnePerson=18.00;
        double apartmentForOnePerson=25.00;
        double presidentApartmentForOnePerson=35.00;

        int daysOfStay=Integer.parseInt(sc.nextLine());
        String roomType=sc.nextLine();
//                "room for one person", "apartment" or "president apartment"
        String grade=sc.nextLine();
//        "positive" or "negative"
        double cost=-1;
        double discount=-1;

        switch(roomType){

            case "room for one person":

                if (daysOfStay<=10){

                    cost=(daysOfStay-1)*roomForOnePerson;
                }

                else if(daysOfStay<=15){

                    cost=(daysOfStay-1)*roomForOnePerson;
                }

                else {

                    cost=(daysOfStay-1)*roomForOnePerson;
                }

                break;

            case "apartment":

                if (daysOfStay<=10){

                    cost=(daysOfStay-1)*apartmentForOnePerson;
                    discount=0.3*cost;
                    cost-=discount;
                }

                else if(daysOfStay<=15){

                    cost=(daysOfStay-1)*apartmentForOnePerson;
                    discount=0.35*cost;
                    cost-=discount;
                }

                else {

                    cost=(daysOfStay-1)*apartmentForOnePerson;
                    discount=0.5*cost;
                    cost-=discount;
                }

                break;

            case "president apartment":

                if (daysOfStay<=10){

                    cost=(daysOfStay-1)*presidentApartmentForOnePerson;
                    discount=0.1*cost;
                    cost-=discount;
                }

                else if(daysOfStay<=15){

                    cost=(daysOfStay-1)*presidentApartmentForOnePerson;
                    discount=0.15*cost;
                    cost-=discount;
                }

                else {

                    cost=(daysOfStay-1)*presidentApartmentForOnePerson;
                    discount=0.2*cost;
                    cost-=discount;
                }

                break;

            default:


        }

        if(grade.equals("positive")){

            cost+=0.25*cost;
        }

        else{

            cost-=0.1*cost;
        }

        System.out.printf("%.2f", cost);


    }
}
