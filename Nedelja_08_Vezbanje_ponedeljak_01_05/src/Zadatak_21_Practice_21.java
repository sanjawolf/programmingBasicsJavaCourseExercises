import java.util.Scanner;

public class Zadatak_21_Practice_21 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double age=Double.parseDouble(sc.nextLine());
        String gender=sc.nextLine();

        if(age>=16){

            switch(gender){

                case "m":
                    System.out.println("Mr.");
                    break;

                case "f":
                    System.out.println("Ms.");
                    break;

                default:
            }
        }

        else{

            switch(gender){

                case "m":
                    System.out.println("Master");
                    break;

                case "f":
                    System.out.println("Miss");
                    break;

                default:
            }
        }
    }
}
