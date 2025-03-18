import java.util.Scanner;

public class Zadatak_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String month=sc.nextLine();
        int numberOfNights=Integer.parseInt(sc.nextLine());
        double priceStudio=-1;
        double priceApartment=-1;

        if(month.equals("May") || month.equals("October")){

            priceStudio=50*numberOfNights;;
            priceApartment=65*numberOfNights;

            if(numberOfNights>7 && numberOfNights<=14){

                priceStudio=0.95*priceStudio;

            }

            if(numberOfNights>14){

                priceStudio=0.7*priceStudio;
                priceApartment=0.9*priceApartment;
            }
        }

        if(month.equals("June") || month.equals("September")){

            priceStudio=75.20*numberOfNights;
            priceApartment=68.70*numberOfNights;

            if(numberOfNights>14){

                priceStudio=0.8*priceStudio;
                priceApartment=0.9*priceApartment;
            }
        }

        if(month.equals("July") || month.equals("August")){

            priceStudio=76*numberOfNights;
            priceApartment=77*numberOfNights;

            if(numberOfNights>14){

                priceApartment=0.9*priceApartment;
            }
        }

        System.out.printf("Apartment: %.2f USD.\n", priceApartment);
        System.out.printf("Studio: %.2f USD.", priceStudio);
    }
}
