
import java.util.Scanner;
public class Zadatak_07_Judge_Exercise_06_Sa_Greskom {



    public class Zadatak_06_Judge_Exercise_06 {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            int studentSoldTicketCounter=0;
            int standardSoldTicketCounter=0;
            int kidSoldTicketCounter=0;

            while(true){

                String movieTitle=sc.nextLine();

                if(movieTitle.equals("Finish")){

                    break;
                }

                int freeSeats=Integer.parseInt(sc.nextLine());

                int seatsCounter=0;

                while(true){

                    String ticketType=sc.nextLine();

                    if(ticketType.equals("End") || seatsCounter==freeSeats){

                        break;
                        //drugi uslov ne treba vezati operatorom || sa prvim!!!
                    }


                    if(ticketType.equals("student")){

                        studentSoldTicketCounter++;

                    }

                    if(ticketType.equals("standard")){

                        standardSoldTicketCounter++;

                    }

                    if(ticketType.equals("kid")){

                        kidSoldTicketCounter++;

                    }

                    seatsCounter++;

                }

                double percentageOfHallIsFilled  = 100.00*seatsCounter/freeSeats;
                System.out.printf("%s - %.2f%% full.\n", movieTitle, percentageOfHallIsFilled);

            }

            int soldTickets = standardSoldTicketCounter + studentSoldTicketCounter + kidSoldTicketCounter;
            double standardOfSoldTicketsPercentage = 100.00 *standardSoldTicketCounter / soldTickets;
            double studentOfSoldTicketsPercentage = 100.00 * studentSoldTicketCounter / soldTickets;
            double kidOfSoldTicketsPercentage = 100.00 * kidSoldTicketCounter / soldTickets;
            System.out.printf("Total tickets: %d.\n", soldTickets);
            System.out.printf("%.2f%% student tickets.\n", studentOfSoldTicketsPercentage);
            System.out.printf("%.2f%% standard tickets.\n", standardOfSoldTicketsPercentage);
            System.out.printf("%.2f%% kids tickets.", kidOfSoldTicketsPercentage);

        }
    }
}
