import java.util.Scanner;

public class Zadatak_11_Practice_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();
        String passwordOne=sc.nextLine();

        while(true){

            String passwordTwo=sc.nextLine();

            if(passwordTwo.equals(passwordOne)){

                break;
            }
        }

        System.out.printf("Welcome %s!", username);
    }
}
