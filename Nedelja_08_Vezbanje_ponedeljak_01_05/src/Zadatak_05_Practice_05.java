import java.util.Scanner;

public class Zadatak_05_Practice_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){

            String text=sc.nextLine();

            if(text.equals("Stop")){

                break;
            }

            System.out.println(text);
        }
    }
}
