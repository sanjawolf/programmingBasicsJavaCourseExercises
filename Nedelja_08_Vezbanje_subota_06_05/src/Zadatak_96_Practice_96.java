import java.util.Scanner;

public class Zadatak_96_Practice_96 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String month=sc.nextLine();
        int numberOfNights=Integer.parseInt(sc.nextLine());
        double priceStudio=-1;
        double priceApartment=-1;
        double discount=-1;

        switch(month){

            case "May": case "October":

                priceStudio=numberOfNights*50;
                priceApartment=numberOfNights*65;

                if(numberOfNights>7 && numberOfNights<=14){


                    discount=0.05*priceStudio;
                    priceStudio-=discount;

                }

                else if(numberOfNights>14){

                    discount=0.3*priceStudio;
                    priceStudio-=discount;
                    priceApartment=0.9*priceApartment;

                }
               break;

            case "June": case "September":

                priceStudio=numberOfNights*75.20;
                priceApartment=numberOfNights*68.70;

                if(numberOfNights>14){


                    discount=0.2*priceStudio;
                    priceStudio-=discount;
                    priceApartment=0.9*priceApartment;
                }
                break;

            case "July": case "August":

                priceStudio=numberOfNights*76;
                priceApartment=numberOfNights*77;

                if(numberOfNights>14){

                    priceApartment=0.9*priceApartment;
                }

                break;

            default:

        }

        System.out.printf("Apartment: %.2f USD.\n", priceApartment);
        System.out.printf("Studio: %.2f USD.", priceStudio);

    }
}
