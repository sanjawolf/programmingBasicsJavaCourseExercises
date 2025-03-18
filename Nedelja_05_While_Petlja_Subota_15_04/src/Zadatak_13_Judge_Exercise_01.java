import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_01 {

    public static void main(String[] args) {

       Scanner sc=new Scanner (System.in);

       String bookLookingFor=sc.nextLine();

       int counter=0;

       while(true){

           String bookChecked=sc.nextLine();

           if(bookLookingFor.equals(bookChecked)){

               System.out.printf("You checked %d books and found it.", counter);
               break;
           }

           if(bookChecked.equals("No More Books")){

               System.out.println("The book you search is not here!");
               System.out.printf("You checked %d books.", counter);
               return;
           }

            counter++;
       }

    }

}
