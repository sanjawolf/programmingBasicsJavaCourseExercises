import java.util.Scanner;

public class Zadatak_54_Practice_54 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nameOfBook=sc.nextLine();

        int counter=0;

        while(true){

            String bookChecked=sc.nextLine();

            if(bookChecked.equals("No More Books")){

                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", counter);

                return;
            }

            if(bookChecked.equals(nameOfBook)){

                System.out.printf("You checked %d books and found it.", counter);
                return;
            }

            counter++;
        }


    }
}
