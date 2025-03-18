import java.util.Scanner;

public class Zadatak_09_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

       while(true){

           String destination=sc.nextLine();
           double sum=0;

           if(destination.equals("End")){

               return;

           }

           double minimumBudgetForTrip=Double.parseDouble(sc.nextLine());

           while(true){

               double saving=Double.parseDouble(sc.nextLine());

                   sum=sum+saving;

               if(sum>=minimumBudgetForTrip){

                   System.out.printf("Going to %s!\n", destination);
                   break;
               }

           }
       }
    }
}
