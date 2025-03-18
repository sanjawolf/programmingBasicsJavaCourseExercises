import java.util.Scanner;

public class Zadatak_72_Practice_72
{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int closedSeatsForEachScreening=0;
        int closedSeatsTotal=0;

        while(true){

            String titleOfMovie=sc.nextLine();

            if(titleOfMovie.equals("Finish")){

                break;
            }

            int freeSeatsForEachScreening=Integer.parseInt(sc.nextLine());
            closedSeatsForEachScreening=0;

            while(true){

                /**
                 *
                 * Taxi
                 * 10
                 * standard
                 * kid
                 * student
                 * student
                 * standard
                 * standard
                 * End
                 * Scary Movie
                 * 6
                 * student
                 * student
                 * student
                 * student
                 * student
                 * student
                 * Finish
                 */
                String typeOfTicket= sc.nextLine();

                if(typeOfTicket.equals("End")){

                    break;
                }

                closedSeatsForEachScreening++;

                if(closedSeatsForEachScreening==freeSeatsForEachScreening){

                    break;
                }


            }


            double percentageOfTakenSeats=100.00*closedSeatsForEachScreening/freeSeatsForEachScreening;
            System.out.printf("%s - %.2f%% full.\n", titleOfMovie, percentageOfTakenSeats);

        }

        closedSeatsTotal+=closedSeatsForEachScreening;
        System.out.printf("Total tickets: %d\n", closedSeatsTotal);


    }
}
