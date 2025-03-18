import java.util.Scanner;

public class Zadatak_05_Judge_Exam_Preparation_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfEggsFirstPlayer=Integer.parseInt(sc.nextLine());
        int numberOfEggsSecondPlayer=Integer.parseInt(sc.nextLine());

        while(true){

            String winner=sc.nextLine();

            if(winner.equals("End")){

                System.out.printf("Player one has %d eggs left.\n", numberOfEggsFirstPlayer);
                System.out.printf("Player two has %d eggs left.", numberOfEggsSecondPlayer);
                break;
            }

            if(winner.equals("one")){

                numberOfEggsSecondPlayer--;
            }

            if(winner.equals("two")){

                numberOfEggsFirstPlayer--;
            }

            if(numberOfEggsFirstPlayer==0){

                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", numberOfEggsSecondPlayer);
                break;
            }

            if(numberOfEggsSecondPlayer==0){

                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", numberOfEggsFirstPlayer);
                break;
            }
        }


    }
}
