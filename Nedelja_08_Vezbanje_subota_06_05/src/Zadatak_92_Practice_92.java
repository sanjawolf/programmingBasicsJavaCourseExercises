import java.util.Scanner;

public class Zadatak_92_Practice_92 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double budget=Double.parseDouble(sc.nextLine());
        String season=sc.nextLine();
        double price=-1;
        String stay="";
        String destination="";

        if(budget<=100){

            destination="Serbia";

            switch(season){

                case "summer":
                    stay="Camp";
                    price=0.3*budget;
                    break;

                case "winter":
                    stay="Hotel";
                    price=0.7*budget;
                    break;

            }

        }

        else if(budget<=1000){

            destination="Europe";
            stay="Hotel";

            switch(season){

                case "summer":
                    price=0.4*budget;
                    break;

                case "winter":
                    price=0.8*budget;
                    break;

            }

        }

        else{

            destination="USA";
                    price=0.9*budget;

            switch(season){

                case "summer":
                    stay="Camp";
                    break;

                case "winter":
                    stay="Hotel";
                    break;

            }

                    }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", stay, price);

        }

    }

