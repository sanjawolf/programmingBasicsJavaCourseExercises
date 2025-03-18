import java.util.Scanner;

public class Zadatak_82_Practice_82 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());
        int length=Integer.parseInt(sc.nextLine());

        int AREA_OF_PIECE=1;
        int areaOfCake=width*length;

        while(true){

            String numberOfPiecesGuestsTakeText=sc.nextLine();

            if(numberOfPiecesGuestsTakeText.equals("STOP")){

                break;
            }

            int numberOfPiecesGuestsTake =Integer.parseInt(numberOfPiecesGuestsTakeText);

            areaOfCake-=numberOfPiecesGuestsTake*AREA_OF_PIECE;

            if(areaOfCake<=0){

                int needed=Math.abs(areaOfCake);
                System.out.printf("No more cake left! You need %d pieces more.", needed);
                return;

            }


        }

            System.out.printf("%d pieces are left.",  areaOfCake);



    }
}
