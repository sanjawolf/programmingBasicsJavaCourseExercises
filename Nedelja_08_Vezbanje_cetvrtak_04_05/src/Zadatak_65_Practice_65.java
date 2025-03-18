import java.util.Scanner;

public class Zadatak_65_Practice_65 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double moneyNeededForTrip=Double.parseDouble(sc.nextLine());
        double cash=Double.parseDouble(sc.nextLine());
        int counterDaysSpend=0;
        int counterDays=0;

        while(true){

            String actionType=sc.nextLine();
            double amountYouWillSaveSpend=Double.parseDouble(sc.nextLine());

            counterDays++;

            if(actionType.equals("save")){

                cash=cash+amountYouWillSaveSpend;

                counterDaysSpend=0;


            }

            else{

                counterDaysSpend++;
                cash=cash-amountYouWillSaveSpend;

                if(cash<0){

                    cash=0;
                }

            }

            if(counterDaysSpend==5){

                System.out.println("You can't save the money.");
                System.out.printf("%d", counterDays);
                return;
            }

            if(cash>=moneyNeededForTrip){

                System.out.printf("You saved the money for %d days.", counterDays);
                return;

            }

        }



    }
}
