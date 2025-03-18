import java.util.Scanner;

public class Zadatak_30_Practice_30 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);



        while(true){

            String destination=sc.nextLine();

            if(destination.equals("End")){

                return;
            }

            double minimumBudget=Double.parseDouble(sc.nextLine());
            double savings=0;

            while(true){

                String sumText=sc.nextLine();

                double sum=Double.parseDouble(sumText);

                savings+=sum;

                if(savings>=minimumBudget){

                    System.out.printf("Going to %s!\n", destination);
                    break;
                }


            }


        }
    }
}
