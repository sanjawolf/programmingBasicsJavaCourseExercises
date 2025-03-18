import java.util.Scanner;

public class Zadatak_80_Practice_80 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int degrees=Integer.parseInt(sc.nextLine());
        String timeOfDay=sc.nextLine();
        String outfit="";
        String shoes="";

        if(degrees>=10 && degrees<=18){

            switch(timeOfDay){

                case "Morning":
                    outfit="Sweatshirt";
                    shoes="Sneakers";
                    break;

                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                default:

            }
        }

        else if(degrees<=24){

            switch(timeOfDay){

                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                default:

            }
        }

        else{

            switch(timeOfDay){

                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;

                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                default:

            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
