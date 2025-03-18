import java.util.Scanner;

public class Zadatak_Judge_Lab_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String city=sc.nextLine();

        double salesVolume=Double.parseDouble(sc.nextLine());

        double percentageOfTradeCommission=-1;

        if(salesVolume>=0 && salesVolume<=500){

            switch(city){

                case "London":
                    percentageOfTradeCommission=0.05*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Paris":
                    percentageOfTradeCommission=0.045*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Rome":
                    percentageOfTradeCommission=0.055*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                default:
                    System.out.println("error");

            }
        }

        else if(salesVolume>500 && salesVolume<=1000){

            switch(city){

                case "London":
                    percentageOfTradeCommission=0.07*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Paris":
                    percentageOfTradeCommission=0.075*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Rome":
                    percentageOfTradeCommission=0.08*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                default:
                    System.out.println("error");

            }
        }

        else if(salesVolume>1000 && salesVolume<=10000){

            switch(city){

                case "London":
                    percentageOfTradeCommission=0.08*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Paris":
                    percentageOfTradeCommission=0.1*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Rome":
                    percentageOfTradeCommission=0.12*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                default:
                    System.out.println("error");
            }
        }

        else if(salesVolume>10000){

            switch(city){

                case "London":
                    percentageOfTradeCommission=0.12*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Paris":
                    percentageOfTradeCommission=0.13*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                case "Rome":
                    percentageOfTradeCommission=0.145*salesVolume;
                    System.out.printf("%.2f", percentageOfTradeCommission);
                    break;

                default:
                    System.out.println("error");
            }
        }

        else{

            System.out.println("error");
        }

    }
}
